package streams;

public class Media {
    private Double total;
    private Integer contadorQuantidade;

    public Media(Double total) {
        adicionar(total);
    }

    public void adicionar(Double n) {
        total += n;
        contadorQuantidade++;
    }

    public Double getMedia() {
        return total / contadorQuantidade;
    }
}
