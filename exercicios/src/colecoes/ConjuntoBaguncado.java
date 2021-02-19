import java.util.HashSet;

public class ConjuntoBaguncado {
    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println(conjunto.size());
        
        conjunto.add("Teste"); // Esse elemento ja foi inserido e será ignorado a inserção do mesmo
        System.out.println(conjunto.size());
        
        
    }
}
