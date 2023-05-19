package com.fpoly.model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;


public class Staff {
    String id;

    @NotEmpty
    @Size(min = 20,  message = "{Size.Staff.FullName}")
    String fullname;

    Double salary;
    String email;
    
   public String getId() {
        return id;
   }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    public Double getSalary() {
        return salary;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    
}
