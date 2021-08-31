
package com.yinhai.common.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "queryBusiness", propOrder = {
    "inputxml"
})
public class QueryBusiness {

    protected String inputxml;

    /**
     *
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputxml() {
        return inputxml;
    }

    /**
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputxml(String value) {
        this.inputxml = value;
    }

}
