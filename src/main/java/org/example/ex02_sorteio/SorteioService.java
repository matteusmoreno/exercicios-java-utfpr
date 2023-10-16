package org.example.ex02_sorteio;

import java.util.Scanner;

public class SorteioService {

    public int solicitarNumero() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escolha um número inteiro entre 0 e 1000: ");
        return scanner.nextInt();
    }

    public int sortearNumero() {
        int min = 0;
        int max = 1000;

        return (int) Math.round(Math.random() * (max - min) + min);
    }
}
