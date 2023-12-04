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
public class Manager {
    private String nama, departemen;
    private int no_karyawan;
    private List<Employee> managedEmployees;
    
    public Manager (String nama, int no_karyawan, String departemen){
        this.nama = nama;
        this.no_karyawan = no_karyawan;
        this.departemen = departemen;
        this.managedEmployees = new ArrayList<>();
    }
    
    public void addEmployee (Employee employee){
        managedEmployees.add(employee);
        
    }
    
    public List <Employee> getManagedEmployees(){
        return managedEmployees;
    }
    
}
