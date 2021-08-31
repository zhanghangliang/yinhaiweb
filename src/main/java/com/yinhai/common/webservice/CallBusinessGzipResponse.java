
package com.yinhai.common.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "callBusinessGzipResponse", propOrder = {
    "_return"
})
public class CallBusinessGzipResponse {

    @XmlElement(name = "return")
    protected byte[] _return;

    /**
     *
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getReturn() {
        return _return;
    }

    /**
     *
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setReturn(byte[] value) {
        this._return = value;
    }

}
