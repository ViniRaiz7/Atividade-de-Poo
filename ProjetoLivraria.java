public class ProjetoLivraria {
    String titulo;
    String autor;
    double preco;

    // Construtor
    public ProjetoLivraria(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPreco() {
        return preco;
    }

    // Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Aplica desconto no preço
    public void aplicarDesconto(double percentual) {
        preco -= preco * (percentual / 100);
    }

    // Exibe as informações do livro
    public void mostrarInformacoes() {
        System.out.println("Livro: " + titulo + " | Autor: " + autor + " | Preço: R$ " + preco);
    }
}
