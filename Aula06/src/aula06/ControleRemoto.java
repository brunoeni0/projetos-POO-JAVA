package aula06;
public class ControleRemoto implements Controlador {
    // Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    // Métodos Abstratos
    @Override
    public void ligar() {
        if (!this.getLigado()) {
            this.setLigado(true);
        } else {
            System.out.println("ERRO!, já está ligado...");
        }
    }
    @Override
    public void desligar() {
        if (this.getLigado()) {
            this.setLigado(false);
        } else {
            System.out.println("ERRO!, já está desligado...");
        }
    }
    @Override
    public void abrirMenu() {
        if (this.getLigado()) {
            System.out.println("------ MENU ------");
            System.out.println("Está ligado? " + this.getLigado());
            System.out.println("Está tocando? " + this.getTocando());
            System.out.print("Volume: " + this.getVolume() + " ");
            for (int c = 0; c < this.getVolume(); c+= 10) {
                System.out.print("|");
            }
            System.out.println("");
        } else {
            System.out.println("ERRO!, Não tem como abrir o menu com o controle desligado.");
        }
    }
    @Override
    public void fecharMenu() {
        if (this.getLigado()) {
            System.out.println("Fechando Menu...");
        } else {
            System.out.println("ERRO!, Não tem como fechar o menu com o controle desligado.");
        }
    }
    @Override
    public void maisVolume() {
        if (this.getLigado() && this.getVolume() < 100) {
            this.setVolume(this.getVolume() + 5);
        } else {
            System.out.println("Impossível aumentar volume");
        }
    }
    @Override
    public void menosVolume() {
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(this.getVolume() - 5);
        } else {
            System.out.println("Impossível diminuir volume");
        }
    }
    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        } else {
            System.out.println("ERRO!, Não conseguir Mutar o som!");
        }
    }
    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        } else {
            System.out.print("ERRO!, Não conseguir Desmutar o som!");
        }
    }
    @Override
    public void play() {
        if (this.getLigado() && !this.getTocando()) {
            this.setTocando(true);
        } else {
            System.out.println("Não conseguir reproduzir");
        }
    }
    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()) {
            this.setTocando(false);
        } else {
            System.out.println("Não conseguir pausar");
        }
    }
    // Métodos Especiais
    public ControleRemoto() {
        this.setVolume(50);
        this.setLigado(false);
        this.setTocando(false);
    }
    private void setVolume(int v) {
        this.volume = v;
    }
    private int getVolume() {
        return this.volume;
    }
    private void setLigado(boolean l) {
        this.ligado = l;
    }
    private boolean getLigado() {
        return this.ligado;
    }
    private void setTocando(boolean t) {
        this.tocando = t;
    }
    private boolean getTocando() {
        return this.tocando;
    }
}
