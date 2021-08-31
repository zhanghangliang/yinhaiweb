
package com.yinhai.common.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.yinhai.common.webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CallBusiness_QNAME = new QName("http://webservice.common.yinhai.com/", "callBusiness");
    private final static QName _CallBusinessGzip_QNAME = new QName("http://webservice.common.yinhai.com/", "callBusinessGzip");
    private final static QName _CallBusinessGzipResponse_QNAME = new QName("http://webservice.common.yinhai.com/", "callBusinessGzipResponse");
    private final static QName _CallBusinessResponse_QNAME = new QName("http://webservice.common.yinhai.com/", "callBusinessResponse");
    private final static QName _CancelBusiness_QNAME = new QName("http://webservice.common.yinhai.com/", "cancelBusiness");
    private final static QName _CancelBusinessResponse_QNAME = new QName("http://webservice.common.yinhai.com/", "cancelBusinessResponse");
    private final static QName _ConfirmBusiness_QNAME = new QName("http://webservice.common.yinhai.com/", "confirmBusiness");
    private final static QName _ConfirmBusinessResponse_QNAME = new QName("http://webservice.common.yinhai.com/", "confirmBusinessResponse");
    private final static QName _GetJylsh_QNAME = new QName("http://webservice.common.yinhai.com/", "getJylsh");
    private final static QName _GetJylshResponse_QNAME = new QName("http://webservice.common.yinhai.com/", "getJylshResponse");
    private final static QName _QueryBusiness_QNAME = new QName("http://webservice.common.yinhai.com/", "queryBusiness");
    private final static QName _QueryBusinessResponse_QNAME = new QName("http://webservice.common.yinhai.com/", "queryBusinessResponse");
    private final static QName _UnsupportedEncodingException_QNAME = new QName("http://webservice.common.yinhai.com/", "UnsupportedEncodingException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.yinhai.common.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CallBusiness }
     * 
     */
    public CallBusiness createCallBusiness() {
        return new CallBusiness();
    }

    /**
     * Create an instance of {@link CallBusinessGzip }
     * 
     */
    public CallBusinessGzip createCallBusinessGzip() {
        return new CallBusinessGzip();
    }

    /**
     * Create an instance of {@link CallBusinessGzipResponse }
     * 
     */
    public CallBusinessGzipResponse createCallBusinessGzipResponse() {
        return new CallBusinessGzipResponse();
    }

    /**
     * Create an instance of {@link CallBusinessResponse }
     * 
     */
    public CallBusinessResponse createCallBusinessResponse() {
        return new CallBusinessResponse();
    }

    /**
     * Create an instance of {@link CancelBusiness }
     * 
     */
    public CancelBusiness createCancelBusiness() {
        return new CancelBusiness();
    }

    /**
     * Create an instance of {@link CancelBusinessResponse }
     * 
     */
    public CancelBusinessResponse createCancelBusinessResponse() {
        return new CancelBusinessResponse();
    }

    /**
     * Create an instance of {@link ConfirmBusiness }
     * 
     */
    public ConfirmBusiness createConfirmBusiness() {
        return new ConfirmBusiness();
    }

    /**
     * Create an instance of {@link ConfirmBusinessResponse }
     * 
     */
    public ConfirmBusinessResponse createConfirmBusinessResponse() {
        return new ConfirmBusinessResponse();
    }

    /**
     * Create an instance of {@link GetJylsh }
     * 
     */
    public GetJylsh createGetJylsh() {
        return new GetJylsh();
    }

    /**
     * Create an instance of {@link GetJylshResponse }
     * 
     */
    public GetJylshResponse createGetJylshResponse() {
        return new GetJylshResponse();
    }

    /**
     * Create an instance of {@link QueryBusiness }
     * 
     */
    public QueryBusiness createQueryBusiness() {
        return new QueryBusiness();
    }

    /**
     * Create an instance of {@link QueryBusinessResponse }
     * 
     */
    public QueryBusinessResponse createQueryBusinessResponse() {
        return new QueryBusinessResponse();
    }

    /**
     * Create an instance of {@link UnsupportedEncodingException }
     * 
     */
    public UnsupportedEncodingException createUnsupportedEncodingException() {
        return new UnsupportedEncodingException();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallBusiness }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CallBusiness }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.common.yinhai.com/", name = "callBusiness")
    public JAXBElement<CallBusiness> createCallBusiness(CallBusiness value) {
        return new JAXBElement<CallBusiness>(_CallBusiness_QNAME, CallBusiness.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallBusinessGzip }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CallBusinessGzip }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.common.yinhai.com/", name = "callBusinessGzip")
    public JAXBElement<CallBusinessGzip> createCallBusinessGzip(CallBusinessGzip value) {
        return new JAXBElement<CallBusinessGzip>(_CallBusinessGzip_QNAME, CallBusinessGzip.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallBusinessGzipResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CallBusinessGzipResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.common.yinhai.com/", name = "callBusinessGzipResponse")
    public JAXBElement<CallBusinessGzipResponse> createCallBusinessGzipResponse(CallBusinessGzipResponse value) {
        return new JAXBElement<CallBusinessGzipResponse>(_CallBusinessGzipResponse_QNAME, CallBusinessGzipResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallBusinessResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CallBusinessResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.common.yinhai.com/", name = "callBusinessResponse")
    public JAXBElement<CallBusinessResponse> createCallBusinessResponse(CallBusinessResponse value) {
        return new JAXBElement<CallBusinessResponse>(_CallBusinessResponse_QNAME, CallBusinessResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelBusiness }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CancelBusiness }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.common.yinhai.com/", name = "cancelBusiness")
    public JAXBElement<CancelBusiness> createCancelBusiness(CancelBusiness value) {
        return new JAXBElement<CancelBusiness>(_CancelBusiness_QNAME, CancelBusiness.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelBusinessResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CancelBusinessResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.common.yinhai.com/", name = "cancelBusinessResponse")
    public JAXBElement<CancelBusinessResponse> createCancelBusinessResponse(CancelBusinessResponse value) {
        return new JAXBElement<CancelBusinessResponse>(_CancelBusinessResponse_QNAME, CancelBusinessResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfirmBusiness }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConfirmBusiness }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.common.yinhai.com/", name = "confirmBusiness")
    public JAXBElement<ConfirmBusiness> createConfirmBusiness(ConfirmBusiness value) {
        return new JAXBElement<ConfirmBusiness>(_ConfirmBusiness_QNAME, ConfirmBusiness.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfirmBusinessResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConfirmBusinessResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.common.yinhai.com/", name = "confirmBusinessResponse")
    public JAXBElement<ConfirmBusinessResponse> createConfirmBusinessResponse(ConfirmBusinessResponse value) {
        return new JAXBElement<ConfirmBusinessResponse>(_ConfirmBusinessResponse_QNAME, ConfirmBusinessResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetJylsh }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetJylsh }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.common.yinhai.com/", name = "getJylsh")
    public JAXBElement<GetJylsh> createGetJylsh(GetJylsh value) {
        return new JAXBElement<GetJylsh>(_GetJylsh_QNAME, GetJylsh.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetJylshResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetJylshResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.common.yinhai.com/", name = "getJylshResponse")
    public JAXBElement<GetJylshResponse> createGetJylshResponse(GetJylshResponse value) {
        return new JAXBElement<GetJylshResponse>(_GetJylshResponse_QNAME, GetJylshResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryBusiness }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QueryBusiness }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.common.yinhai.com/", name = "queryBusiness")
    public JAXBElement<QueryBusiness> createQueryBusiness(QueryBusiness value) {
        return new JAXBElement<QueryBusiness>(_QueryBusiness_QNAME, QueryBusiness.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryBusinessResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QueryBusinessResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.common.yinhai.com/", name = "queryBusinessResponse")
    public JAXBElement<QueryBusinessResponse> createQueryBusinessResponse(QueryBusinessResponse value) {
        return new JAXBElement<QueryBusinessResponse>(_QueryBusinessResponse_QNAME, QueryBusinessResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnsupportedEncodingException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnsupportedEncodingException }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.common.yinhai.com/", name = "UnsupportedEncodingException")
    public JAXBElement<UnsupportedEncodingException> createUnsupportedEncodingException(UnsupportedEncodingException value) {
        return new JAXBElement<UnsupportedEncodingException>(_UnsupportedEncodingException_QNAME, UnsupportedEncodingException.class, null, value);
    }

}
