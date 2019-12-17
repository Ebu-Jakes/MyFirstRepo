package gpa.calculator;
import java.util.Scanner;
public class GPACalculator{
    public static void main(String[]args){
        double year1;
        double year2;
        double year3;
        double year4;
        double CGPA;
        //I called a scanner
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter your 1st year GP");
        year1= input.nextDouble();
        
        System.out.println("Please enter your 2nd year GP");
        year2=input.nextDouble();
        
        System.out.println("Please enter your 3rd year GP");
        year3=input.nextDouble();
        
        System.out.println("Please enter your 4th year GP");
        year4=input.nextDouble();
        CGPA=(year1 + year2 + year3 + year4)/4;
        System.out.println("your Graduating CGPA is =" +CGPA );
        if (CGPA>4.5);
        System.out.println("Congratulations you made a first class");
           
        
        
        
        
    }
}