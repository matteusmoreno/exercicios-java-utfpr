package org.example.ex01_primos;

import java.util.InputMismatchException;

public class PrimosMain {
    public static void main(String[] args) {

        PrimosService primosService = new PrimosService();

        try {
            var numeroEscolhido = primosService.solicitarNumero();

            primosService.verificarSeNumeroEPrimo(numeroEscolhido);

        } catch (InputMismatchException e) {
            System.out.println("Erro: Número deve ser um número inteiro.");
        }
    }
}
