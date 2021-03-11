package oo.encapsulamento.casaA;

public class Paulo {
    Ana esposa = new Ana();

    void testeAcessos() {
        
        System.out.println(esposa.segredo); // Atributo privado na Classe Ana
        System.out.println(esposa.facoDentroDeCasa);
        System.out.println(esposa.formaDeFalar);
        System.out.println(esposa.todosSabem);
    }
}
