package com.mdevi.northwind.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "customers")
public class Customer implements Serializable {
    private static final long serialVersionUID = 7526472295622776141L;

    @Id
    @Column(name = "customerid", columnDefinition = "char(5)", nullable = false, length = 5)
    @NotNull
    @Pattern(regexp = "^.{5}$", message = "{Customer.validation.pattern.customerId}")
    private String customerid;

    @Column(name = "companyname")
    @Size(min = 2, max = 40, message = "{Customer.validation.size.companyname}")
    private String companyname;

    @Column(name = "contactname")
    @Size(min = 2, max = 30, message = ("Customer.validation.size.contactname"))
    private String contactname;

    @Column(name = "contacttitle")
    @Size(min = 2, max = 30, message = "{Customer.validation.size.contacttitle}")
    private String contacttitle;

    @Column(name = "address")
    @Size(min = 2, max = 60, message = "{Customer.validation.size.address}")
    private String address;

    @Column(name = "city")
    @Size(min = 2, max = 15, message = "{Customer.validation.size.city}")
    private String city;

    @Column(name = "region")
    @Size(min = 0, max = 15, message = "{Customer.validation.size.region}")
    private String region;

    @Column(name = "postalcode")
    @Size(min = 5, max = 10, message = "{Customer.validation.size.postalcode}")
    private String postalcode;

    @Column(name = "country")
    @Size(min = 2, max = 15, message = "{Customer.validation.size.country}")
    private String country;

    @Column(name = "phone")
    @Size(min = 0, max = 24, message = "{Customer.validation.size.phone}")
    private String phone;

    @Column(name = "fax")
    @Size(min = 0, max = 24, message = "{Customer.validation.size.fax}")
    private String fax;

    public Customer() {
    }

    public Customer(String customerid, String companyname, String contactname, String contacttitle, String address, String city, String country) {
        this.customerid = customerid;
        this.companyname = companyname;
        this.contactname = contactname;
        this.contacttitle = contacttitle;
        this.address = address;
        this.city = city;
        this.country = country;
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getContactname() {
        return contactname;
    }

    public void setContactname(String contactname) {
        this.contactname = contactname;
    }

    public String getContacttitle() {
        return contacttitle;
    }

    public void setContacttitle(String contacttitle) {
        this.contacttitle = contacttitle;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "companyname='" + companyname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(getCompanyname(), customer.getCompanyname()) &&
                Objects.equals(getCity(), customer.getCity()) &&
                Objects.equals(getCountry(), customer.getCountry());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getCompanyname(), getCity(), getCountry());
    }
}
