package com.codegym.model;

public class MailBox {
    private int id;
    private String language;
    private int pageSize;
    private String spamFileter;
    private String signature;

    public MailBox(){

    }

    public MailBox(int id, String language, int pageSize, String spamFileter, String signature) {
        this.id = id;
        this.language = language;
        this.pageSize = pageSize;
        this.spamFileter = spamFileter;
        this.signature = signature;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getSpamFileter() {
        return spamFileter;
    }

    public void setSpamFileter(String spamFileter) {
        this.spamFileter = spamFileter;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
