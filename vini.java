public class vini {
    public static void main(String[] args) {
        
        ProjetoLivraria livro1 = new ProjetoLivraria("Java Para iniciantes", "ViniRaiz7", 50.0);
        ProjetoLivraria livro2 = new ProjetoLivraria("php Para iniciantes", "ViniRaiz7", 70.0);

        
        livro1.setPreco(45.0);
        livro2.setAutor("ViniRaiz7");

        
        System.out.println("Livro 1:");
        System.out.println("Título: " + livro1.getTitulo());
        System.out.println("Autor: " + livro1.getAutor());
        System.out.println("Preço: " + livro1.getPreco());

        System.out.println("\nLivro 2:");
        System.out.println("Título: " + livro2.getTitulo());
        System.out.println("Autor: " + livro2.getAutor());
        System.out.println("Preço: " + livro2.getPreco());

    
        livro1.aplicarDesconto(10);
        livro2.aplicarDesconto(5);

        System.out.println("\nApós desconto:");
        System.out.println("Livro 1 - Preço: " + livro1.getPreco());
        System.out.println("Livro 2 - Preço: " + livro2.getPreco());
    }
}
