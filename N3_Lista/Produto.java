public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeInicial) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeInicial;
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            quantidadeEmEstoque += quantidade;
            System.out.println(quantidade + " unidades de " + nome + " adicionadas ao estoque.");
        } else {
            System.out.println("A quantidade a ser adicionada deve ser maior que zero.");
        }
    }

    public void vender(int quantidade) {
        if (quantidade > 0 && quantidade <= quantidadeEmEstoque) {
            quantidadeEmEstoque -= quantidade;
            System.out.println(quantidade + " unidades de " + nome + " vendidas.");
        } else if (quantidade <= 0) {
            System.out.println("A quantidade a ser vendida deve ser maior que zero.");
        } else {
            System.out.println("Quantidade insuficiente em estoque para realizar a venda.");
        }
    }

    public void exibirEstoque() {
        System.out.println("Estoque de " + nome + ": " + quantidadeEmEstoque + " unidades.");
    }

    public static void main(String[] args) {
        Produto produto = new Produto("Produto A", 10.0, 50);

        produto.exibirEstoque();
        produto.adicionarEstoque(20);
        produto.vender(15);
        produto.exibirEstoque();
    }
}
