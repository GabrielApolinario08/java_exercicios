/*1) Escreva um programa em Java para ler um valor e escrever a mensagem “É MAIOR QUE
10!” se o valor lido for maior que 10, caso contrário escrever “NÃO É MAIOR QUE 10!”.*/

import java.util.Scanner;

//Gabriel Apolinário Fabrício
public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um valor qualquer: ");
        int valor = scanner.nextInt();
        scanner.close();

        if (valor > 10) {
            System.out.println("É MAIOR QUE 10!");
        } else {
            System.out.println("NÃO É MAIOR QUE 10!");
        }
    }
}