package ie.gmit.sw.DS_Project;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Customer", propOrder = {
    "firstName",
    "lastName",
    "id",
    "insurance",
    "address"
})
public class Customer {

    @XmlElement(required = true)
    protected String firstName;
    
    @XmlElement(required = true)
    protected String lastName;
    
    @XmlElement(name = "ID")
    protected int id;
    
    @XmlElement(name = "true")
    protected int insurance;
    
    @XmlElement(required = true)
    protected String address;
    
    // getters and setters for element values

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String value) {
        this.firstName = value;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String value) {
        this.lastName = value;
    }

    public int getID() {
        return id;
    }

    
    public void setID(int value) {
        this.id = value;
    }

    public int getInsurance() {
        return insurance;
    }

    public void setInsurance(int value) {
        this.insurance = value;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String value) {
        this.address = value;
    }

}
