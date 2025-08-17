public class ProjetoLivraria {
    private String titulo;
    private String autor;
    private double preco;

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

    // Método para aplicar desconto
    public void aplicarDesconto(double percentual) {
        preco -= preco * (percentual / 100);
    }
}