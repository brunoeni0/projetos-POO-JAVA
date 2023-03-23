package aula14;
public class Gafanhoto extends Pessoa {
    private String login;
    private int totAssistido;
    public void viuMaisUm() {
        this.setTotAssistido(this.getTotAssistido() + 1);
    }
    @Override
    public void ganharExp() {
        this.setExperiencia(this.getExperiencia() + 1);
    }
    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() + "\n login= " + this.getLogin() + ", totAssistido= " + this.getTotAssistido() + "}";
    }
    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }
    public void setLogin(String l) {
        this.login = l;
    }
    public String getLogin() {
        return this.login;
    }
    public void setTotAssistido(int t) {
        this.totAssistido = t;
    }
    public int getTotAssistido() {
        return this.totAssistido;
    }
}
