public class Cachorro extends Mamifero {

    private String nome;

    @Override
    public void alimentar(){
        System.out.println("come ração");

    } 

    @Override
    public void som(){
        System.out.println("Late");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void raça(){
        System.out.println(getNome());
    }
    

}
