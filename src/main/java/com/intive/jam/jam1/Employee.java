package com.intive.jam.jam1;

import java.math.BigDecimal;

public final class Employee {

    private final String fullName;
    private String position;
    private BigDecimal salaryPerHour;

    public Employee(String fullName, String position, BigDecimal salaryPerHour) {
        this.fullName = fullName;
        this.position = position;
        this.salaryPerHour = salaryPerHour;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public BigDecimal getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalaryPerHour(BigDecimal salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    public void print() {
        System.out.println(new StringBuilder(fullName)
                               .append(" is working as a ")
                               .append(position)
                               .append(" with salary per hour: ")
                               .append(salaryPerHour)
                               .append(" PLN"));
    }
}
