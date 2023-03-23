package aula10;
public class Pessoa {
    // Atributos
    private String nome;
    private int idade;
    private String sexo;
    // Métodos
    public void fazerAniver() {
        this.setIdade(this.getIdade() + 1);
    }
    // Métodos Especiais
    @Override
    public String toString() {
        return "Pessoa{" + "nome= " + this.getNome() + ", idade= " + this.getIdade() + ", sexo= " + this.getSexo() + "}";
    }
    public void setNome(String n) {
        this.nome = n;
    }
    public String getNome() {
        return this.nome;
    }
    public void setIdade(int i) {
        this.idade = i;
    }
    public int getIdade() {
        return this.idade;
    }
    public void setSexo(String s) {
        this.sexo = s;
    }
    public String getSexo() {
        return this.sexo;
    }
}
