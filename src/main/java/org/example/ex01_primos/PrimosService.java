package org.example.ex01_primos;

import java.util.Scanner;

public class PrimosService {

    public int solicitarNumero() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escolha um número inteiro: ");
        return scanner.nextInt();
    }

    public void verificarSeNumeroEPrimo(int numeroEscolhido) {
        int quantidadeRestoZero = 0;
        for (int i = 1; i <= numeroEscolhido; i++) {
            if (numeroEscolhido % i == 0) {
                quantidadeRestoZero++;
            }
        }
        if (quantidadeRestoZero == 2 ) {
            System.out.println("O número " + numeroEscolhido + " é PRIMO");
        } else {
            System.out.println("O número " + numeroEscolhido + " NÃO É PRIMO");
        }
    }
}
