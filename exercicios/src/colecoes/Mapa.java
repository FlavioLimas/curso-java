import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        
        Map<Integer, String> usuarios = new HashMap<>();
        usuarios.put(1, "Roberto");
        usuarios.put(2, "Ricardo");
        usuarios.put(20, "Rafaela");
        usuarios.put(4, "Rebeca");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());
        
        System.out.println(usuarios.keySet()); // Retorna as chaves do objeto
        System.out.println(usuarios.values()); // Retorna os valores do objeto

        System.out.println(usuarios.containsKey(20)); // Rotorna true se houver uma cheve igual a informada
    }
}
