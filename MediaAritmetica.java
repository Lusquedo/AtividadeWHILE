/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mediaaritmetica;

/**
 *
 * @author Admin
 */

import java.util.Scanner;

public class MediaAritmetica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
         
        System.out.print("Quantos alunos há na sala? ");
        int numeroDeAlunos = scanner.nextInt();

        
        double somaNotas = 0;

        
        int contador = 0;
        while (contador < numeroDeAlunos) {
            System.out.print("Digite a nota do aluno " + (contador + 1) + ": ");
            double nota = scanner.nextDouble();
            somaNotas += nota; 
            contador++; 
        }

        
        double media = somaNotas / numeroDeAlunos;

        
        System.out.printf("A média da turma é: %.2f%n", media);
        
        
        scanner.close();
    }
}