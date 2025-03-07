package Questão01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Aluno al  = new Aluno();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota");
        al.n1 = sc.nextDouble();

        System.out.println("Digite a segunda nota");
        al.n2 = sc.nextDouble();

        System.out.println("Digite a terceira nota");
        al.n3 = sc.nextDouble();

        al.media();
        System.out.println("Sua media é "+ al.media);


    }
}