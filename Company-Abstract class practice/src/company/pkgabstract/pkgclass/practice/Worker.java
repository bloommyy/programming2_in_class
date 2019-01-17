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
public abstract class Worker {
    protected String name;
    protected int salary;
    protected String profession;
    protected int promotionsCount = 0;
    //Getters and Setters
     public void setPromotionsCount(int promCount)
    {
        this.promotionsCount = promCount;
    }
    public int getPromotionsCount()
    {
        return this.promotionsCount;
    }
    
    public void setProfession(String prof)
    {
        this.profession = prof;
    }
    public String getProfession()
    {
        return this.profession;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }
    
    public void setSalary(int salary)
    {
        this.salary = salary;
    }
    public int getSalary()
    {
        return this.salary;
    }
    //Methods
    public final void recieveSalary()
    {
        System.out.printf("%s recieved his/her salary! It's a total of %d $!\n", this.name, this.salary);
    }
    public abstract void promote();
    public abstract void work();
}
