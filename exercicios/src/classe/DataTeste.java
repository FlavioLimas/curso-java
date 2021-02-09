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

        String niver = Integer.toString(data1.dia);
        niver += "/";
        niver += Integer.toString(data1.mes);
        niver += "/";
        niver += Integer.toString(data1.ano);

        String anoNovo = Integer.toString(data2.dia);
        anoNovo += "/";
        anoNovo += Integer.toString(data2.mes);
        anoNovo += "/";
        anoNovo += Integer.toString(data2.ano);

        System.out.println("Meu Aniversário " + niver);
        System.out.println("Ano novo " + anoNovo);
    }
}
