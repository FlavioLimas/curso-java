package streams;

public class Produto {
    private Integer id = 0;
    private String nome;
    
    public Produto(String nome) {
        this.nome = nome;
        id += 1;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

}
