/*8) [POO-021] ===Desafio!!!=== Crie um programa que solicite ao usuário um número inteiro, que
        representará a quantidade de números inteiros que serão digitados em seguida e armazenados em um
        array. Através de um método que receba esse array de números inteiros como parâmetro de entrada,
        calcule e retorne o MDC (Máximo Divisor Comum) desse conjunto de dados. Valide as entradas para aceitar
        apenas números positivos (pode ser um método).
        Entrada: Saída: Cálculo:
        Entre com a quantidade de termos: 5 MDC: 10 10, 50, 30, 20, 40 | 2 [√]
        Entre com 1º número: 10 5, 25, 15, 10, 20 | 2 [x]
        Entre com 2º número: 50 5, 25, 15 ,5 ,10 | 2 [x]
        Entre com 3º número: 30 5, 25, 15, 5, 5 | 3 [x]
        Entre com 4º número: 20 5, 25, 5, 5, 5 | 5 [√]
        Entre com 5º número: 40 1, 5, 1, 1, 1 | 5 [x]
        1, 1, 1, 1, 1 | 1 * 2 * 5 = 10
        Entre com a quantidade de termos: 3 MDC: 9 45, 27, 36 | 2 [x]
        Entre com 1º número: 45 45, 27, 18 | 2 [x]
        Entre com 2º número: 27 45, 27, 9 | 3 [√]
        Entre com 3º número: 36 15, 9, 3 | 3 [√]
        5, 3, 1 | 3 [x]
        5, 1, 1 | 5 [x]
        1, 1, 1 | 1 * 3 * 3 = 9
        Entre com a quantidade de termos: 2 MDC: 18 162, 90 | 2 [√]
        Entre com 1º número: 162 81, 45 | 3 [√]
        Entre com 2º número: 90 27, 15 | 3 [√]
        9, 5 | 3 [x]
        3, 5 | 3 [x]
        1, 5 | 5 [x]
        1, 1 | 1 * 2 * 3 * 3 = 18
        Entre com a quantidade de termos: 1 MDC: 23 23 | 23 [√]
        Entre com 1º número: 23 1 | 1 * 23 = 23
        Entre com a quantidade de termos: 0
        Entre com a quantidade de termos: -7 Erro! Valor inválido.*/


import java.util.Arrays;
import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com a quantidade de termos: ");
        int qtdTermos = scanner.nextInt();
        if (qtdTermos <= 0) {
            System.out.println("Erro! Valor inválido!");
            System.exit(0);
        }
        int[] termos = new int[qtdTermos];
        for (int i = 0 ; i < qtdTermos ; i++) {
            System.out.println("Entre com o " + (i + 1) + "° número: ");
            termos[i] = scanner.nextInt();
        }
        System.out.println("MDC: " + calculaMDC(termos));
    }

    static int calculaMDC(int[] valores) {
        int cont = 2, mdc = 1;
        boolean allDivisiveis = false, mudaCont = false, finalizar = true;
        do {
            for (int valor : valores) {
                if (valor % cont == 0) {
                    allDivisiveis = true;
                } else {
                    allDivisiveis = false;
                    break;
                }
            }
            if (allDivisiveis) {
                mdc *= cont;
            }
            for (int i = 0 ; i < valores.length ; i++) {
                if (valores[i] % cont == 0) {
                    valores[i] = valores[i] / cont;
                }
            }
            for (int valor : valores) {
                if (valor % cont != 0) {
                    mudaCont = true;
                } else {
                    mudaCont = false;
                    break;
                }
            }
            if (mudaCont) {
                cont++;
            }
            for (int valor : valores) {
                if (valor == 1) {
                    finalizar = false;
                } else {
                    finalizar = true;
                    break;
                }
            }
        } while (finalizar);
        return mdc;
    }
}
