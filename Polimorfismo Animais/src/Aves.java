public class Aves extends Animal {

    private String corDaPena;
    private String nome;

    @Override
    public void locomover() {
       
        System.out.println("voa");

    }

    @Override
    public void alimentar() {
        
        System.out.println("Come minhocas");

    }

    @Override
    public void som() {
      
        System.out.println("faz piu-piu");

    }

    public void fazerNinho(){

        System.out.println("Fazendo ninho");

    }

    public String getCorDaPena() {
        return corDaPena;
    }

    public void setCorDaPena(String corDaPena) {
        this.corDaPena = corDaPena;
    }

    public void raça(){
        System.out.println(getNome());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
