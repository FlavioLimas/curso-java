package streams;

public class MediaTeste {
  public static void main(String[] args) {
    
    Media m1 = new Media().adicionar(8.3).adicionar(6.7);
    Media m2 = new Media().adicionar(7.9).adicionar(6.6);

    System.out.println(m1.getMedia());
    System.out.println(m2.getMedia());

    System.out.println(Media.calcMedia(m1, m2).getMedia());
  }
    
}
