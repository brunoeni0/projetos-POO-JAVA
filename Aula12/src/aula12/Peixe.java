package aula12;
public class Peixe extends Animal {
    private String corEscama;
    public void soltarBolha() {
        System.out.println("Soltando bolha");
    }
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }
    @Override
    public void alimentar() {
        System.out.println("Comendo Substâncias");
    }
    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz Som");
    }
    public void setCorEscama(String c) {
        this.corEscama = c;
    }
    public String getCorEscama() {
        return this.corEscama;
    }
}
