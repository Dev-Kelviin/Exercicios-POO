public class Peixes extends Animal {

    private String corEscama;

    @Override
    public void locomover() {
        
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {

        System.out.println("Come frutos do mar");
    }

    @Override
    public void som() {

        System.out.println("Peixe n faz som");
    }

    public void bolhas(){

        System.out.println("Soltando bolhas");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }


    
}
