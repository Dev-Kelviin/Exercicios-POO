
public class App {
    public static void main(String[] args){

        Visitante visitante1 = new Visitante();
        visitante1.setNome("Marcos");
        visitante1.setIdade(17);
        visitante1.setSexo("Masculino");

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Claudio");
        aluno1.setMatricula(20222933);
        aluno1.setCurso("Medicina");
        aluno1.setIdade(19);
        aluno1.setSexo("Masculino");
        aluno1.pgMensalidade();

        Bolsista bolsista1 = new Bolsista();
        bolsista1.setNome("Raul");
        bolsista1.setBolsa(356);
        bolsista1.setSexo("mascuino");
        bolsista1.pgMensalidade();

    }
}
