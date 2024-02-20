package com.spring.boot.services;



import com.spring.boot.entity.Employee;

import java.util.List;

public interface EmployeeServiceInt {
    public List<Employee> getAllEmployees();
    public void saveEmp(Employee employee);
    public Employee findById(int id);
    public void deleteEmp(Employee employee);
}
