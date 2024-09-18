public class Caneta {

    String cor;
    String modelo;
    float ponta;
    int carga;
    boolean tampada;

    void satus(){

        System.out.println("Uma caneta "+ this.cor);
        System.out.println("De modelo "+ this.modelo);
        System.out.println("A caneta esta tampada ? "+ this.tampada);

    }


    void rabiscar(){
        if (this.tampada == true ){
            System.out.println("Caneta tampada, não é possivel rabiscar\n\n");
        } else if (this.tampada == false) {
            System.out.println("Rabiscado com sucesso!\n\n");
        } 
    }

    void tampar(){
        this.tampada = true;
    }

    void destampar(){
        this.tampada = false;
    }


}

