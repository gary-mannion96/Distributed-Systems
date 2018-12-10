//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1-b171012.0423 
//         See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2018.12.10 at 08:48:00 PM GMT 
//


package ie.gmit.sw.Model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="booking_ID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="start_date" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="end_date" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="carmake" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="carreg" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bookingID",
    "name",
    "startDate",
    "endDate",
    "carmake",
    "carreg"
})
@XmlRootElement(name = "bookings")
public class Bookings implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Bookings() {
		super();
	}

	public Bookings(int bookingID, String name, String startDate, String endDate, String carmake, String carreg) {
		super();
		this.bookingID = bookingID;
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.carmake = carmake;
		this.carreg = carreg;
	}

	@XmlElement(name = "booking_ID")
    protected int bookingID;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(name = "start_date", required = true)
    protected String startDate;
    @XmlElement(name = "end_date", required = true)
    protected String endDate;
    @XmlElement(required = true)
    protected String carmake;
    @XmlElement(required = true)
    protected String carreg;

    /**
     * Gets the value of the bookingID property.
     * 
     */
    public int getBookingID() {
        return bookingID;
    }

    /**
     * Sets the value of the bookingID property.
     * 
     */
    public void setBookingID(int value) {
        this.bookingID = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the carmake property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarmake() {
        return carmake;
    }

    /**
     * Sets the value of the carmake property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarmake(String value) {
        this.carmake = value;
    }

    /**
     * Gets the value of the carreg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarreg() {
        return carreg;
    }

    /**
     * Sets the value of the carreg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarreg(String value) {
        this.carreg = value;
    }

}
