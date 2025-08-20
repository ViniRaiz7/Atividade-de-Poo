public class Banco {
    public static void main(String[] args) {
      
        ContaBancaria conta1 = new ContaBancaria("001", "Lucas", 0.0);
        ContaBancaria conta2 = new ContaBancaria("002", "Lis", 0.0);
      
        conta1.depositar(500);
        conta1.sacar(200);
        conta1.consultarSaldo();

        System.out.println("----------------------------");
      
        conta2.depositar(1000);
        conta2.sacar(150);
        conta2.consultarSaldo();
    }
}
