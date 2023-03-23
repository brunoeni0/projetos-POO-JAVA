package aula08;
public class Lutador {
    //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias, derrotas, empates;
    // Métodos Públicos
    public void apresentar() {
        System.out.println("---------------------------------------------------------------------");
        System.out.println("CHEGOU A HORA! Apresentamos o lutador: " + this.getNome());
        System.out.println("Diretamente de : " + this.getNacionalidade());
        System.out.println("com " + this.getIdade() + " anos e " + this.getAltura() + "m de altura");
        System.out.println("Pesando: " + this.getPeso() + "Kg");
        System.out.println(this.getVitorias() +  " vitórias");
        System.out.println(this.getDerrotas() + " derrotas");
        System.out.println(this.getEmpates() + " empates");
    }
    public void status() {
        System.out.println(this.getNome() + " é um peso " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias() + " vezes");
        System.out.println("Perdeu " + this.getDerrotas() + " vezes");
        System.out.println("Empatou " + this.getEmpates() + " vezes");
    }
    public void ganharLuta() {
        this.setVitorias(getVitorias() + 1);
    }
    public void perderLuta() {
        this.setDerrotas(getDerrotas() + 1);
    }
    public void empatarLuta() {
        this.setEmpates(getEmpates() + 1);
    }
    // Métdos Especiais
    public Lutador(String no, String na, int id, float al,  float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }
    public void setNome(String n) {
        this.nome = n;
    }
    public String getNome() {
        return this.nome;
    }
    public void setNacionalidade(String n) {
        this.nacionalidade = n;
    }
    public String getNacionalidade() {
        return this.nacionalidade;
    }
    public void setIdade(int i) {
        this.idade = i;
    }
    public int getIdade() {
        return this.idade;
    }
    public void setAltura(float a) {
        this.altura = a;
    }
    public float getAltura() {
        return this.altura;
    }
    public final void setPeso(float p) {
        this.peso = p;
        this.setCategoria();
    }
    public float getPeso() {
        return this.peso;
    }
    private void setCategoria() {
        if (this.getPeso() < 52.2) {
            this.categoria = "Inválido";
        } else if (this.getPeso() <= 70.3) {
            this.categoria = "Leve";
        } else if (this.getPeso() <= 83.9) {
            this.categoria = "Médio";
        } else if (this.getPeso() <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }
    public String getCategoria() {
        return this.categoria;
    }
    public void setVitorias(int v) {
        this.vitorias = v;
    }
    public int getVitorias() {
        return this.vitorias;
    }
    public void setDerrotas(int d) {
        this.derrotas = d;
    }
    public int getDerrotas() {
        return this.derrotas;
    }
    public void setEmpates(int e) {
        this.empates = e;
    }
    public int getEmpates() {
        return this.empates;
    }
}
