package com.cts.model;
 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String dno;
    private String street;
    private String location;
    private String landmark;
    private String city;
    private String state;
    private String pincode;
 
    public Address() {
        this.id = 0;
        this.dno = null;
        this.street = null;
        this.location = null;
        this.landmark = null;
        this.city = null;
        this.state = null;
        this.pincode = null;
    }
 
    public Address(int id, String dno, String street, String location, String landmark, String city, String state,
            String pincode) {
        this.id = id;
        this.dno = dno;
        this.street = street;
        this.location = location;
        this.landmark = landmark;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }
 
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    public String getDno() {
        return dno;
    }
 
    public void setDon(String dno) {
        this.dno = dno;
    }
 
    public String getStreet() {
        return street;
    }
 
    public void setStreet(String street) {
        this.street = street;
    }
 
    public String getLocation() {
        return location;
    }
 
    public void setLocation(String location) {
        this.location = location;
    }
 
    public String getLandmark() {
        return landmark;
    }
 
    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }
 
    public String getCity() {
        return city;
    }
 
    public void setCity(String city) {
        this.city = city;
    }
 
    public String getState() {
        return state;
    }
 
    public void setState(String state) {
        this.state = state;
    }
 
    public String getPincode() {
        return pincode;
    }
 
    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
 
    @Override
    public String toString() {
        return "Address [id=" + id + ", don=" + dno + ", street=" + street + ", location=" + location + ", landmark="
                + landmark + ", city=" + city + ", state=" + state + ", pincode=" + pincode  + "]";
    }
 
 
 
}