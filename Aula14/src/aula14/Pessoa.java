package aula14;
public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected float experiencia;
    protected abstract void ganharExp();
    @Override
    public String toString() {
        return "Pessoa{nome= " + this.getNome() + ", idade= " + this.getIdade() + ", sexo= " + this.getSexo() + ", experiencia= " + this.getExperiencia() + "}";
    }
    public Pessoa(String no,int id,String se) {
        this.nome = no;
        this.idade = id;
        this.sexo = se;
        this.experiencia = 0;
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
    public void setExperiencia(float e) {
        this.experiencia = e;
    }
    public float getExperiencia() {
        return this.experiencia;
    }
}
