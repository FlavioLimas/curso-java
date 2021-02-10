public class DataTeste {
    public static void main(String[] args) {
        
        Data data1 = new Data();
        data1.dia = 25;
        data1.mes = 11;
        data1.ano = 1985;

        Data data2 = new Data();
        data2.dia = 1;
        data2.mes = 1;
        data2.ano = 2021;

        System.out.println(data1.obterDataFormatada());
        System.out.println(data2.obterDataFormatada());

        data1.imprimirDataFormatada();
        data2.imprimirDataFormatada();
    }
}
