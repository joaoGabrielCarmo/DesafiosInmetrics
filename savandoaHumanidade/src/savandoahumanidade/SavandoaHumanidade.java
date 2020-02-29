/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savandoahumanidade;

import java.io.*;
import java.util.*;
import java.util.Scanner;


/**
 *
 * @author joao3
 */
public class SavandoaHumanidade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            System.out.println("Digite a quantidade de testes a serem feitos...");

            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int a = 0; a < t; a++) {
                System.out.println("DNA do Paciente....");
                String p = sc.next();
                System.out.println("DNA do Virus....");
                String v = sc.next();

                int tamanhoVirus = v.length();
                int errosPermitidos = 1;
                int pontosEncontrados = 0;
                int pivotVirus = 0;

                //bababa  = 6
                //a = 1
                for (int i = 0; i < p.length() - tamanhoVirus + 1; i++) {

                    errosPermitidos = 1;
                    pivotVirus = 0;

                    for (int j = i; j < i + tamanhoVirus; j++) {

                        if (p.charAt(j) != v.charAt(pivotVirus)) {

                            errosPermitidos--;
                            if (errosPermitidos < 0) {
                                break;
                            }

                        }
                        pivotVirus++;
                    } //fim do for interno

                    if (errosPermitidos >= 0) {
                        pontosEncontrados++;
                        System.out.print(i + " ");
                    }

                } //fim do for principal

                if (pontosEncontrados == 0) {
                    System.out.println("No Match!....(Sem correspondencias)");
                } else {
                    System.out.println("");
                }

            }
        } catch (Exception erro) {
            System.out.println("!!!Digite apenas numeros inteiros nesse campo!!!!");
             
        }
    }
}
