package exercicios;
public class Exercicios {
    public static void main(String[] args) {
        Sabonete sabo = new Sabonete();
        sabo.cheiro = "bom";
        sabo.embalado = true;
        sabo.tipo = "glicerina";
        sabo.peso = 0.70f;
        sabo.usado = 0;
        
        sabo.status();
        
        sabo.cheirar();
        sabo.abrir();
        sabo.limpar();
        sabo.lavar();
        sabo.tirar(1);
        
        System.out.println("");
        
        Controle contro = new Controle();
        contro.botoes = "ligar";
        contro.pilhas = 2;
        contro.ligado = false ;
        contro.tamanho = 0.20f;
        contro.tampado = true;
        
        contro.status();
        
        contro.abrir();
        contro.tirar();
        contro.colocar();
        contro.tampar();
        contro.apertar();
    }
}