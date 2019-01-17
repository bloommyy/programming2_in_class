/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package company.pkgabstract.pkgclass.practice;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class CompanyAbstractClassPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Worker> workers = new ArrayList<Worker>();
        workers.add(new Doctor());
        workers.add(new Doctor("Ceco", 700));
        workers.add(new Mechanic());
        workers.add(new Mechanic("Teodor", 680));
        workers.add(new Doctor("Sofka", 740));
        
        for(int i =0; i < 5; i++)
        {
            workers.get(i).work();
            workers.get(i).recieveSalary();
            workers.get(i).promote();
            workers.get(i).work();
            workers.get(i).recieveSalary();
            workers.get(i).promote();
        }
    }
    
}
