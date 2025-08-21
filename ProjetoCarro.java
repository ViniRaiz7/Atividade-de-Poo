public class ProjetoCarro {
    String marca;
    String modelo;
    int ano;

    
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    
    public void mostrarInformacoes() {
        System.out.println("Carro: " + marca + " - " + modelo + " (" + ano + ")");
    }

    
    public void ligarCarro() {
        System.out.println("O carro " + marca + " " + modelo + " está ligado!");
    }
}
