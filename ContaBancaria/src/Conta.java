public class Conta {

    public String numeConta;
    private String tipoDaConta;
    private String dono;
    private boolean status;
    private float saldo;
    public int valor;

    public Conta(String numeConta, String tipoDaConta, String dono) {
        this.numeConta = numeConta;
        this.tipoDaConta = tipoDaConta;
        this.dono = dono;
    }

    public String getNumeConta() {
        return numeConta;
    }

    public void setNumeConta(String numeConta) {
        this.numeConta = numeConta;
    }

    public String getTipoDaConta() {
        return tipoDaConta;
    }

    public void setTipoDaConta(String tipoDaConta) {
        this.tipoDaConta = tipoDaConta;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }


    public void saldo(){
        System.out.println("Saldo em conta "+ this.saldo);
    }

    public void abrirConta() {
            System.out.println("A conta foi aberta");
            System.out.println("Selecione o tipo de conta");
    }

    public void tipoDaConta(String tipo) {

        if (this.tipoDaConta.equals("CC")) {
            System.out.println("Conta Corrente");
            this.saldo += 50;

        } else if (this.tipoDaConta.equals("CP")) {
            System.out.println("Conta Poupança");
            this.saldo += 150;

        }

    }

    public void fecharConta() {

        if (this.saldo == 0) {
            System.out.println("Conta fechada com sucesso");
            this.status = false;
        } else if (this.saldo < 0) {
            System.out.println("voce não pode fechar a conta pois possui debitos");
            System.out.println("Pague seus debitos");
            
        } else {
            System.out.println("Para fechar a conta voce não pode ter saldo");
            System.out.println("Realize o saque do dinheiro");
           
        }

    }

    public void depositar(float valor){

        if(this.status== true){
            System.out.println("Informe o valor a ser depositado");
            this.saldo += valor;
            System.out.println("Depósito realizado: " + valor);
        } else {
            System.out.println("Sua conta não esta aberta");
        }


    }

    public void sacar(float valor){

        if(this.status== true){
            System.out.println("Informe o valor a ser sacado");
            if(valor > saldo){
                System.out.println("O valor de saque não é possivel");
            } else {
                saldo -= valor;
                System.out.println("Valor em conta "+ this.saldo);
            }
        } else {
            System.out.println("Sua conta não esta aberta");
        }


    }

    public void pagarMensal(){
        if (this.tipoDaConta.equals("CC")) {
            
            this.saldo -= 12;

        } else if (this.tipoDaConta.equals("CP")) {
           
            this.saldo -= 20;

        }

    }

}
