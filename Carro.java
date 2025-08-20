public class Carro {
    public static void main(String[] args) {
        
        Carro carro1 = new Carro("Ferrari", "Audi", 2020);
        Carro carro2 = new Carro("Camaro", "Agera R", 2019);

        
        carro1.mostrarInformacoes();
        carro2.mostrarInformacoes();

        System.out.println("");

        
        carro2.setMarca("Chevrolet");
        carro2.setModelo("Onix");
        carro2.setAno(2022);

        
        carro2.mostrarInformacoes();

        System.out.println("");

        
        carro1.ligarCarro();
        carro2.ligarCarro();
    }
}
