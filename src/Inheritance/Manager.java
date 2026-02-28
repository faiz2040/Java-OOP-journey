package Inheritance;

public class Manager extends Employee {
    int salary;

    public Manager(String x, int y){

        super(x);

        salary=y;


    }

    public void work(){

        System.out.println("The Inheritance.Employee name is "+name+" and salary is "+salary);
    }

    public static void main(String[] args){

        Manager obj= new Manager("Sarah",20000);
        obj.work();



    }



}