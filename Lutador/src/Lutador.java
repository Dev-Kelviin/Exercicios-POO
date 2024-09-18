public class Lutador {

    private String nome;
    private String nascionalidade;
    private int idade;
    private String altura;
    private int peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public void apresentar(){
        System.out.println("--------------------------------------------------------");
        System.out.println("Conheçam o "+ this.getNome());
        System.out.println("Vem direto de " + this.getNascionalidade());
        System.out.println("Altura " + this.getAltura());
        System.out.println("Um peso de " + this.getPeso());
        System.out.println("Possui " + this.getVitorias() + " Vitorias" );
        System.out.println("Possui " + this.getDerrotas() + " Derrotas" );
        System.out.println("Possui " + this.getEmpates() + " Empates" );
        System.out.println("--------------------------------------------------------");
    }
    
    public void status(){
        System.out.println("Nome:" + this.getNome());
        System.out.println("nascionalidade:" + this.getNascionalidade());
        System.out.println("idade:" + this.getIdade());
        System.out.println("altura:" + this.getAltura());
        System.out.println("peso:" + this.getPeso());
        System.out.println("categoria:" + this.getCategoria());
        System.out.println("vitorias:" + this.getVitorias());
        System.out.println("derrotas:" + this.getDerrotas());
        System.out.println("empates:" + this.getEmpates());

    }
    
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNascionalidade() {
        return nascionalidade;
    }

    public void setNascionalidade(String nascionalidade) {
        this.nascionalidade = nascionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
        this.getCategoria();
    }

    public String getCategoria() {
        
        if (this.getPeso() < 52.2){
                this.setCategoria("INVALIDO");
        } else if (this.getPeso() <= 70){
            this.setCategoria("PESO LEVE");
        } else if (this.getPeso() <= 83){
            this.setCategoria("PESO MEDIO");
        } else if (this.getPeso() <= 120){
            this.setCategoria("PESO PESADO");
        } else {
            this.setCategoria("INVALIDO");
        }

        return categoria;

    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public Lutador(String nome, String nascionalidade, int idade, String altura, int peso, int vitorias, int derrotas,
            int empates) {
        this.nome = nome;
        this.nascionalidade = nascionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    


}




