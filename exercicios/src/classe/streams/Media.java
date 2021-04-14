package streams;

public class Media {
    private Double total = 0.;
    private Integer contadorQuantidade = 0;

    public Media adicionar(Double nota) {
        total += nota;
        contadorQuantidade++;
        return this;
    }

    public Double getMedia() {
        return total / contadorQuantidade;
    }

    public Media calcMedia(Media m1, Media m2) {
        Media resultante = new Media();
        resultante.total = m1.total + m2.total;
        resultante.contadorQuantidade = m1.contadorQuantidade + m2.contadorQuantidade;
        return resultante;
      }
}
