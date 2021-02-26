import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        HashSet<Users> usuarios = new HashSet<>();

        usuarios.add(new Users("Pedro"));
        usuarios.add(new Users("Ana"));
        usuarios.add(new Users("Guilherme"));
        Boolean resultado = usuarios.contains(new Users("Guilherme"));
        System.out.println(resultado);
    }
}
