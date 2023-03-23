package aula07;
public class Lutador {
    // Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    // Métodos
    public void apresentar() {
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println(this.getIdade() + " anos");
        System.out.println(this.getAltura() + " m de altura");
        System.out.println("Pesando " + this.getPeso() + "Kg");
        System.out.print("Ganhou: " + this.getVitorias());
        System.out.print(" Perdeu: " + this.getDerrotas());
        System.out.println(" Empatou: " + this.getEmpates());
    }
    public void status() {
        System.out.print(this.getNome());
        System.out.println(" é um peso " + this.getCategoria());
        System.out.print(this.getVitorias() + " vitórias ");
        System.out.print(this.getDerrotas() + " derrotas ");
        System.out.println(this.getEmpates() + " empates");
    }
    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLutar() {
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }
    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }
    public void setNome(String no) {
        this.nome = no;
    }
    public String getNome() {
        return this.nome;
    }
    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    } 
    public String getNacionalidade() {
        return this.nacionalidade;
    }
    public void setIdade(int id) {
        this.idade = id;
    }
    public int getIdade() {
        return this.idade;
    }
    public void setAltura(float al) {
        this.altura = al;
    }
    public float getAltura() {
        return this.altura;
    }
    public void setPeso(float pe) {
        this.peso = pe;
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
    public void setVitorias(int vi) {
        this.vitorias = vi;
    }
    public int getVitorias() {
        return this.vitorias;
    }
    public void setDerrotas(int de) {
        this.derrotas = de;
    }
    public int getDerrotas() {
        return this.derrotas;
    }
    public void setEmpates(int em) {
        this.empates = em;
    }
    public int getEmpates() {
        return this.empates;
    }
}
