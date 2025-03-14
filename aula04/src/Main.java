import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Pessoaimc p = new Pessoaimc();

        System.out.println("altura:");
        p.setAltura(sc.nextDouble());
        System.out.println(p.getAltura());

        System.out.println("peso");
        p.setPeso(sc.nextDouble());
        System.out.println(p.getPeso());

        System.out.println("imc");
        p.calculeIcm();
        System.out.printf("%.2f", p.getImc());



    }
}