import java.io.IOException;
import java.util.scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        double a, b, c, pesoA = 2, pesoB = 3, pesoC = 5, media;
        double pesoTotal = pesoA + pesoB + pesoC;
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();

        a *= pesoA;
        b *= pesoB;
        c *= pesoC;

        media = (a+b+c) / pesoTotal;

        System.out.printf("MEDIA = %.1f\n", media)
    }

}