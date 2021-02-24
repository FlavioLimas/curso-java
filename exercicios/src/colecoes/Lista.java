import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Users> list = new ArrayList<>();

        Users u1 = new Users("Ana");
        list.add(u1);
        list.add(new Users("Carlos"));
        list.add(new Users("Lia"));
        list.add(new Users("Bia"));
        list.add(new Users("Manu"));

        System.out.println(list.get(3));
        
        System.out.println(">>> " + list.remove(1));
        System.out.println("Tem? " + list.remove(new Users("Manu")));
        System.out.println("Tem? " + list.contains(new Users("Lia")));


        for (Users u : list) {
            System.out.println(u);
        }
    }
}
