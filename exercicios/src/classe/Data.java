public class Data {

    int dia;
    int mes;
    int ano;

    String obterDataFormatada(int dia, int mes, int ano) {
        String diaS = (dia < 10 ? ("0" + Integer.toString(dia) + "/") : (Integer.toString(dia) + "/"));
        String mesS = (mes < 10 ? ("0" + Integer.toString(mes) + "/") : (Integer.toString(mes) + "/"));
        String data = (diaS + mesS + Integer.toString(ano));
        return data;
    }
    
}
