package student_system;

public class Student {

    private String name;
    private int roll;
    private int marks;


    public Student(String newname, int newroll, int newmarks){

        name=newname;
        roll=newroll;
        marks=newmarks;



    }


    public char calculateGrade(int Marks){

        if(Marks >= 90){

            return 'A';



        }

        else if(Marks >= 75){

            return 'B';



        }

        else if(Marks >= 50){

            return 'C';



        }

        else{

            return'F';
        }







    }

    public void display(){

        char grade= calculateGrade(marks);

        System.out.printf("%-15s %-10d %-10d %c%n", name, roll, marks, grade);


    }





}







