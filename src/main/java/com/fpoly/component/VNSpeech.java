package com.fpoly.component;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.fpoly.model.Speech;
@Component
public class VNSpeech implements Speech {
    public String sayThankYou(){
        return "Cảm ơn bạn đã đến với FPT Polytechnic";
    }
}
