/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package company.pkgabstract.pkgclass.practice;

/**
 *
 * @author user
 */
public class Doctor extends Worker{
    //Constructor
    public Doctor(String name, int salary)
    {
        super.name = name;
        super.salary = salary;
        super.profession = "Doctor";
    }
    public Doctor()
    {
        super.name = "Pesho";
        super.salary = 500;
        super.profession = "Doctor";
    }
    //Methods
    @Override
    public void work() {
        System.out.printf("%s %s helped some patients!\n", super.profession, super.name); //Works
    }

    @Override
    public void promote() {
        if(super.getPromotionsCount() == 0)
        {
            super.setPromotionsCount(1);
            System.out.printf("%s %s got a promotion and is now a Surgeon! His salary is 900 $ more than the previous one!\n", super.profession, super.name); //Upgrade
            super.setSalary(getSalary() + 900);
            super.setProfession("Surgeon");
        }else{
            System.out.println("You have been promoted already!");
        }
    }
    
}
