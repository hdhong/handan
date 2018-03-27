
package net.pingfang.webservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;


/**
 * <p>tCymJcm complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="tCymJcm"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="blbz1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="blbz2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="blzd1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="blzd2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cmcd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cmcp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cmczry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cmfs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cmjzxh1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cmjzxh2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cmrqsj" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="cmsmbj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cmtplj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cmxk1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cmxk2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="createuser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="czdbm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="czmc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cztms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="delflag" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="gbzl1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="gbzl2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jcmbz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jmcd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jmcp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jmczry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jmfs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jmjzxh1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jmjzxh2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jmrqsj" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="jmsmbj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jmtplj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jmxk1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jmxk2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastModifyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastModifyTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="lrrq" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="modifydate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="modifyuser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="smkh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wqcmczry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wqcmrqsj" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="wqjmczry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wqjmrqsj" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="wqqrbj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wqzydd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tCymJcm", propOrder = {
    "blbz1",
    "blbz2",
    "blzd1",
    "blzd2",
    "cmcd",
    "cmcp",
    "cmczry",
    "cmfs",
    "cmjzxh1",
    "cmjzxh2",
    "cmrqsj",
    "cmsmbj",
    "cmtplj",
    "cmxk1",
    "cmxk2",
    "createdate",
    "createuser",
    "czdbm",
    "czmc",
    "cztms",
    "delflag",
    "gbzl1",
    "gbzl2",
    "id",
    "jcmbz",
    "jmcd",
    "jmcp",
    "jmczry",
    "jmfs",
    "jmjzxh1",
    "jmjzxh2",
    "jmrqsj",
    "jmsmbj",
    "jmtplj",
    "jmxk1",
    "jmxk2",
    "lastModifyName",
    "lastModifyTime",
    "lrrq",
    "modifydate",
    "modifyuser",
    "smkh",
    "wqcmczry",
    "wqcmrqsj",
    "wqjmczry",
    "wqjmrqsj",
    "wqqrbj",
    "wqzydd"
})
public class TCymJcm {

    protected String blbz1;
    protected String blbz2;
    protected String blzd1;
    protected String blzd2;
    protected String cmcd;
    protected String cmcp;
    protected String cmczry;
    protected String cmfs;
    protected String cmjzxh1;
    protected String cmjzxh2;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cmrqsj;
    protected String cmsmbj;
    protected String cmtplj;
    protected String cmxk1;
    protected String cmxk2;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdate;
    protected String createuser;
    protected String czdbm;
    protected String czmc;
    protected String cztms;
    protected Short delflag;
    protected BigDecimal gbzl1;
    protected BigDecimal gbzl2;
    protected String id;
    protected String jcmbz;
    protected String jmcd;
    protected String jmcp;
    protected String jmczry;
    protected String jmfs;
    protected String jmjzxh1;
    protected String jmjzxh2;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar jmrqsj;
    protected String jmsmbj;
    protected String jmtplj;
    protected String jmxk1;
    protected String jmxk2;
    protected String lastModifyName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifyTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lrrq;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifydate;
    protected String modifyuser;
    protected String smkh;
    protected String wqcmczry;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar wqcmrqsj;
    protected String wqjmczry;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar wqjmrqsj;
    protected String wqqrbj;
    protected String wqzydd;

    /**
     * ��ȡblbz1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlbz1() {
        return blbz1;
    }

    /**
     * ����blbz1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlbz1(String value) {
        this.blbz1 = value;
    }

    /**
     * ��ȡblbz2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlbz2() {
        return blbz2;
    }

    /**
     * ����blbz2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlbz2(String value) {
        this.blbz2 = value;
    }

    /**
     * ��ȡblzd1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlzd1() {
        return blzd1;
    }

    /**
     * ����blzd1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlzd1(String value) {
        this.blzd1 = value;
    }

    /**
     * ��ȡblzd2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlzd2() {
        return blzd2;
    }

    /**
     * ����blzd2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlzd2(String value) {
        this.blzd2 = value;
    }

    /**
     * ��ȡcmcd���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmcd() {
        return cmcd;
    }

    /**
     * ����cmcd���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmcd(String value) {
        this.cmcd = value;
    }

    /**
     * ��ȡcmcp���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmcp() {
        return cmcp;
    }

    /**
     * ����cmcp���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmcp(String value) {
        this.cmcp = value;
    }

    /**
     * ��ȡcmczry���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmczry() {
        return cmczry;
    }

    /**
     * ����cmczry���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmczry(String value) {
        this.cmczry = value;
    }

    /**
     * ��ȡcmfs���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmfs() {
        return cmfs;
    }

    /**
     * ����cmfs���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmfs(String value) {
        this.cmfs = value;
    }

    /**
     * ��ȡcmjzxh1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmjzxh1() {
        return cmjzxh1;
    }

    /**
     * ����cmjzxh1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmjzxh1(String value) {
        this.cmjzxh1 = value;
    }

    /**
     * ��ȡcmjzxh2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmjzxh2() {
        return cmjzxh2;
    }

    /**
     * ����cmjzxh2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmjzxh2(String value) {
        this.cmjzxh2 = value;
    }

    /**
     * ��ȡcmrqsj���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCmrqsj() {
        return cmrqsj;
    }

    /**
     * ����cmrqsj���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCmrqsj(XMLGregorianCalendar value) {
        this.cmrqsj = value;
    }

    /**
     * ��ȡcmsmbj���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmsmbj() {
        return cmsmbj;
    }

    /**
     * ����cmsmbj���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmsmbj(String value) {
        this.cmsmbj = value;
    }

    /**
     * ��ȡcmtplj���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmtplj() {
        return cmtplj;
    }

    /**
     * ����cmtplj���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmtplj(String value) {
        this.cmtplj = value;
    }

    /**
     * ��ȡcmxk1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmxk1() {
        return cmxk1;
    }

    /**
     * ����cmxk1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmxk1(String value) {
        this.cmxk1 = value;
    }

    /**
     * ��ȡcmxk2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmxk2() {
        return cmxk2;
    }

    /**
     * ����cmxk2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmxk2(String value) {
        this.cmxk2 = value;
    }

    /**
     * ��ȡcreatedate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedate() {
        return createdate;
    }

    /**
     * ����createdate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedate(XMLGregorianCalendar value) {
        this.createdate = value;
    }

    /**
     * ��ȡcreateuser���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateuser() {
        return createuser;
    }

    /**
     * ����createuser���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateuser(String value) {
        this.createuser = value;
    }

    /**
     * ��ȡczdbm���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCzdbm() {
        return czdbm;
    }

    /**
     * ����czdbm���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCzdbm(String value) {
        this.czdbm = value;
    }

    /**
     * ��ȡczmc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCzmc() {
        return czmc;
    }

    /**
     * ����czmc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCzmc(String value) {
        this.czmc = value;
    }

    /**
     * ��ȡcztms���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCztms() {
        return cztms;
    }

    /**
     * ����cztms���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCztms(String value) {
        this.cztms = value;
    }

    /**
     * ��ȡdelflag���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getDelflag() {
        return delflag;
    }

    /**
     * ����delflag���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setDelflag(Short value) {
        this.delflag = value;
    }

    /**
     * ��ȡgbzl1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGbzl1() {
        return gbzl1;
    }

    /**
     * ����gbzl1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGbzl1(BigDecimal value) {
        this.gbzl1 = value;
    }

    /**
     * ��ȡgbzl2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGbzl2() {
        return gbzl2;
    }

    /**
     * ����gbzl2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGbzl2(BigDecimal value) {
        this.gbzl2 = value;
    }

    /**
     * ��ȡid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * ����id���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * ��ȡjcmbz���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJcmbz() {
        return jcmbz;
    }

    /**
     * ����jcmbz���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJcmbz(String value) {
        this.jcmbz = value;
    }

    /**
     * ��ȡjmcd���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJmcd() {
        return jmcd;
    }

    /**
     * ����jmcd���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJmcd(String value) {
        this.jmcd = value;
    }

    /**
     * ��ȡjmcp���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJmcp() {
        return jmcp;
    }

    /**
     * ����jmcp���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJmcp(String value) {
        this.jmcp = value;
    }

    /**
     * ��ȡjmczry���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJmczry() {
        return jmczry;
    }

    /**
     * ����jmczry���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJmczry(String value) {
        this.jmczry = value;
    }

    /**
     * ��ȡjmfs���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJmfs() {
        return jmfs;
    }

    /**
     * ����jmfs���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJmfs(String value) {
        this.jmfs = value;
    }

    /**
     * ��ȡjmjzxh1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJmjzxh1() {
        return jmjzxh1;
    }

    /**
     * ����jmjzxh1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJmjzxh1(String value) {
        this.jmjzxh1 = value;
    }

    /**
     * ��ȡjmjzxh2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJmjzxh2() {
        return jmjzxh2;
    }

    /**
     * ����jmjzxh2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJmjzxh2(String value) {
        this.jmjzxh2 = value;
    }

    /**
     * ��ȡjmrqsj���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getJmrqsj() {
        return jmrqsj;
    }

    /**
     * ����jmrqsj���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setJmrqsj(XMLGregorianCalendar value) {
        this.jmrqsj = value;
    }

    /**
     * ��ȡjmsmbj���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJmsmbj() {
        return jmsmbj;
    }

    /**
     * ����jmsmbj���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJmsmbj(String value) {
        this.jmsmbj = value;
    }

    /**
     * ��ȡjmtplj���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJmtplj() {
        return jmtplj;
    }

    /**
     * ����jmtplj���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJmtplj(String value) {
        this.jmtplj = value;
    }

    /**
     * ��ȡjmxk1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJmxk1() {
        return jmxk1;
    }

    /**
     * ����jmxk1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJmxk1(String value) {
        this.jmxk1 = value;
    }

    /**
     * ��ȡjmxk2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJmxk2() {
        return jmxk2;
    }

    /**
     * ����jmxk2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJmxk2(String value) {
        this.jmxk2 = value;
    }

    /**
     * ��ȡlastModifyName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastModifyName() {
        return lastModifyName;
    }

    /**
     * ����lastModifyName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModifyName(String value) {
        this.lastModifyName = value;
    }

    /**
     * ��ȡlastModifyTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifyTime() {
        return lastModifyTime;
    }

    /**
     * ����lastModifyTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifyTime(XMLGregorianCalendar value) {
        this.lastModifyTime = value;
    }

    /**
     * ��ȡlrrq���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLrrq() {
        return lrrq;
    }

    /**
     * ����lrrq���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLrrq(XMLGregorianCalendar value) {
        this.lrrq = value;
    }

    /**
     * ��ȡmodifydate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModifydate() {
        return modifydate;
    }

    /**
     * ����modifydate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModifydate(XMLGregorianCalendar value) {
        this.modifydate = value;
    }

    /**
     * ��ȡmodifyuser���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifyuser() {
        return modifyuser;
    }

    /**
     * ����modifyuser���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifyuser(String value) {
        this.modifyuser = value;
    }

    /**
     * ��ȡsmkh���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmkh() {
        return smkh;
    }

    /**
     * ����smkh���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmkh(String value) {
        this.smkh = value;
    }

    /**
     * ��ȡwqcmczry���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWqcmczry() {
        return wqcmczry;
    }

    /**
     * ����wqcmczry���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWqcmczry(String value) {
        this.wqcmczry = value;
    }

    /**
     * ��ȡwqcmrqsj���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWqcmrqsj() {
        return wqcmrqsj;
    }

    /**
     * ����wqcmrqsj���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWqcmrqsj(XMLGregorianCalendar value) {
        this.wqcmrqsj = value;
    }

    /**
     * ��ȡwqjmczry���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWqjmczry() {
        return wqjmczry;
    }

    /**
     * ����wqjmczry���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWqjmczry(String value) {
        this.wqjmczry = value;
    }

    /**
     * ��ȡwqjmrqsj���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWqjmrqsj() {
        return wqjmrqsj;
    }

    /**
     * ����wqjmrqsj���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWqjmrqsj(XMLGregorianCalendar value) {
        this.wqjmrqsj = value;
    }

    /**
     * ��ȡwqqrbj���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWqqrbj() {
        return wqqrbj;
    }

    /**
     * ����wqqrbj���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWqqrbj(String value) {
        this.wqqrbj = value;
    }

    /**
     * ��ȡwqzydd���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWqzydd() {
        return wqzydd;
    }

    /**
     * ����wqzydd���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWqzydd(String value) {
        this.wqzydd = value;
    }

}
