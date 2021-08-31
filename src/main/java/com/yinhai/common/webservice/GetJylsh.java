
package com.yinhai.common.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getJylsh", propOrder = {
    "inputxml"
})
public class GetJylsh {

    protected String inputxml;

    public String getInputxml() {
        return inputxml;
    }

    public void setInputxml(String value) {
        this.inputxml = value;
    }

}
