import java.util.Scanner;

public class Compile {
    public static void main(String[] args) {
        //double x = 2.65;
        //double y = -20;
        // double z = Math.floor(x);
        //System.out.println(z);
        double x = 23;
        double y = 12;
        double z;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side x :" + x );
        System.out.println("Enter side y :" + y);
        z = Math.sqrt((x*x)+(y*y));
       System.out.println("The hypotenuse :" + z);
       scanner.close();
    }
}
