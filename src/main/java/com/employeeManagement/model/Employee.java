package com.employeeManagement.model;

import javax.persistence.*;

@Entity
@Table(name = "EMPLOYEE")
//@SequenceGenerator(name="EMPLOYEE_SEQUENCE", initialValue=1, allocationSize=1)
public class Employee {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="EMPLOYEE_SEQUENCE")
    @SequenceGenerator(name="EMPLOYEE_SEQUENCE", initialValue=1, allocationSize=1)
    private int id;

    @Column(name = "CODE")
    private String code;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESIGNATION")
    private  String designation;

    @Column(name = "DEPARTMENT")
    private String department;

    @Column(name = "ADDRESS")
    private  String address;


    public Employee() {

    }

    public Employee(int id, String code, String name, String designation, String department, String address) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.designation = designation;
        this.department = department;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}