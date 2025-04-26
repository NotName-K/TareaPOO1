package com.mycompany.pj1;
import java.util.Scanner;	

public class Pj1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un Valor: ");
        int y = scanner.nextInt();
        int z = 425;
        byte x = 10;
        float k = z * x;
        System.out.println("Suma: " + (y + k) + ", Resta: " + (y - k));

        
    }
}
