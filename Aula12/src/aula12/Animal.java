package aula12;
public abstract class Animal {
    // Atributos de Animal
    private float peso;
    private int idade;
    private int membros;
    // Métodos de Animal
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
    public void setPeso(float p) {
        this.peso = p;
    }
    public float getPeso() {
        return this.peso;
    }
    public void setIdade(int i) {
        this.idade = i;
    }
    public int getIdade() {
        return this.idade;
    }
    public void setMembros(int m) {
        this.membros = m;
    }
    public int getMembros() {
        return this.membros;
    }
}
