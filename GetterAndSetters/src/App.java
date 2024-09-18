public class App {
    public static void main(String[] args) throws Exception {
        
        Caneta canetaAzul = new Caneta("Azul","BIC");
        canetaAzul.status();

        Caneta canetaVermelha = new Caneta("Vermelha", "Faber Castel");
        canetaVermelha.status();

    }
}
