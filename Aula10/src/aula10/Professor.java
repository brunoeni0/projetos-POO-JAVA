package aula10;
public class Professor extends Pessoa {
    private String especialidade;
    private float salario;
    
    public void receberAum(float v) {
        this.setSalario(this.getSalario() + v);
    }

    public void setEspecialidade(String e) {
        this.especialidade = e;
    }
    public String getEspecialidade() {
        return this.especialidade;
    }
    public void setSalario(float s) {
        this.salario = s;
    }
    public float getSalario() {
        return this.salario;
    }
}
