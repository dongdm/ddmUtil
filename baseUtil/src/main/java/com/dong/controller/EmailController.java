package com.dong.controller;

import com.dong.service.EmailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dong on 2017/4/25.
 */
@RestController
public class EmailController {

    @Autowired
    private EmailSender emailSender;

    @RequestMapping("/sendEmail")
    public String sendEmail(){
        String to = "dongdingming@sina.cn";
        try{
            emailSender.sender(to, "测试", "测试", false);
        }catch (Exception e){
            return e.getMessage();
        }
        return "success";
    }

}
