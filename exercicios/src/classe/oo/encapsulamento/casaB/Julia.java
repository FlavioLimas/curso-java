package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {
        
    Ana sogra = new Ana();

    void testeAcessos() {
        
        // System.out.println(sogra.segredo); // Atributo privado na Classe Ana
        // System.out.println(sogra.facoDentroDeCasa);
        // System.out.println(sogra.formaDeFalar);
        System.out.println(sogra.todosSabem);
    }
    
}
