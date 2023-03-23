package aula11;
public class Tecnico extends Aluno {
    private int registroProfissional;
    public void praticar() {
        System.out.println("Práticando!");
    }
    public void setRegistroProfissional(int r) {
        this.registroProfissional = r;
    }
    public int getRegistroProfissional() {
        return this.registroProfissional;
    }
}
