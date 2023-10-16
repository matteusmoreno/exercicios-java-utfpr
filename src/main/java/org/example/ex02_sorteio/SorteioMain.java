package org.example.ex02_sorteio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SorteioMain {
    public static void main(String[] args) {
        SorteioService sorteioService = new SorteioService();

        int numeroSorteado = sorteioService.sortearNumero();
        System.out.println(numeroSorteado);
        int tentativas = 0;

        while (true) {
            try {
                int palpite = sorteioService.solicitarNumero();

                if (palpite == numeroSorteado) {
                    tentativas++;
                    System.out.println("PARABÉNS ! Você acertou o número " + numeroSorteado + " com " + tentativas + " tentativas");
                    break;
                } else if (palpite > numeroSorteado) {
                    tentativas++;
                    System.out.println("O número sorteado é MENOR. Tente novamente...");
                } else {
                    tentativas++;
                    System.out.println("O número sorteado é MAIOR. Tente novamente...");
                }
            } catch (InputMismatchException e) {
                System.out.println("O número deve ser inteiro");
            }

        }
    }
}
