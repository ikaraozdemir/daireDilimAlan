import java.util.Scanner;

public class DilimAlan {
    public static void main (String[] args) {
        double r, area, alpha, pi = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz:");
        r = input.nextDouble();
        System.out.print("Merkez açısının ölçüsünü giriniz:");
        alpha = input.nextDouble();
        // daire diliminin alanını hesaplama
        area = (pi * r * r * alpha)/360;
        System.out.print("Daire diliminin alanı: " + area);
    }
}
