package aula11;
public class Aula11 {
    public static void main(String[] args) {
        // Programa Principal
        // Pessoa p1 = new Pessoa();
        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());
        System.out.println("");
        Aluno a1 = new Aluno();
        a1.setNome("Cláudio");
        a1.setMatricula(1111);
        a1.setCurso("Informática");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade();
        System.out.println(a1.toString());
        System.out.println("");
        Bolsista b1 = new Bolsista();
        b1.setNome("Pedro");
        b1.setMatricula(1112);
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.setIdade(25);
        b1.pagarMensalidade();
        System.out.println(b1.toString());
    }
}
