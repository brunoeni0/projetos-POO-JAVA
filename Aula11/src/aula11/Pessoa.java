package aula11;
public abstract class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    public final void fazerAniv() {
        this.setIdade(this.getIdade() + 1);
    }
    @Override
    public String toString() {
        return "Dados{nome= " + this.getNome() + ", idade= " + this.getIdade() + ", sexo= " + this.getSexo() + "}";
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
