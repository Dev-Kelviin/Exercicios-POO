public class App {
    public static void main(String[] args){
        
        Lutador lutador[] = new Lutador [5];

        lutador[0] = new Lutador("Kelvin", "Americano", 25, "1.89", 60, 0, 4, 0);
        lutador[1] = new Lutador("Renato", "Argentina", 36, "1.78", 98, 9, 4, 1);
        lutador[2] = new Lutador("Pedro", "Americano", 25, "1.76", 60, 20, 4, 0);
        lutador[3] = new Lutador("Anderson", "Brasileiro", 28, "1.89", 120, 28, 2, 4);
        lutador[4] = new Lutador("Lee", "Chinês", 24, "1.79", 83, 5, 0, 0);

        Luta UFC = new Luta();

        UFC.marcarLuta(lutador[0], lutador[2]); 
        UFC.lutar();

        

    }
}
