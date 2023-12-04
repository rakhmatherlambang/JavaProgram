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
public class Departement {
    private String nama;
    private List<Employee> employees;
    private List<Project> projects;
    
    public Departement(String nama){
        this.nama = nama;
        this.employees = new ArrayList<>();
        this.projects = new ArrayList<>();
    }
    
    public void addEmployee(Employee employee){
        employees.add(employee);
    }
    
    public void addProject (Project project){
        projects.add(project);
    }
    
    public List<Employee> getEmployees(){
        return employees;
    }
    
    public List<Project> getProjects(){
        return projects;
    }



}