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
}
