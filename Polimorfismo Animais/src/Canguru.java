public class Canguru extends Mamifero {

    private String nome;

    @Override
    public void alimentar(){

        System.out.println("come folhas");

    }

    public void locomover(){
        System.out.println("Saltando");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
}
