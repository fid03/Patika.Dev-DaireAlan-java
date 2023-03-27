package patikaDev;

import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int radius;
        double alan,uzunluk;
        System.out.println("Enter radius of circle");
        radius=sc.nextInt();
        alan=Math.PI*Math.pow(radius,2);
        uzunluk=2*Math.PI*radius;
        System.out.println("Alan:"+alan);
        System.out.println("Uzunluk:"+uzunluk);
    }
}
