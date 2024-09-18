public class App {
    public static void main(String[] args) throws Exception {
        
        Caneta canetaAzul = new Caneta();
        canetaAzul.cor = "Azul";
        canetaAzul.modelo = "Bic";
 
        canetaAzul.destampar();
        canetaAzul.satus();
        canetaAzul.rabiscar();


        Caneta canetaVermelha = new Caneta();
        canetaVermelha.cor = "Vermelha";
        canetaVermelha.modelo = "Bic";

        canetaVermelha.tampar();
        canetaVermelha.satus();
        canetaVermelha.rabiscar();


    }
}
