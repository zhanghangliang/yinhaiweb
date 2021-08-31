package com.yinhai.common.webservice;

public enum OperationEnum {

    confirmBusiness("HM0001"),
    callBusiness(""),
    callBusinessGzip(""),
    cancelBusinessGzip(""),
    getJylsh(""),
    queryBusiness("");

    OperationEnum(String operCode) {

    }

    private String operCode;

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }
}
