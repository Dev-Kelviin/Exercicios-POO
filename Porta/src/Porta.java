public class Porta {

    String material;
    boolean maçaneta;
    boolean trnacada;

    void status(){

        System.out.println("\nA porta é feita de "+ this.material);
        System.out.println("A porta tem maçaneta? " + this.maçaneta);
         
    }

    void trancar(){
        this.trnacada = true;
    }

    void destrancar(){
        this.trnacada = false;
    }

    void abrirProta(){
        if(this.trnacada == true ){
            System.out.println("Não é possivel a brir a porta pois estra trancada \nVoce precis destrancar a porta\n");
        } else if (this.trnacada == false){
            System.out.println("Prota aberta com sucesso!");
        } else {
            System.out.println("ERRO!");
        }
    }

}
