package com.fpoly.model;

import org.springframework.stereotype.Component;

@Component
public class Company {
    String name =  "FPT Polytechnic";
    String logo = "poly.png";
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLogo() {
        return logo;
    }
    public void setLogo(String logo) {
        this.logo = logo;
    }

    
}
