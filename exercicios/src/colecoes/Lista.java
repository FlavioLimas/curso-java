import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Usuarios> list = new ArrayList<>();

        Usuarios u1 = new Usuarios("Ana");
        list.add(u1);
        list.add(new Usuarios("Carlos"));
        list.add(new Usuarios("Lia"));
        list.add(new Usuarios("Bia"));
        list.add(new Usuarios("Manu"));

        System.out.println(list.get(3).nome);

        for (Usuarios u : list) {
            System.out.println(u.nome);
        }
    }
}
