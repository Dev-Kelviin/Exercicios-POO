public class App {
    public static void main(String[] args) throws Exception {
        
        Porta portaMadeira = new Porta();
        portaMadeira.material = "Madeira";
        portaMadeira.maçaneta = true;

        portaMadeira.destrancar();
        portaMadeira.status();
        portaMadeira.abrirProta();

        Porta portaVidro = new Porta();
        portaVidro.material = "Vidro";
        portaVidro.maçaneta = true;

        portaVidro.destrancar();
        portaVidro.status();
        portaVidro.abrirProta();

    }
}
