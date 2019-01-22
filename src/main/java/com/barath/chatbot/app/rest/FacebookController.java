package com.barath.chatbot.app.rest;


import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.facebook.api.Facebook;
import org.springframework.social.facebook.api.PagedList;
import org.springframework.social.facebook.api.Post;
import org.springframework.social.facebook.api.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;


@Controller
@RequestMapping("/")
public class FacebookController {


    private Facebook facebook;
    private ConnectionRepository connectionRepository;

    public FacebookController(ConnectionRepository connectionRepository,Facebook facebook) {
        this.facebook = facebook;
        this.connectionRepository = connectionRepository;
    }

    @GetMapping(value = "/")
    public String helloFacebook(Model model, HttpServletRequest request) {
        if (connectionRepository.findPrimaryConnection(Facebook.class) == null) {
            return "redirect:/connect/facebook";
        }

        Enumeration<String> headers=request.getHeaderNames();
        while(headers.hasMoreElements()){
            System.out.println(headers.nextElement());
        }
        String [] fields = { "id", "email",  "first_name", "last_name" };
        User userProfile = facebook.fetchObject("me", User.class, fields);
        System.out.println("user profile "+userProfile);
        model.addAttribute("facebookProfile", userProfile);
        PagedList<Post> feed = facebook.feedOperations().getFeed();
        model.addAttribute("feed", feed);
        return "hello";
    }



}
