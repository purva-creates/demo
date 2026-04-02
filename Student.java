package demo;
import java.util.Scanner;
public class Student {
    public static void main(String[] agrs){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total number of subjects ");
        int n=sc.nextInt();
        int[] marks=new int[n];
        int total=0;
       
        for(int i=0;i<n;i++){
            System.out.println("enter the marks for the subjects" +(i+1) +":");
            marks[i]=sc.nextInt();
            total += marks[i];
        }
            float Average= total/n;
             char grade;
            if(Average>=90){
                grade='A';
            }
            else if(Average>=75){
                grade='B';
            }
            else if(Average>=50){
                grade='C';
            }
            else if(Average>=35){
                grade='D';
            }
            else{
                grade='F';
            }
        
         System.out.println("total number of the subject is :" + n);
        System.out.println("total marks of the student is :" + total);
        System.out.println("Averge marks of the student is :" + Average);
       System.out.println("student grade is :" + grade);
        
        

 sc.close();
    }
   
}
