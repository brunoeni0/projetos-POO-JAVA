package aula08;
    import java.util.Random;
public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado;
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.setAprovado(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        } else {
            this.setAprovado(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }
    public void lutar() {
        if (this.getAprovado()) {
            System.out.println("### DESAFIADO ###");
            this.getDesafiado().apresentar();
            System.out.println("### DESAFIANTE ###");
            this.getDesafiante().apresentar();
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0 1 2
            System.out.println("===== RESULTADO DA LUTA =====");
            switch (vencedor) {
                case 0 -> {
                    // Empate
                    System.out.println("Empatou");
                    this.getDesafiado().empatarLuta();
                    this.getDesafiante().empatarLuta();
                }
                case 1 -> {
                    // Ganhou o Desafiado
                    System.out.println("Vitória do " + this.getDesafiado().getNome());
                    this.getDesafiado().ganharLuta();
                    this.getDesafiante().perderLuta();
                }
                case 2 -> {
                    // Ganhou o Desafiante
                    System.out.println("Vitória do " + this.getDesafiante().getNome());
                    this.getDesafiante().ganharLuta();
                    this.getDesafiado().perderLuta();
                }
            }
            System.out.println("=============================");
        } else {
            System.out.println("A luta não pode acontecer!");
        }
    }
    public void setDesafiado(Lutador dd) {
        this.desafiado = dd;
    }
    public Lutador getDesafiado() {
        return this.desafiado;
    }
    public void setDesafiante(Lutador dd) {
        this.desafiante = dd;
    }
    public Lutador getDesafiante() {
        return this.desafiante;
    }
    public void setRounds(int r) {
        this.rounds = r;
    }
    public int getRounds() {
        return this.rounds;
    }
    public void setAprovado(boolean a) {
        this.aprovado = a;
    }
    public boolean getAprovado() {
        return this.aprovado;
    }
}
