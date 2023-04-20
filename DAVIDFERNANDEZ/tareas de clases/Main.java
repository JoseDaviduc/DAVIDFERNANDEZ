import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        double a, pesoA, b, pesoB, media;

        pesoA = 3.5;
        pesoB = 7.5;

        a = scan.nextDouble();
        b = scan.nextDouble();

        a *= pesoA;
        b = b * pesoB;

        media = (a+b)/(pesoA+pesoB);

        System.out.printf("MEDIA = %.5f\n", media);

    }
 
}