package exercicios;
public class Sabonete {
    String cheiro;
    float peso;
    boolean embalado;
    String tipo;
    int usado;
    
    void status() {
        System.out.println("Cheiro tem valor: " + this.cheiro);
        System.out.println("Peso tem valor: " + this.peso);
        System.out.println("Embalado tem valor: " + this.embalado);
        System.out.println("Tipo tem valor: " + this.tipo);
        System.out.println("Usado tem valor: " + this.usado);
    }
    
    void abrir(){
        if (this.embalado == true) {
            System.out.println("Abrindo A embalagem!");
            this.embalado = false;
        } else {
            System.out.println("ERRO, Já está aberta!");
        }
    }
    void tirar(int op){
        if (this.embalado == false && op == 1) {
            System.out.println("Tirando da embalagem!");
        } else if (this.embalado == false && op == 2) {
            System.out.println("Tirando da saboneteira!");
        } else {
            System.out.println("ERRO!, Ainda está na embalagem.");
        }
    }
    void limpar(){
        System.out.println("Limpando o corpo!" + (this.usado += 10) + "% gasto do sabonete");
    }
    void lavar(){
        System.out.println("Lavando as mãos! " + (this.usado += 2) + "% gasto do sabonete");
    }
    void cheirar() {
        System.out.println("O cheiro do sabonete é " + this.cheiro);
    }
}
