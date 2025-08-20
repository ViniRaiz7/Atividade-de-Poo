public class Atividade 2{
    // Atributos
    private String titulo;
    private String autor;
    private double preco;

    // Construtor
    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    // Método para exibir informações do livro
    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Preço: R$ " + preco);
    }

    // Método para aplicar desconto
    public void aplicarDesconto(double percentual) {
        if (percentual > 0 && percentual < 100) {
            preco -= preco * (percentual / 100);
        }
    }
}
