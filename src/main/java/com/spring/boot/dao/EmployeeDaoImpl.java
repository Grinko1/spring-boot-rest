package com.spring.boot.dao;

import com.spring.boot.entity.Employee;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
    @Autowired
    private EntityManager entityManager;

    @Override

    public List<Employee> getAllEmployees() {
        Session session = entityManager.unwrap(Session.class);

        List<Employee> emps = session.createQuery("from Employee", Employee.class).getResultList();

        return emps;
    }


    @Override
    public void saveEmp(Employee employee) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(employee);
    }

    @Override
    public Employee findById(int id) {
        Session session = entityManager.unwrap(Session.class);
        return session.get(Employee.class, id);
    }

    @Override
    public void deleteEmp(Employee employee) {
        Session session = entityManager.unwrap(Session.class);
        session.delete(employee);
    }
}
