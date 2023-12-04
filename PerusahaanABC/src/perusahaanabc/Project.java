/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perusahaanabc;

import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author rakhm
 */
public class Project {
    private String nama;
    private List<Employee> employees;
    
    public Project(String nama){
        this.nama = nama;
        this.employees = new ArrayList<>();
    }
    
    public void addEmployee(Employee employee){
        employees.add(employee);
    }
    
    public List<Employee> getEmployees(){
        return employees;
    }
    
    
}
