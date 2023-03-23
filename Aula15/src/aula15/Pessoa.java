package aula15;
public class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected float experiencia;
    protected void ganharExp() {
        this.setExperiencia(this.getExperiencia() + 1);
    }
    @Override
    public String toString() {
        return "Pessoa{nome= " + this.getNome() + ", idade= " + this.getIdade() + ", sexo= " + this.getSexo()
                + ", experiencia= " + this.getExperiencia() + "}";
    }
    public Pessoa(String no, int id, String se) {
        this.nome = no;
        this.idade = id;
        this.sexo = se;
        this.experiencia = 0;
    }
    public void setNome(String no) {
        this.nome = no;
    }
    public String getNome() {
        return this.nome;
    }
    public void setIdade(int id) {
        this.idade = id;
    }
    public int getIdade() {
        return this.idade;
    }
    public void setSexo(String se) {
        this.sexo = se;
    }
    public String getSexo() {
        return this.sexo;
    }
    public void setExperiencia(float exp) {
        this.experiencia = exp;
    }
    public float getExperiencia() {
        return this.experiencia;
    }
}
