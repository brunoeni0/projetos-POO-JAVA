package aula15;
public class Gafanhoto extends Pessoa {
    private String login;
    private int totAssistido;
    public void viuMaisUm() {
        this.setTotAssistido(this.getTotAssistido() + 1);
    }
    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() + ", login= " + this.getLogin() + ", totAssistido= " + this.getTotAssistido() + "}";
    }
    public Gafanhoto(String nome, int idade, String sexo, String lo) {
        super(nome, idade, sexo);
        this.login = lo;
        this.totAssistido = 0;
    }
    public void setLogin(String lo) {
        this.login = lo;
    }
    public String getLogin() {
        return this.login;
    }
    public void setTotAssistido(int ta) {
        this.totAssistido = ta;
    }
    public int getTotAssistido() {
        return this.totAssistido;
    }
}
