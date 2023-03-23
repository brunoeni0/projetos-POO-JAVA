package exercicios;
public class Valorant {
    boolean jogar;
    int partidas;
    String skins;
    String agente;
    float loja;
    
    void status(){
        System.out.println("Você está jogando? " + this.jogar);
        System.out.println("Quantas partidas você tem? " + this.partidas);
        System.out.println("Qual é a sua skin favorita? " + this.skins);
        System.out.println("Você pego o agente: " + this.agente);
        System.out.println("Loja tem valor de: " + this.loja);
    }
    
    void iniciar() {
        if (this.jogar == false) {
            System.out.println("Procurando partida!");
            this.jogar = true;
            this.partidas += 1;
        } else {
            System.out.println("ERRO!, Você já deu play.");
        }
    }
    
    void historico() {
        System.out.println("Você tem " + this.partidas + " jogadas!");
        System.out.println("E na sua última partida, você jogou com o agente " + this.agente + " e com a skin " + this.skins);
    }
    
    void trocar(String nome) {
        if (jogar == true) {
            this.agente = nome;
            System.out.println("Você escolheu " + this.agente + " como agente e tenha um bom jogo!");
        } else {
            System.out.println("ERRO!, Você ainda não iniciou à partida para escolher outro agente.");
        }
    }
    
    void comprar(float vp, String skin) {
        if (loja <= vp) {
            this.skins = skin;
            System.out.println("Você comprou a skin " + this.skins);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}
