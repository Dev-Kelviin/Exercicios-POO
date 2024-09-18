public class App {
    public static void main(String[] args) throws Exception {
        
        ContaBancaria conta1 = new ContaBancaria();
        conta1.abrirConta("CC");
        conta1.setDono("Jubileu");
        conta1.setNumConta(123);
        conta1.depositar(50);
        conta1.depositar(200);



        ContaBancaria conta2 = new ContaBancaria();
        conta2.abrirConta("CP");
        conta2.setDono("Amanda");
        conta2.setNumConta(044);
        conta2.sacar(50);
        conta2.sacar(50);
        conta2.sacar(50);
        conta2.sacar(20);

        conta2.printConta();


    }

    
}
