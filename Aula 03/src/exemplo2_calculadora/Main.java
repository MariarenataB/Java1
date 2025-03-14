package exemplo2_calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[]args) {

        calculadora c = new calculadora();
        Scanner sc = new Scanner(System.in);

        System.out.print("Numero 1");
        c.n1= sc.nextDouble();

        System.out.print("Numero 2");
        c.n2 = sc.nextDouble();

        System.out.print("Numero 3");
        c.n3= sc.nextDouble();

        System.out.println("Digite 1(soma), 2(Dividir),  3(Subtrair), 4(Multiplicar)");
        int x = sc.nextInt();

        switch (x){
            case 1:
                System.out.println("A soma dos numeros é: ");
                c.somar();
                break;
            case 2:
                System.out.println("A Divisao dos numeros é: ");
                c.dividir();
                break;
            case 3:
                System.out.println("A Subtracao dos numeros é: ");
                c.Subtrair();
                break;
            case 4:

                System.out.println("A Multiplicacao dos numeros é: ");
                c.multiplicar();
                break;

            default:
                System.out.println("invalido");
                break;


        }




 }
}
