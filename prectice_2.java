import java.util.Scanner;
// write a program to calculate CGPA using marks of 3 subject (out of 100).
public class prectice_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the mark of subject_1:");
        float sub1=sc.nextInt();
        System.out.println("enter the mark of subject_1:");
        float sub2=sc.nextInt();
        System.out.println("enter the mark of subject_1:");
        float sub3=sc.nextInt();

        float sum=sub1+sub2+sub3;
        float CGPA=(sum)/30;

        System.out.println("your CGPA is"+CGPA);
    }
}
