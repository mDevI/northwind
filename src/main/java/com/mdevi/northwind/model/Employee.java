package com.mdevi.northwind.model;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

//TODO: Create class for employee.
@Entity
@Table(name = "employees")
public class Employee implements Serializable {
    private static final long serialVersionUID = 7526472295622776147L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employeeid")
    private long employeeid;

    @Column(name = "lastname", nullable = false)
    @Size(min = 2, max = 20, message = "{user.name.invalid}")
    private String lastName;

    @Column(name = "firstname", nullable = false)
    @Size(min = 1, max = 10, message = "{user.name.invalid}")
    private String firstName;

    @Column(name = "title")
    private String title;

    @Column(name = "titleofcortesy")
    private String titleofCourtesy;

    @Column(name = "birthdate")
    @Temporal(TemporalType.DATE)
    private Date birthDate;

    @Column(name = "hiredate")
    @Temporal(TemporalType.DATE)
    private Date hireDate;

    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "region")
    private String region;

    @Column(name = "postalcode")
    private String postalCode;

    @Column(name = "country")
    private String country;

    @Column(name = "homephone")
    @Digits(integer = 10, fraction = 0)
    private String homephone;

    @Column(name = "extension")
    private String extension;

    @Column(name = "photo")
    @Lob
    private byte[] photo;

    @Column(name = "notes")
    private String notes;

    public Employee() {
    }

    public Employee(String lastName, String firstName, String titleofCourtesy, Date birthDate) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.titleofCourtesy = titleofCourtesy;
        this.birthDate = birthDate;
    }

    public long getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(long employeeid) {
        this.employeeid = employeeid;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitleofCourtesy() {
        return titleofCourtesy;
    }

    public void setTitleofCourtesy(String titleofCourtesy) {
        this.titleofCourtesy = titleofCourtesy;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
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

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getHomephone() {
        return homephone;
    }

    public void setHomephone(String homephone) {
        this.homephone = homephone;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
