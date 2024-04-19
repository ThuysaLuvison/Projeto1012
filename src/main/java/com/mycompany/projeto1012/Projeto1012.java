/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto1012;

import java.util.Scanner;

public class Projeto1012 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A, B, C, TRIANGULO, CIRCULO, TRAPEZIO, QUADRADO, RETANGULO;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        double pi;
        pi = 3.14159;
        TRIANGULO = (A * C) / 2;
        CIRCULO = pi * (C * C);
        TRAPEZIO = (A + B) * C / 2;
        QUADRADO = B * B;
        RETANGULO = A * B;
        System.out.printf("TRIANGULO: %.3f\n", TRIANGULO);
        System.out.printf("CIRCULO: %.3f\n", CIRCULO);
        System.out.printf("TRAPEZIO: %.3f\n", TRAPEZIO);
        System.out.printf("QUADRADO: %.3f\n", QUADRADO);
        System.out.printf("RETANGULO: %.3f\n", RETANGULO);
    }
}
