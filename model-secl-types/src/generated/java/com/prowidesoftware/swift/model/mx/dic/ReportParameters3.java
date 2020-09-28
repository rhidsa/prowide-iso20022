
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides the parameters of the report.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportParameters3", propOrder = {
    "rptId",
    "rptDtAndTm",
    "rptCcy",
    "clctnDtAndTm",
    "frqcy",
    "rptNb"
})
public class ReportParameters3 {

    @XmlElement(name = "RptId", required = true)
    protected String rptId;
    @XmlElement(name = "RptDtAndTm", required = true)
    protected DateAndDateTimeChoice rptDtAndTm;
    @XmlElement(name = "RptCcy", required = true)
    protected String rptCcy;
    @XmlElement(name = "ClctnDtAndTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar clctnDtAndTm;
    @XmlElement(name = "Frqcy", required = true)
    @XmlSchemaType(name = "string")
    protected EventFrequency6Code frqcy;
    @XmlElement(name = "RptNb")
    protected String rptNb;

    /**
     * Gets the value of the rptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptId() {
        return rptId;
    }

    /**
     * Sets the value of the rptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReportParameters3 setRptId(String value) {
        this.rptId = value;
        return this;
    }

    /**
     * Gets the value of the rptDtAndTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getRptDtAndTm() {
        return rptDtAndTm;
    }

    /**
     * Sets the value of the rptDtAndTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public ReportParameters3 setRptDtAndTm(DateAndDateTimeChoice value) {
        this.rptDtAndTm = value;
        return this;
    }

    /**
     * Gets the value of the rptCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptCcy() {
        return rptCcy;
    }

    /**
     * Sets the value of the rptCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReportParameters3 setRptCcy(String value) {
        this.rptCcy = value;
        return this;
    }

    /**
     * Gets the value of the clctnDtAndTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClctnDtAndTm() {
        return clctnDtAndTm;
    }

    /**
     * Sets the value of the clctnDtAndTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public ReportParameters3 setClctnDtAndTm(XMLGregorianCalendar value) {
        this.clctnDtAndTm = value;
        return this;
    }

    /**
     * Gets the value of the frqcy property.
     * 
     * @return
     *     possible object is
     *     {@link EventFrequency6Code }
     *     
     */
    public EventFrequency6Code getFrqcy() {
        return frqcy;
    }

    /**
     * Sets the value of the frqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventFrequency6Code }
     *     
     */
    public ReportParameters3 setFrqcy(EventFrequency6Code value) {
        this.frqcy = value;
        return this;
    }

    /**
     * Gets the value of the rptNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptNb() {
        return rptNb;
    }

    /**
     * Sets the value of the rptNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReportParameters3 setRptNb(String value) {
        this.rptNb = value;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

}