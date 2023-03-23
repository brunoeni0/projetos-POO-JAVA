package aula14;
public class Video implements AcoesVideo {
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;
    @Override
    public void play() {
        this.setReproduzindo(true);
    }
    @Override
    public void pause() {
        this.setReproduzindo(false);
    }
    @Override
    public void like() {
       this.setCurtidas(this.getCurtidas() + 1);
    }
    @Override
    public String toString() {
        return "Video{titulo= " + this.getTitulo() + ", avanliacao= " + this.getAvaliacao() + ", views= " + this.getViews() + ", curtidas= " + this.getCurtidas() + ", reproduzindo= " + this.getReproduzindo() + "}";
    }
    public Video (String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }
    public void setTitulo(String t) {
        this.titulo = t;
    }
    public String getTitulo() {
        return this.titulo;
    }
    public void setAvaliacao(int a) {
        this.avaliacao = a;
    }
    public int getAvaliacao() {
        return this.avaliacao;
    }
    public void setViews(int v) {
        this.views = v;
    }
    public int getViews() {
        return this.views;
    }
    public void setCurtidas(int c) {
        this.curtidas = c;
    }
    public int getCurtidas() {
        return this.curtidas;
    }
    public void setReproduzindo(boolean r) {
        this.reproduzindo = r;
    }
    public boolean getReproduzindo() {
        return this.reproduzindo;
    }
}
