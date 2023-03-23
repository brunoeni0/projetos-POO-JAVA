package exercicios;
public class Exercicios {
    public static void main(String[] args) {
        Youtube yt = new Youtube();
        yt.volume = 25;
        yt.pause = false;
        yt.like = 88;
        yt.video = "League of Legends";
        yt.tempo = 1.5f;
        
        yt.status();
        
        yt.aumentar();
        yt.diminuir();
        yt.trocar("ANCAPSU");
        yt.curtir();
        yt.play();
        
        System.out.println("");
        
        Valorant val = new Valorant();
        val.jogar = false;
        val.partidas = 358;
        val.skins = "Neon";
        val.agente = "Raze";
        val.loja = 7.300f;
        
        val.status();
        
        val.iniciar();
        val.historico();
        val.trocar("sage");
        val.comprar(7.300f, "sabre");
    }
}
