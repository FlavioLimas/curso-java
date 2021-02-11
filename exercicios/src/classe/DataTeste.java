public class DataTeste {
    public static void main(String[] args) {
        
        Data data1 = new Data(25, 11, 1985);

        Data data2 = new Data();

        System.out.println(data1.obterDataFormatada());
        System.out.println(data2.obterDataFormatada());

        data1.imprimirDataFormatada();
        data2.imprimirDataFormatada();
    }
}
