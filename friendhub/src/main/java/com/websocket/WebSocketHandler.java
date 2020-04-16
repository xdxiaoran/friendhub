package com.websocket;

import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.io.IOException;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import static com.fasterxml.jackson.databind.util.ISO8601Utils.format;

public class WebSocketHandler extends TextWebSocketHandler {


    // 已建立连接的用户
    private static final ArrayList<WebSocketSession> users = new ArrayList<WebSocketSession>();
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    /**
     * 处理前端发送的文本信息 js调用websocket.send时候，会调用该方法
     *
     * @param session
     * @param message
     * @throws Exception
     */
    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        Calendar c = Calendar.getInstance();
        String username = (String) session.getAttributes().get("WEBSOCKET_USERNAME");
        // 获取提交过来的消息详情
        System.out.println("收到用户 " + username + " 的消息:" + message.toString());
        // 分割成id和信息内容
        String[] messageInfo = message.getPayload().split(" ");
        if (messageInfo.length != 2) {
            sendMessageToUser(username, new TextMessage("500@服务器出错请稍后再发送吧"));
        } else {
            String target = messageInfo[0];
            String content = messageInfo[1];
            // 遍历所有已连接用户
            for (WebSocketSession user : users) {
                if (user.getAttributes().get("WEBSOCKET_USERNAME").equals(target)) {
                    //遇到匹配用户 连接正常则发送消息
                    if (user.isOpen()) {
                        sendMessageToUser(target, new TextMessage(username+":"+content+format(c.getTime())));
                    } else {//若异常则发送失败
                        sendMessageToUser(username, new TextMessage("404@对方在线异常,发送失败"));
                    }
                    return;
                }
            }
            //未找到匹配用户 发送失败
            sendMessageToUser(username, new TextMessage("404@对方暂时不在线"));
        }
    }

    /**
     * 当新连接建立的时候，被调用 连接成功时候，会触发页面上onOpen方法
     *
     * @param session
     * @throws Exception
     */
    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        users.add(session);
        String username = (String) session.getAttributes().get("WEBSOCKET_USERNAME");
        String from=(String) session.getAttributes().get("from");
//        System.out.println("离线消息发送人"+from);
        System.out.println("用户 " + username + " Connection Established");
        session.sendMessage(new TextMessage(username + " connect"));
//        session.sendMessage(new TextMessage(from+"给你发来了离线消息"));
    }
    /**
     * 当连接关闭时被调用
     *
     * @param session
     * @param status
     * @throws Exception
     */
    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        String username = (String) session.getAttributes().get("WEBSOCKET_USERNAME");
        System.out.println("用户 " + username + " Connection closed. Status: " + status);
        users.remove(session);
    }

    /**
     * 传输错误时调用
     *
     * @param session
     * @param exception
     * @throws Exception
     */
    @Override
    public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {
        String username = (String) session.getAttributes().get("WEBSOCKET_USERNAME");
        if (session.isOpen()) {
            session.close();
        }
        System.out.println("用户: " + username + " websocket connection closed......");
        users.remove(session);
    }

    /**
     * 给所有在线用户发送消息
     *
     * @param message
     */
    public void sendMessageToUsers(TextMessage message) {
        for (WebSocketSession user : users) {
            try {
                if (user.isOpen()) {
                    user.sendMessage(message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 给某个用户发送消息
     *
     * @param userName
     * @param message
     */
    public void sendMessageToUser(String userName, TextMessage message) {
        for (WebSocketSession user : users) {
            if (user.getAttributes().get("WEBSOCKET_USERNAME").equals(userName)) {
                try {
                    if (user.isOpen()) {
                        user.sendMessage(message);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            }
        }
    }
}