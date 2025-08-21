public class ProjetoLivraria {
    String titulo;
    String autor;
    double preco;

    
    public ProjetoLivraria(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPreco() {
        return preco;
    }

    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    
    public void aplicarDesconto(double percentual) {
        preco -= preco * (percentual / 100);
    }
}
