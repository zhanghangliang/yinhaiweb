
package com.yinhai.common.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "callBusinessGzip", propOrder = {
    "inputByte"
})
public class CallBusinessGzip {

    protected byte[] inputByte;

    public byte[] getInputByte() {
        return inputByte;
    }

    public void setInputByte(byte[] value) {
        this.inputByte = value;
    }

}
