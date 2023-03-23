package exercicios;
public class Youtube {
    int volume;
    boolean pause;
    int like;
    String video;
    float tempo;
    
    void status (){
        System.out.println("O volume do vídeo tá em " + this.volume);
        System.out.println("O vídeo está pausado? " + this.pause);
        System.out.println("O vídeo tem " + this.like + " Curtidas!");
        System.out.println("O nome do vídeo é " + this.video);
        System.out.println("O tempo do vídeo tá no " + this.tempo + " min");
    }
    
    void aumentar() {
        if (this.volume >= 0) {
            if (this.volume > 95){
                this.volume = 100;
            } else {
                this.volume += 5;
            }
            System.out.println("O volume aumentado é " + this.volume + "%");
        } else if (this.volume > 100) {
            System.out.println("ERRO!, O volume máximo não pode passar de 100%");
        } else {
            System.out.println("ERRO!, O volume mínimo não pode passar de 0%");
        }
    }
    
    void diminuir() {
        if (this.volume > 0) {
            if (this.volume < 5) {
                this.volume = 0;
            } else {
                this.volume -= 5;
            }
            System.out.println("O volume diminuido é " + this.volume + "%");
        } else if (this.volume > 100) {
            System.out.println("ERRO!, O volume máximo não pode passar de 100%");
        } else {
            System.out.println("ERRO!, O volume mínimo não pode passar de 0%");
        }
    }
    
    void trocar(String vi) {
        System.out.println("O novo vídeo é " + vi);
        this.video = vi;
    }
    
    void curtir() {
        this.like += 1;
    }
    void play(){
        if (this.pause == true) {
            System.out.println("Você deu play no vídeo!");
            this.pause = false;
        } else {
            System.out.println("Você acabou de da pause no vídeo!");
            this.pause = true;
        }
    }
}
