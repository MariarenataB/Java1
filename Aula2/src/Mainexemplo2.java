import java.sql.SQLOutput;
import java.util.Scanner;

public class Mainexemplo2 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("qual é a idade?");
        int x = sc.nextInt();
        System.out.println(x);


        System.out.println("qual é o nome?");
        String nomecompleto = sc2.nextLine();
        System.out.println("nomecompleto:" + nomecompleto);


        System.out.println("qual é a altura?");
        double altura = sc.nextDouble();
        System.out.println(altura);


    }
}
