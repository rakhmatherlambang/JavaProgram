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
public class Employee {
    private String nama, jabatan, departemen;
    private int no_karyawan;
    private double gaji;
    private String project;
    
    private List<Project> projects;
    
    public  Employee(String nama, int no_karyawan, String jabatan, double gaji, String departemen){
        this.nama = nama;
        this.no_karyawan = no_karyawan;
        this.jabatan = jabatan;
        this.gaji = gaji;
        this.departemen = departemen;
        this.projects = new ArrayList<>();
    }

    public double getGaji() {
        return gaji;
    }

    public String getJabatan() {
        return jabatan;
    }

    public String getDepartemen() {
        return departemen;
    }

    public int getNo_karyawan() {
        return no_karyawan;
    }
    
    
    
    public String getNama() {
        return nama;
    }
    
    public void addProject(Project project){
        projects.add(project);
    }
    
    public List<Project> getProject(){
        return projects;
    }
    
}
