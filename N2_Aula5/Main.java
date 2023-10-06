package N2_Aula5;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Professor p1 = new Professor();
        Aluno a1 = new Aluno();


        System.out.println("Vamos fazer o seu cadastro!");
        System.out.println("Digite 1 para cadastro de Professor.");
        System.out.println("Digite 2 para cadastro de Aluno. ");
        System.out.println("Escolha a opção: ");
        int opcao = sc.nextInt();
        sc.nextLine();

        switch (opcao) {
            case 1:
                System.out.println("Digite seu nome: ");
                p1.setNome(sc.nextLine());
                System.out.println("Digite sua idade:");
                p1.setIdade(sc.nextInt());
                System.out.println("Digite sua especialização: ");
                p1.setEspecializacao(sc.nextLine());
                System.out.println("Digite sua expectativa de salário:");
                p1.setSalario(sc.nextDouble());
                break;


            case 2:
                System.out.println("Digite seu nome: ");
                a1.setNome(sc.nextLine());
                System.out.println("Digite sua idade:");
                a1.setIdade(sc.nextInt());
                System.out.println("Digite sua primeira nota: ");
                a1.setNota1(sc.nextDouble());
                System.out.println("Digite sua segunda nota: ");
                a1.setNota2(sc.nextDouble());
                a1.calcularMedia();
                System.out.printf("%s, notas: %.2f / " +
                        "%.2f.\n", a1.getNome(), a1.getNota1(), a1.getNota2());
                System.out.println("Média:" + a1.getMedia());
                break;

            default:
                System.out.println("Opção inválida.");
                break;
        }





    }
}
