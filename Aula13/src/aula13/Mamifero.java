package aula13;
public class Mamifero extends Animal {
    protected String corPele;
    @Override
    public void emitirSom() {
        System.out.println("Som de Mamífero");
    }
}
