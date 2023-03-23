package aula15;
public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;
    public void avaliar() {
        this.getFilme().setAvaliacao(5);
    }
    public void avaliar(int nota) {
        this.getFilme().setAvaliacao(nota);
    }
    public void avaliar(float porc) {
        int tot;
        if (porc <= 20) {
            tot = 3;
        } else if (porc <= 50) {
            tot = 5;
        } else if (porc <= 90) {
            tot = 8;
        } else {
            tot = 10;
        }
        this.getFilme().setAvaliacao(tot);
    }
    @Override
    public String toString() {
        return "Visualizacao{espectador= " + this.getEspectador() + ", filme= " + this.getFilme() + "}";
    }
    public Visualizacao(Gafanhoto esp, Video filme) {
        this.espectador = esp;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }
    public void setEspectador(Gafanhoto esp) {
        this.espectador = esp;
    }
    public Gafanhoto getEspectador() {
        return this.espectador;
    }
    public void setFilme(Video filme) {
        this.filme = filme;
    }
    public Video getFilme() {
        return this.filme;
    }
}
