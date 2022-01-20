package com.mdevi.northwind.model;

import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name = "employees")
public class Employee implements Serializable {
    private static final long serialVersionUID = 7526472295622776147L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private Integer employeeid;

    @Column(name = "last_name", nullable = false)
    @Size(max = 20, min = 3, message = "{user.name.invalid}")
    @NotEmpty(message = "Please Enter your name")
    private String lastName;

    @Column(name = "first_name", nullable = false)
    @Size(max = 10, min = 3, message = "{user.name.invalid}")
    @NotEmpty(message = "Please Enter your name")
    private String firstName;

    @Column(name = "title")
    private String title;

    @Column(name = "title_of_courtesy")
    private String titleofcourtesy;

    @Column(name = "birth_date")
    @Temporal(TemporalType.DATE)
    private Date birthdate;

    public Employee() {
    }

    public Employee(String lastName, String firstName, String title) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.title = title;
    }

    public Integer getEmployeeid() {
        return employeeid;
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

    public String getTitleofcourtesy() {
        return titleofcourtesy;
    }

    public void setTitleofcourtesy(String titleofcourtesy) {
        this.titleofcourtesy = titleofcourtesy;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
}
