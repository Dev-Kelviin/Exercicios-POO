public class Mamifero extends Animal {

    private String corDoPelo;

    @Override
    public void locomover() {

        System.out.println("Correndo");

    }

    @Override
    public void alimentar() {

        System.out.println("Mamando (lá ele)");

    }

    @Override
    public void som() {

        System.out.println("Som de mamifero");

    }

    public String getCorDoPelo() {
        return corDoPelo;
    }

    public void setCorDoPelo(String corDoPelo) {
        this.corDoPelo = corDoPelo;
    }



}
