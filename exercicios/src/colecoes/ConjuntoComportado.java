import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {
        Set<String> listaAprovados = new HashSet<>();
        listaAprovados.add("Ana");
        listaAprovados.add("Carlos");
        listaAprovados.add("Luca");
        listaAprovados.add("Pedro");

        for (String candidato : listaAprovados) {

            System.out.println(candidato);
        }

        System.out.println();

        SortedSet<String> listaOrdenadaAprovados = new TreeSet<>();
        listaOrdenadaAprovados.add("Ana");
        listaOrdenadaAprovados.add("Carlos");
        listaOrdenadaAprovados.add("Luca");
        listaOrdenadaAprovados.add("Pedro");

        for (String item : listaOrdenadaAprovados) {
            System.out.println(item);
        }

        System.out.println();

        SortedSet<Integer> nums = new TreeSet<>();
        nums.add(1);
        nums.add(120);
        nums.add(2);
        nums.add(6);

        for (Integer n : nums) {
            System.out.println(n);
        }
    }
}
