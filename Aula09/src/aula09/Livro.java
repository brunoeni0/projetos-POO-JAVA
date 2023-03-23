package aula09;
public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public String detalhes() {
        return "Livro{" + "titulo= " + this.getTitulo() +
               "\nautor= " + this.getAutor() +
               "\ntotPaginas= " + this.getTotPaginas() +
               " pagAtual= " + this.getPagAtual() +
               "\naberto= " + this.getAberto() + 
               "\nleitor= " + this.getLeitor().getNome() +
               " idade= " + this.getLeitor().getIdade() +
               " sexo= " + this.getLeitor().getSexo() + "}\n";
    }
    
    @Override
    public void abrir() {
        this.setAberto(true);
    }
    @Override
    public void fechar() {
        this.setAberto(false);
    }
    @Override
    public void folhear(int p) {
        if (p < this.getTotPaginas()) {
            this.setPagAtual(p);
            this.setAberto(true);
        } else {
            this.setPagAtual(0);
            this.setAberto(false);
        }
    }
    @Override
    public void avancarPag() {
        if (this.getPagAtual() < this.getTotPaginas()) {
            this.setPagAtual(this.getPagAtual() + 1);
        }
    }
    @Override
    public void voltarPag() {
        if (this.getPagAtual() > 0) {
            this.setPagAtual(this.getPagAtual() - 1);
        }
    }
    public Livro(String t, String a, int p, Pessoa l) {
        this.titulo = t;
        this.autor = a;
        this.totPaginas = p;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = l;
    }
    
    public void setTitulo(String t) {
        this.titulo = t;
    }
    public String getTitulo() {
        return this.titulo;
    }
    public void setAutor(String a) {
        this.autor = a;
    }
    public String getAutor() {
        return this.autor;
    }
    public void setTotPaginas(int t) {
        this.totPaginas = t;
    }
    public int getTotPaginas() {
        return this.totPaginas;
    }
    public void setPagAtual(int p) {
        this.pagAtual = p;
    }
    public int getPagAtual() {
        return this.pagAtual;
    }
    public void setAberto(boolean a) {
        this.aberto = a;
    }
    public boolean getAberto() {
        return this.aberto;
    }
    public void setLeitor(Pessoa l) {
        this.leitor = l;
    }
    public Pessoa getLeitor() {
        return this.leitor;
    }
}
