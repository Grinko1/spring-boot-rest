package com.spring.boot.dao;



import com.spring.boot.entity.Employee;

import java.util.List;

public interface EmployeeDao {
    public List<Employee> getAllEmployees();
    public void saveEmp(Employee employee);
    public Employee findById(int id);
    public void deleteEmp(Employee employee);
}
