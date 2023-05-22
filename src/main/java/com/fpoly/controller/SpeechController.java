package com.fpoly.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fpoly.model.Speech;

@Controller
public class SpeechController {
    @Autowired 
    @Qualifier("VNSpeech")
    Speech speech;

    @ResponseBody
    @GetMapping("/speak")
    public String speak(){
        return speech.sayThankYou();
    }
}
