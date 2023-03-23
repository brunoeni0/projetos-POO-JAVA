package aula03;
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    public void status() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Uma caneta: " + cor);
        System.out.println("Ponta: " + ponta);
        System.out.println("Carga: " + carga);
        System.out.println("Está tampada? " + tampada);
    }
    
    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO! Não posso rabiscar");
        } else {
            System.out.println("Estou Rabiscando");
        }
    }
    protected void tampar() {
        this.tampada = true;
    }
    protected void destampar() {
        this.tampada = false;
    }
   
}
