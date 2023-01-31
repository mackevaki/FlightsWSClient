
package com.mycompany.flights.interfaces.impls;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for place complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="place">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="busy" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="flightClass" type="{http://impls.interfaces.flights.mycompany.com/}flightClass" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="seatLetter" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="seatNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "place", propOrder = {
    "busy",
    "flightClass",
    "id",
    "seatLetter",
    "seatNumber"
})
public class Place {

    protected boolean busy;
    protected FlightClass flightClass;
    protected long id;
    @XmlSchemaType(name = "unsignedShort")
    protected int seatLetter;
    protected int seatNumber;

    /**
     * Gets the value of the busy property.
     * 
     */
    public boolean isBusy() {
        return busy;
    }

    /**
     * Sets the value of the busy property.
     * 
     */
    public void setBusy(boolean value) {
        this.busy = value;
    }

    /**
     * Gets the value of the flightClass property.
     * 
     * @return
     *     possible object is
     *     {@link FlightClass }
     *     
     */
    public FlightClass getFlightClass() {
        return flightClass;
    }

    /**
     * Sets the value of the flightClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightClass }
     *     
     */
    public void setFlightClass(FlightClass value) {
        this.flightClass = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the seatLetter property.
     * 
     */
    public int getSeatLetter() {
        return seatLetter;
    }

    /**
     * Sets the value of the seatLetter property.
     * 
     */
    public void setSeatLetter(int value) {
        this.seatLetter = value;
    }

    /**
     * Gets the value of the seatNumber property.
     * 
     */
    public int getSeatNumber() {
        return seatNumber;
    }

    /**
     * Sets the value of the seatNumber property.
     * 
     */
    public void setSeatNumber(int value) {
        this.seatNumber = value;
    }

}
