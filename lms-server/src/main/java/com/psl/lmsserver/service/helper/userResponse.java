package com.psl.lmsserver.service.helper;

public class userResponse {
    private int id;
    private String Name;
    private String email;
    private String dept_name;
    private String senior_name;
    private String role_name;


    public userResponse() {
    }



    public userResponse(int id,String Name,String email,String dept_name,String senior_name,String role_name){
        this.id=id;
        this.Name=Name;
        this.email=email;
        this.dept_name=dept_name;
        this.senior_name=senior_name;
        this.role_name=role_name;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public String getSenior_name() {
        return senior_name;
    }

    public void setSenior_name(String senior_name) {
        this.senior_name = senior_name;
    }


    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }
}
