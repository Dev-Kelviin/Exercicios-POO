public class Caneta {

    private String cor;
    private String modelo;
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Caneta(String cor, String modelo) {
        this.cor = cor;
        this.modelo = modelo;
    }
    public void status(){
        
        System.out.println("A cor da caneta é " + this.getCor());
        System.out.println("Do modelo " + this.getModelo());
        System.out.println("------------------------------------");

    }


}
