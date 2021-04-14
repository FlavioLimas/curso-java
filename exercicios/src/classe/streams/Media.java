package streams;

public class Media {
    private Double total;
    private Integer contadorQuantidade;

    public Media(Double nota) {
        adicionar(nota);
    }

    public void adicionar(Double nota) {
        total += nota;
        contadorQuantidade++;
    }

    public Double getMedia() {
        return total / contadorQuantidade;
    }
}
