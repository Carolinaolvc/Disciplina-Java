package N1_Aula4;

import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa p1 = new Pessoa();

        System.out.println("Vamos calcular seu IMC!");

        System.out.println("Digite seu nome: ");
        p1.setNome(sc.next());

        System.out.println("Digite seu peso:");
        p1.setPeso(sc.nextDouble());

        System.out.println("Digite sua altura: ");
        p1.setAltura(sc.nextDouble());

        p1.calcularIMC();
        System.out.printf("%s,seu imc é de: %.2f ", p1.getNome(), p1.calcularIMC());

    }
}
