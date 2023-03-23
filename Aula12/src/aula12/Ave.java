package aula12;
public class Ave extends Animal {
    private String corPena;
    public void fazerNinho() {
        System.out.println("Construindo Ninho");
    }
    @Override
    public void locomover() {
        System.out.println("Voando");
    }
    @Override
    public void alimentar() {
        System.out.println("Comendo Frutas");
    }
    @Override
    public void emitirSom() {
        System.out.println("Som de Ave");
    }
    public void setCorPena(String c) {
        this.corPena = c;
    }
    public String getCorPena() {
        return this.corPena;
    }
}
