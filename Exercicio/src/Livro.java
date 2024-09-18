


public class Livro implements Publicacao {

    private String titulo;
    private String autor;
    private int paginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    
    public String detalhes() {
        return "Titulo = " + titulo + "\nautor=" + autor +
                "\npaginas=" + paginas + "\npagAtual=" + pagAtual
                + "\naberto=" + aberto + "\nleitor=" + leitor.getNome();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }


    public Livro(String titulo, String autor, int paginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.leitor = leitor;
    }

    @Override
    public void abrir() {

        this.aberto = true;
    }

    @Override
    public void fechar() {

        this.aberto = false;

    }

    @Override
    public void folhear(int p ) {

        if (aberto) {
            this.pagAtual = p;
        } else {
            System.out.println("O livro esta fechado");
        }

    }

    @Override
    public void avançarPag() {

        this.setPagAtual(getPagAtual() + 1); 

    }

    @Override
    public void voltarPag() {

        this.setPagAtual(getPagAtual() - 1); 

    }

    



}
