package exemplo1_pessoa;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         Pessoa p = new Pessoa();

         System.out.println("nome:");
         p.setNome(sc.next());
         System.out.println(p.getNome());

         System.out.println("idade");
         p.setIdade(sc.nextInt());
         System.out.println(p.getIdade());

         System.out.println("altura");
         p.setAltura(sc.nextDouble());
         System.out.println(p.getAltura());

         p.aniversario();
         System.out.println(p.getIdade());









    }
}
