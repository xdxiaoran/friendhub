package com.websocket;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.HandshakeInterceptor;

import javax.servlet.http.HttpSession;
import java.util.Map;

public  class WebSocketHandshakeInterceptor implements HandshakeInterceptor {
    @Override
    public boolean beforeHandshake(org.springframework.http.server.ServerHttpRequest request, org.springframework.http.server.ServerHttpResponse serverHttpResponse, WebSocketHandler webSocketHandler, Map<String, Object> attributes ) throws Exception {
        if (request instanceof ServletServerHttpRequest) {
            ServletServerHttpRequest servletRequest = (ServletServerHttpRequest) request;
            HttpSession session = servletRequest.getServletRequest().getSession(false);
            if (session != null) {
                String userName = (String) session.getAttribute("SESSION_USERNAME");  //这边获得登录时设置的唯一用户标识
                String from=(String) session.getAttribute("from");
                System.out.println("beforeHandshake:"+"userName="+userName);
                if (userName == null) {
                    userName = "未知" + session.getId();
                }
                attributes.put("WEBSOCKET_USERNAME", userName);  //将用户标识放入参数列表后，下一步的websocket处理器可以读取这里面的数据
//                attributes.put("from",from);
            }
        }
        return true;
    }
    @Override
    public void afterHandshake(org.springframework.http.server.ServerHttpRequest serverHttpRequest, org.springframework.http.server.ServerHttpResponse serverHttpResponse, WebSocketHandler webSocketHandler, Exception e) {
        System.out.println("After Handshake");
    }
}

