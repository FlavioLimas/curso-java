package streams;

public class Produto {
    private String nome;
    private Double preco;
    private Double desconto;
    private Boolean frete;
    
    public Produto(String nome, Double preco, Double desconto, Boolean frete) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
        this.frete = frete;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public Boolean getFrete() {
        return frete;
    }

    public void setFrete(Boolean frete) {
        this.frete = frete;
    }

}
