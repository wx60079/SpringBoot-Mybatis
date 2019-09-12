package com.beilin.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class IDCard {

    private int uid;
    private long cardId;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date beginTime;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date endTime;
    private User user;


    public User getStudent() {
        return user;
    }
    public void setStudent(User user) {
        this.user = user;
    }
    public int getUid() {
        return uid;
    }
    public void setUid(int uid) {
        this.uid = uid;
    }
    public long getCardId() {
        return cardId;
    }
    public void setCardId(long cardId) {
        this.cardId = cardId;
    }
    public Date getBeginTime() {
        return beginTime;
    }
    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }
    public Date getEndTime() {
        return endTime;
    }
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }


}