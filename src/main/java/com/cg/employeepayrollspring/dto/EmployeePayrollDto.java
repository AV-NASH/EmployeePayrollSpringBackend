package com.cg.employeepayrollspring.dto;


import com.cg.employeepayrollspring.domain.EmployeePayroll;
import com.cg.employeepayrollspring.domain.EmployeePayroll;
import lombok.*;

public class EmployeePayrollDto {

    private Long id;
    private String name;
    private String salary;

    public EmployeePayrollDto(){

    }

    public EmployeePayrollDto(EmployeePayroll user){
        this.id = user.getId();
        this.name = user.getName();
        this.salary = user.getSalary();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSalary() {
        return salary;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
