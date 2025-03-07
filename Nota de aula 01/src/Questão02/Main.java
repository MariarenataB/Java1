package Questão02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Matematica mt = new Matematica();
        Scanner  sc = new Scanner(System.in);
        int x;

        System.out.print("Numero 1");
        mt.n1= sc.nextDouble();

        System.out.print("Numero 2");
        mt.n2= sc.nextDouble();

        System.out.println("Digite 1 para somar, 2 para subtrair, 3 para multiplicar e 4 para dividir");
        x = sc.nextInt();

        switch (x) {
            case 1:
                System.out.println("A soma dos numeros é ");
                mt.somar();
                System.out.println(mt.total);
                break;
            case 2:
                System.out.println("A subtração dos numeros é ");
                mt.subtrair();
                System.out.println(mt.total);
                break;
            case 3:
                System.out.println(" A multiplicação dos numeros é ");
                mt.multiplicar();
                System.out.println(mt.total);
                break;
            case 4:
                System.out.println(" A divisão dos numeros é ");
                mt.dividir();
                System.out.println(mt.total);
                break;

            default:
                System.out.println("invalido");
                break;
        }



    }








}
