package com.spring.doc.classes;

public class factoryMethod {
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    private String mail;
    private String pass;
    public static factoryMethod init() {
        factoryMethod tmp = new factoryMethod();
        tmp.mail = "anas.jaidi@icloud.com";
        tmp.pass = "pass";
        return tmp;
    }
}
