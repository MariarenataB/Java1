import java.util.Scanner;

public class MainProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto produto = new Produto("Camiseta", 50.0, 10);

        produto.exibirEstoque();
        System.out.print("Quantas unidades deseja adicionar ao estoque? ");
        int adicionar = sc.nextInt();
        produto.adicionarEstoque(adicionar);

        System.out.print("Quantas unidades deseja vender? ");
        int vender = sc.nextInt();
        produto.venderProduto(vender);

        produto.exibirEstoque();
    }
}
