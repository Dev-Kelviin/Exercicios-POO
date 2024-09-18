public class App {
    public static void main(String[] args) throws Exception {
    
    Mamifero mamifero = new Mamifero();
    mamifero.som();

    System.out.println("----------------------------");

    Cachorro cachorro = new Cachorro();
    cachorro.setNome("Golden");
    cachorro.raça();
    cachorro.som();
    
    System.out.println("----------------------------");

    Aves garça = new Aves();
    garça.som();

    System.out.println("----------------------------");

    Loro loro = new Loro();
    loro.setNome("papagaio");
    loro.raça();
    loro.som();    

    System.out.println("----------------------------");
    

    }


}
