package aula12;
public class Reptil extends Animal {
    private String corEscama;
    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }
    @Override
    public void alimentar() {
        System.out.println("Comendo Vegetais");
    }
    @Override
    public void emitirSom() {
        System.out.println("Som de Réptil");
    }
    public void setCorEscama(String c) {
        this.corEscama = c;
    }
    public String getCorEscama() {
        return this.corEscama;
    }
}
