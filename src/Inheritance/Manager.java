package Inheritance;


//CHILD CLASS INHERITED THE PROPERTIES OF PARENT CLASS EMPLOYEE
public class Manager extends Employee {

    protected int salary;

    public Manager(String x, int y){

        super(x);   //SENDING THE VALUE TO PARENT CONSTRUCTOR

        salary=y;


    }

    public void Work(){

        System.out.println("The Inheritance.Employee name is "+name+" and salary is "+salary);
    }

    public static void main(String[] args){

        Manager obj= new Manager("Sarah",20000);
        obj.Work();



    }




}