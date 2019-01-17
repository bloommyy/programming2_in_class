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
public class Mechanic extends Worker{
    //Constructor
    public Mechanic(String name, int salary)
    {
        super.name = name;
        super.salary = salary;
        super.profession = "Mechanic";
    }
    public Mechanic()
    {
        super.name = "Bojidar";
        super.salary = 750;
        super.profession = "Mechanic";
    }
    //Methods
    @Override
    public void work() {
        System.out.printf("%s %s fixed a car!\n", super.profession, super.name); //Works
    }   

    @Override
    public void promote() {
        if(super.getPromotionsCount() == 0)
        {
            super.setPromotionsCount(1);
            System.out.printf("%s %s got a promotion and is now a Mechanic Manager! His salary is 400 $ more than the previous one!\n", super.profession, super.name); //Upgrade
            super.setSalary(getSalary() + 400);
            super.profession = "Mechanic Manager";
        }else{
            System.out.println("You have been promoted already!");
        }
    }
}
