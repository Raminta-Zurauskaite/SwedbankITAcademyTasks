package com.itacademy.java.oop.basics;

import java.time.LocalDate;

public class LoansApplication {
    public static void main(String[] args) {
        Customer customer = new Customer("Jon", "Doe", 24, 2132141);
        Loan loan1 = new Loan(1, 25, LoanType.LEASING, LocalDate.now());
        Loan loan2 = new Loan(2, 30, LoanType.CONSUMER_LOAN, LocalDate.now());

        Loan[] loans = {loan1, loan2};
        customer.setLoans(loans);

        System.out.println(customer.toString());
    }
}
