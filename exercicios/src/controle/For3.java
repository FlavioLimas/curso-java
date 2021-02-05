public class For3 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.print("\nlinha " + i);
            for (int j = 0; j < 3; j++) {
                System.out.print(" coluna | " + j);
                for (int x = 0; x < 3; x++) {
                    System.out.print(" 3 D " + x);
                }
            }
        }
    }    
}
