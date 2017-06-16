package com.zxp.listviewchartbubble;

/**
 * Created by xiaoxin on 2017/6/16.
 */

public class Message {
    private int userid;
    private String content;
    public Message() {
    }


    public Message(int userid, String content) {
        this.userid = userid;
        this.content = content;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
