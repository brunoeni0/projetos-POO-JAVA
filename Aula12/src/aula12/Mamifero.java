package aula12;
public class Mamifero extends Animal {
    private String corPelo;
    @Override
    public void locomover() {
        System.out.println("Corrrendo");
    } 
    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }
    @Override
    public void emitirSom() {
        System.out.println("Som de Mamífero");
    }
    public void setCorPelo(String c) {
        this.corPelo = c;
    }
    public String getCorPelo() {
        return this.corPelo;
    }
}
