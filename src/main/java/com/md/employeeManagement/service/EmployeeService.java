package com.md.employeeManagement.service;

import com.md.employeeManagement.domain.Employee;
import com.md.employeeManagement.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAll(){
        return employeeRepository.findAll();
    }

    public Optional<Employee> findEmployee(final Long employeeId){
        if(employeeId == null){
            throw new RuntimeException("Employee does not exists");
        }
        return employeeRepository.findById(employeeId);
    }

    public Employee creatEmployee(final Employee employee){
        if(employee == null){
            throw new RuntimeException("Employee does not exists");
        }
        return employeeRepository.save(employee);
    }

    public Employee update(final Employee employee){
        return employeeRepository.findById(employee.getId())
                .map(e -> {
                    e.setFirstname(employee.getFirstname());
                    e.setLastname(employee.getLastname());
                    e.setDepartment(employee.getDepartment());
                    e.setEmail(employee.getEmail());
                    e.setSkill(employee.getSkill());
                    return employeeRepository.save(e);
                })
                .orElseThrow(() -> new IllegalArgumentException("Employee with id " + employee.getId() + " does not exist"));
    }

    public void delete(final Long id){
        if(id!=null){
            employeeRepository.deleteById(id);
        }
    }

}
