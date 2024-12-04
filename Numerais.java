/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numerais;

/**
 *
 * @author Admin
 */

import java.util.Scanner;

public class Numerais {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Digite um número inteiro N: ");
        int N = scanner.nextInt();
        
        
        System.out.println("Números de 1 até " + N + ":");
        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }
        
        
        scanner.close();
    }
}
