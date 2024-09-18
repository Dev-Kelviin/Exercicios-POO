public class App {
    public static void main(String[] args) throws Exception {
        
        Pessoa pessoa[] = new Pessoa[3];

        pessoa[0] = new Pessoa("Kelvin", 22, "Masculino");
        pessoa[1] = new Pessoa("Amanda", 27, "Feminino");
        pessoa[2] = new Pessoa("Julia", 20, "Feminino");

        Livro livro[] = new Livro[3];

        livro[0] = new Livro("JAVA POO", "Gustavo",  13, pessoa[0]);
        livro[1] = new Livro("Romance", "tb n sei",  300, pessoa[1]);
        livro[2] = new Livro("historias", "Sei la", 100, pessoa[2]);

        System.out.println(livro[0].detalhes());

    }
}
