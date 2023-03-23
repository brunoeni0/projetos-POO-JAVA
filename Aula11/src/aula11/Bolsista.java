package aula11;
public class Bolsista extends Aluno {
    private float bolsa;
    public void RenovarBolsa() {
        System.out.println("Renovando bolsa de " + this.getNome());
    }
    @Override
    public void pagarMensalidade() {
        System.out.println(this.getNome() + " é bolsista! Pagamento facilitado!");
    }
    public void setBolsa(float b) {
        this.bolsa = b;
    }
    public float getBolsa() {
        return this.bolsa;
    }
}
