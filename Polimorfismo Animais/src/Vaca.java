public class Vaca extends Mamifero {

    private String nome;

    @Override
    public void som(){

        System.out.println("MUUUUUUUUU");

    }

    @Override
    public void alimentar(){
        System.out.println("Come folhas");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    } 

    
}
