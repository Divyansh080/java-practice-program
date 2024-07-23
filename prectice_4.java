import java.util.Scanner;
//
public class prectice_4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("enter the distence in KM:");
        float km= sc.nextFloat();
        double miles= (km)*0.621371;
        System.out.println("the distence in miles: "+miles);
    }
}
