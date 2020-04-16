package com.controller;


import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import com.websocket.WebSocketHandler;

@Controller
public class WebsocketController {
    //    @Bean // 这个注解会从Spring容器拿出Bean
//    public WebSocketHandler infoHandler() {
//        return new WebSocketHandler();
//    }
//    @RequestMapping("login")
//    public String login(HttpSession session,String username) throws Exception {
//        System.out.println(username + "登录");
//        session.setAttribute("SESSION_USERNAME", username);
//
//        session.setAttribute("from","xiaohai");
//        return "websocketJsp";
//    }
//    @RequestMapping("conv")
//    public String test1(){
//        return "fore/myconversation";
//    }
//    @RequestMapping("register")
//    public String test3(){
//        return "fore/register";
//    }
//    @RequestMapping("home")
//    public String test4(){
//        return "fore/home";
//    }
//    @RequestMapping("info")
//    public String test5(){
//        return "fore/information";
//    }
//    @RequestMapping("login")
//    public String test6(){
//        return "fore/login";
//    }
//    @RequestMapping("edit")
//    public String test7(){
//        return "fore/editInformation";
//    }
//    @RequestMapping("concern")
//    public String test8(){
//        return "fore/concern";
//    }
//    @RequestMapping("news")
//    public String test9(){
//        return "fore/news";
//    }
//    @RequestMapping("search")
//    public String test10(){
//        return "fore/search";
//    }
//    @RequestMapping("concernme")
//    public String test11(){ return "fore/concernMe"; }
//}
}