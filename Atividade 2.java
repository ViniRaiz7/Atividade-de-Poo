public class Atividade 2{
    
    String titulo;
    String autor;
    double preco;

    
    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    
    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Preço: R$ " + preco);
    }

    
    public void aplicarDesconto(double percentual) {
        if (percentual > 0 && percentual < 100) {
            preco -= preco * (percentual / 100);
        }
    }
}
