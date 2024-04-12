package com.udemy;


import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantas pessoas vão digitar a altura: ");
        int n = sc.nextInt();

        double sum = 0;
        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite sua Altura: ");
            vect[i] = sc.nextDouble();

            sum += vect[i];
        }

        System.out.printf("A altura média de todos é %.2f \n",(sum / n));

        System.out.println("Obrigado por participar da pesquisa!");

        sc.close();
    }
}