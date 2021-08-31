package com.yinhai.common.webservice;


public class YinHaiResult {

    private String appmsg;

    private String appcode;

    public YinHaiResult(String appmsg, String appcode) {
        this.appmsg = appmsg;
        this.appcode = appcode;
    }

    public String getAppmsg() {
        return appmsg;
    }

    public void setAppmsg(String appmsg) {
        this.appmsg = appmsg;
    }

    public String getAppcode() {
        return appcode;
    }

    public void setAppcode(String appcode) {
        this.appcode = appcode;
    }

    @Override
    public String toString() {
        return "YinHaiResult{" +
                "appmsg='" + appmsg + '\'' +
                ", appcode='" + appcode + '\'' +
                '}';
    }
}
