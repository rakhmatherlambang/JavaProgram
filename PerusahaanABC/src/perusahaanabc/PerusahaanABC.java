/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perusahaanabc;

/**
 *
 * @author rakhm
 */
import java.util.ArrayList;
import java.util.List;

public class PerusahaanABC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee ep1 = new Employee("rakhmat", 15, "Senior", 5000000, "IT");
        
        Employee ep2 = new Employee("musa", 12, "Junior", 2000000, "IT" );
        
        Project prj1 = new Project("Project A");
        
        prj1.addEmployee(ep1);
        prj1.addEmployee(ep2);
        
        List<Employee> projectEmployees = prj1.getEmployees();
        
        System.out.println("Karyawan di Projek A: ");
        for (Employee employee : projectEmployees){
            System.out.println(employee.getNama()+ " " + employee.getNo_karyawan()+ " " + employee.getJabatan()+ " "+ employee.getGaji() + " " + employee.getDepartemen() );
        }
        
        
    }
    
}
