package com.example.wf;

public enum EventTypeEnum {
    //系统级
    Create("000000", "Create"),
    SYS_ERROR("999999", "系统异常"),
    FAILED("900000", "操作失败！"),
    //交易部分
    OWNER_NOT_EXIST("500002", "用户（车主）不存在"),
    ;

    private String code;
    private String text;

    private EventTypeEnum(String code, String text) {
        this.code = code;
        this.text = text;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {

        this.text = text;
    }

}