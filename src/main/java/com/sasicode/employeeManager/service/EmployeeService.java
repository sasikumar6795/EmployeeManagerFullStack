package com.sasicode.employeeManager.service;

import com.sasicode.employeeManager.entity.Employee;
import com.sasicode.employeeManager.exception.UserNotFoundException;
import com.sasicode.employeeManager.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    //Add new Employee --employee code needs to be done here, from UI we will get other employee data
    public Employee addEmployee(Employee employee)
    {
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepository.save(employee);
    }

    public List<Employee> findAllEmployees()
    {
        return employeeRepository.findAll();
    }

    public Employee updateEmployee(Employee employee)
    {
        return  employeeRepository.save(employee);
    }

    public Employee findEmployeeById(Long employeeId)
    {
        return employeeRepository.findEmployeeById(employeeId)
                .orElseThrow(() -> new UserNotFoundException("user by id " +  employeeId + " was not found"));
    }

    public void deleteEmployee(Long employeeId)
    {
       employeeRepository.deleteEmployeeById(employeeId);
    }

}
