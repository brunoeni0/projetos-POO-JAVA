package exercicios;
public class Controle {
    String botoes;
    int pilhas;
    boolean ligado;
    float tamanho;
    boolean tampado;
    
    void status () {
        System.out.println("Qual botão quer apertar? " + this.botoes);
        System.out.println("Quantas pilhas o controle tem? " + this.pilhas);
        System.out.println("O controle está ligado? " + this.ligado);
        System.out.println("O tamanho do controle é de " + this.tamanho);
        System.out.println("O controle está tampado? " + this.tampado);
    }

    void abrir(){
        if (this.tampado == true) {
             System.out.println("Abrindo o controle!");
             this.tampado = false;
        } else {
            System.out.println("ERRO!, controle já aberto.");
        }
    }
    
    void tampar(){
        if (this.tampado == false) {
            System.out.println("Tampado o controle!");
            this.tampado = true;
        } else {
            System.out.println("ERRO!, Erro controle já tampado.");
        }
    }
    
    void tirar() {
        if (this.tampado == false){
            System.out.println("Tirando as pilhas antigas!");
            this.pilhas -= 2;
        } else {
            System.out.println("ERRO!, Não tem como tirar as pilhas com o controle tampado.");
        }
    }
    
    void colocar() {
        if (this.tampado == false){
            System.out.println("Colocando pilhas novas!");
            this.pilhas += 2;
        } else {
            System.out.println("ERRO!, Não tem como trocar as pilhas com o controle tampado.");
        }
    }
    
    void apertar () {
        if (this.pilhas < 2) {
            System.out.println("Não tem pilhas suficiente. Por favor coloque mais pilhas!");
        } else if (this.pilhas == 2) {
            if (this.botoes.equals("deligar") && this.ligado == true) {
                System.out.println("Desligando a tv!");
                this.ligado = false;
            } else if (this.botoes.equals("ligar") && this.ligado == false) {
                System.out. println("Ligando a tv!");
                this.ligado = true;
            } else if (this.botoes.equals("aumentar") && this.ligado == true) {
                System.out.println("Aumentando o volume!");
            } else if (this.botoes.equals("diminuir") && this.ligado == true) {
                System.out.println("Diminuindo o volume!");
            }
        } else {
            System.out.println("ERRO!, Tem pilhas demais.");
        }
    }
}
