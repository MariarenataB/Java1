

class Produto {
    private String nome;
    private double preco;
    private int estoque;

    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public void adicionarEstoque(int quantidade) {
        estoque += quantidade;
        System.out.println(quantidade + " unidades adicionadas.");
    }

    public void venderProduto(int quantidade) {
        if (quantidade <= estoque) {
            estoque -= quantidade;
            System.out.println(quantidade + " unidades vendidas.");
        } else {
            System.out.println("Estoque insuficiente!");
        }
    }

    public void exibirEstoque() {
        System.out.println("Estoque atual: " + estoque);
    }
}