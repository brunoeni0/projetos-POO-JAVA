package aula05;
public class ContaBanco {
    // Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    // Métodos Personalizados
    public void estadoAtual() {
        System.out.println("----------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    
    public void abrirConta(String t) {
        if (t.equals("CC")) {
            this.setTipo(t);
            this.setStatus(true);
            this.setSaldo(50);
            System.out.println("Conta Poupança aberta com sucesso!");
        } else if (t.equals("CP")) {
            this.setTipo(t);
            this.setStatus(true);
            this.setSaldo(150);
            System.out.println("Conta Corrente aberta com sucesso!");
        } else {
            System.out.println("ERRO!, Escolha [ CC ] para Conta Corrente ou [ CP ] para Conta Poupança");
        }
    }
    
    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta não pode ser fechada porque ainda tem dinheiro.");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta não pode ser fechada porque pois tem débito");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    
    public void depositar(float v) {
        if (this.getStatus()) {
            // this.saldo = this.saldo + v
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado com sucesso na conta de " + this.getDono());
        } else {
            System.out.println("Impossível depositar em uma conta fechada!");
        }
    }
    
    public void sacar (float v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado com sucesso na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente para saque");
            }
        } else {
            System.out.println("Impossível sacar de uma conta fechada!");
        }
    }
    
    public void pagarMensal() { 
        float v = 0;
        if ("CC".equals(this.getTipo())) {
            v = 12;
        } else if ("CP".equals(this.getTipo())) {
            v = 20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade cobrada com sucesso");
        } else {
            System.out.println("Impossível pagar com uma conta fechada!");
        }
    }
    // Métodos Especiais
    public void ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }
    
    public void setNumConta(int n) {
        this.numConta = n;
    }
    
    public int getNumConta() {
        return this.numConta;
    }
    
    public void setTipo(String t) {
        this.tipo = t;
    }
    
    public String getTipo() {
        return this.tipo;
    }
    
    public void setDono(String d) {
        this.dono = d;
    }
    
    public String getDono() {
        return this.dono;
    }
    
    public void setSaldo(float s) {
        this.saldo = s;
    }
    
    public float getSaldo() {
        return this.saldo;
    }
    
    public void setStatus(boolean s) {
        this.status = s;
    }
    
    public boolean getStatus() {
        return this.status;
    }  
}
