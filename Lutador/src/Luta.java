import java.util.Random;

public class Luta {

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    //metodos publicos da classe
    public void marcarLuta(Lutador lutador1, Lutador lutador2){

        if(lutador1.getCategoria() == lutador2.getCategoria() && lutador1 != lutador2 ){
            
            this.setAprovada(true);
            this.desafiado = lutador1;
            this.desafiante = lutador2;
            

        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }

    }

    public void lutar(){

        if (this.aprovada) {
            System.out.println("---DESAFIADO---");
            this.desafiado.apresentar();

            System.out.println("---DESAFIANTE---");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); //0,1,2

            switch (vencedor) {
                case 0:
                
                System.out.println("A luta empatou");
                this.desafiado.empatarLuta(); 
                this.desafiante.empatarLuta();
                break;
            
                case 1:
                    
                System.out.println("Desafiado " + this.desafiado.getNome() + " ganhou");
                this.desafiado.ganharLuta();  
                this.desafiante.perderLuta();
                break;
        

                case 2:
                    
                System.out.println("Desafiante " + this.desafiante.getNome() + " ganhou");
                this.desafiante.ganharLuta();  
                this.desafiado.perderLuta();
                break;
                default:
                break;
            }


        } else {
            System.out.println("A luta não pode acontecer");
        }

    }


    //metodos de acesso
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }



}
