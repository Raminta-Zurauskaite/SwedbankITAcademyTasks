package com.itacademy.java.oop.basics;

public class EmployeeManager {

    public static void main(String[] args) {
        Employee employee = new Employee("Jon", "Doe", ContractType.FULLTIME, "2022-02-02", 1, Position.JANITOR);
        //Employee employeeSurname = new Employee("Doe");

        System.out.println(employee.getContractType().contractType);
        System.out.println(employee.toString());

        //Employee blueEmployee = new Employee();
        //blueEmployee.setContractType(ContractType.PARTTIME);


        //ContractType contractTypeFullTime = ContractType.FULLTIME;
        //ContractType contractTypePartTime = ContractType.PARTTIME;

        //System.out.println(contractTypeFullTime);

        //System.out.println(contractTypePartTime);
    }
}
