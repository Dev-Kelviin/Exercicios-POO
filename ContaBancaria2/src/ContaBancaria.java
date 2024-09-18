public class ContaBancaria {

    public int numConta;
    private String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void printConta(){

        System.out.println("-------------------------------------------------------");
        System.out.println("Dono: "+ this.getDono());
        System.out.println("Saldo: "+ this.getSaldo());
        System.out.println("Tipo: "+ this.getTipo());
        System.out.println("Numero da conta: "+ this.getNumConta());
        System.out.println("Status: " + this.getStatus());
        System.out.println("-------------------------------------------------------");

    }


    public void abrirConta(String tipo){

        this.setTipo(tipo);

        this.setStatus(true);
        if(tipo == "CC" ){
            this.setSaldo(50);
        } else if (tipo == "CP") {
            this.setSaldo(150);
        }

        System.out.println("Conta aberta com sucesso");
    }


    public void fecharConta(){

        if(this.getSaldo() > 0 ){
            System.out.println("Retire dinheiro da conta para fechar");
        } else if(this.getSaldo() < 0 ){
            System.out.println("Quite suas dividas para fecha a conta");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
        

    }

    public void depositar(float valor){

        if(this.getStatus()){
            this.setSaldo(getSaldo() + valor);  
            System.out.println("Deposito realizado com sucesso");
        } else {
            System.out.println("Abra uma conta para realizar o deposito");
        }

    }

    public void sacar(float valor){

        System.out.println("Saldo em conta = "+ getSaldo());

        if(this.getStatus()){
            if(this.getSaldo() >= valor){
                this.setSaldo(this.getSaldo() - valor);
            } else {
                System.out.println("Saque invalido");
            }
        } else {
            System.out.println("Abra uma conta para realizar um saque");
        }


    }

    public void pagarMensalidade(){

        int MCP = 20, MCC = 12;

        if (this.getStatus()){

            if(this.getTipo() == "CC"){
                this.setSaldo(this.getSaldo() - MCC);

            } else if(this.getTipo() == "CP"){
                this.setSaldo(this.getSaldo() - MCP);
            }
        } else {
            System.out.println("Abra uma conta");
        }


    }


    public ContaBancaria() {
        this.setSaldo(0);
        this.status = true;
    }


    public int getNumConta() {
        return numConta;
    }


    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }


    public String getTipo() {
        return tipo;
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public String getDono() {
        return dono;
    }


    public void setDono(String dono) {
        this.dono = dono;
    }


    public float getSaldo() {
        return saldo;
    }


    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }


    public boolean getStatus() {
        return status;
    }


    public void setStatus(boolean status) {
        this.status = status;
    }

    

    
}
