package aula04;
public class Caneta {
    public String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;
    
    //public Caneta(){ // Este é o método Construtor
    //    Tampar();
    //    cor = "Azul";
    //}
    
    public Caneta(String m,String c, float p){
            setModelo(m);
            setCor(c);
            setPonta(p);
            tampar();
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        modelo = m;
    }
     
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p) {
        this.ponta = p;
    }
    
    public String getCor(){
        return this.cor;
    }
    public void setCor(String c){
        this.cor = c;
    }
    
     public void status() {
        System.out.println("SOBRE A CANETA:");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Tampada: " + this.tampada);
        System.out.println();
    }
}
