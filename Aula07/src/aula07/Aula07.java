package aula07;
public class Aula07 {
    public static void main(String[] args) {
       Lutador l[] = new Lutador[5];
       
        l[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 3, 1);
        l[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 57.8f, 14, 2, 3);
        l[3] = new Lutador("Dead Code", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
        
        l[2].status();
  
        //System.out.println("\n" + l[3].getCategoria());
        System.out.println();
  
        l[1].ganharLuta();
        l[0].empatarLuta();
        l[0].apresentar();
    }
}
