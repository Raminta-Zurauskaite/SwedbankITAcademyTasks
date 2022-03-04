package com.itacademy.java.oop.basics;

public class Employee {
    private String name;
    private String surname;
    private ContractType contractType;
    private String contractStartDate;
    private double salary;
    private Position position;

    public Employee(){

    }

    public Employee(String name, String surname, ContractType contractType, String contractStartDate, double salary, Position position){
        this.name=name;
        this.surname=surname;
        this.contractType=contractType;
        this.contractStartDate=contractStartDate;
        this.salary=salary;
        this.position=position;
    }

    public Employee(String surname){
        this.surname=surname;
    }

    public String getName() {
        return name;
    }

    public ContractType getContractType() {
        return contractType;
    }

    public String getSurname() {
        return surname;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setContractType (ContractType contractType) {
        this.contractType = contractType;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", contractType=" + contractType +
                ", contractStartDate='" + contractStartDate + '\'' +
                ", salary=" + salary +
                ", position=" + position +
                '}';
    }
}
