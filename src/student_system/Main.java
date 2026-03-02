package student_system;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

        Student[] arr= new Student[5];

        int length=arr.length;

        for(int i=0; i<length;i++){

            System.out.println("Enter the name: ");
            String x= sc.nextLine();

            System.out.println("Enter the roll no: ");
            int y= sc.nextInt();

            System.out.println("Enter the marks: ");
            int z= sc.nextInt();

            sc.nextLine();

            Student obj= new Student(x,y,z);

            arr[i]=obj;







        }

        System.out.println("\n--- Student Report Card ---");

        System.out.printf("%-15s %-10s %-10s %s%n", "Name", "Roll No", "Marks", "Grade");
        System.out.println("---------------------------------------------");


        for (int i = 0; i < 5; i++) {

            arr[i].display();
        }
        sc.close();












    }


}
