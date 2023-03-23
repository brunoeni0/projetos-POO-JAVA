package aula12;
public class Aula12 {
    public static void main(String[] args) {
        //Programa Principal
        //Animal a = new Animal();
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        m.setPeso(85.3f);
        m.setIdade(2);
        m.setMembros(4);
        m.locomover(); // Correndo
        m.alimentar(); // Mamando
        m.emitirSom(); // Som de Mamífero
        
        p.setPeso(0.35f);
        p.setIdade(1);
        p.setMembros(0);
        p.locomover(); // Nadando
        p.alimentar(); // Comendo Substâncias
        p.emitirSom(); // Peixe não faz Som
        p.soltarBolha();
        
        a.setPeso(0.89f);
        a.setIdade(2);
        a.setMembros(2);
        a.locomover(); // Voando
        a.alimentar(); // Comendo Frutas
        a.emitirSom(); // Som de Ave
        a.fazerNinho();
        
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        
        m.setPeso(5.70f);
        m.setIdade(8);
        m.setMembros(4);
        m.locomover(); // Correndo
        m.alimentar(); // Mamando
        m.emitirSom(); // Som de Mamífero
        
        c.setPeso(55.30f);
        c.setIdade(3);
        c.setMembros(4);
        c.locomover(); // Pulando
        c.alimentar(); // Mamando
        c.emitirSom(); // Som de Mamífero
        c.usarBolsa();
        
        k.setPeso(3.94f);
        k.setIdade(3);
        k.setMembros(4);
        k.locomover(); // Correndo
        k.alimentar(); // Mamando
        k.emitirSom(); // Som de Mamífero
        k.abanarRabo();
        k.enterrarOsso(); 
    }
}
