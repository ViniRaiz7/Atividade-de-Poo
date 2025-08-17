public class vini {
    public static void main(String[] args) {
        // Instanciação de dois objetos da classe ProjetoLivraria
        ProjetoLivraria livro1 = new ProjetoLivraria("Dom Casmurro", "Machado de Assis", 50.0);
        ProjetoLivraria livro2 = new ProjetoLivraria("O Hobbit", "J.R.R. Tolkien", 70.0);

        // Alteração dos atributos através dos objetos
        livro1.setPreco(45.0); // altera o preço do livro1
        livro2.setAutor("Tolkien"); // altera o autor do livro2

        // Impressão dos atributos na tela
        System.out.println("Livro 1:");
        System.out.println("Título: " + livro1.getTitulo());
        System.out.println("Autor: " + livro1.getAutor());
        System.out.println("Preço: " + livro1.getPreco());

        System.out.println("\nLivro 2:");
        System.out.println("Título: " + livro2.getTitulo());
        System.out.println("Autor: " + livro2.getAutor());
        System.out.println("Preço: " + livro2.getPreco());

        // Invocação dos métodos da classe
        livro1.aplicarDesconto(10); // Aplica 10% de desconto
        livro2.aplicarDesconto(5);  // Aplica 5% de desconto

        System.out.println("\nApós desconto:");
        System.out.println("Livro 1 - Preço: " + livro1.getPreco());
        System.out.println("Livro 2 - Preço: " + livro2.getPreco());
    }
}