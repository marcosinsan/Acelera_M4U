package revisaogeral;

public class Fabricante {

    private Integer idFabricante;
    private String nome;
    private String produto;

    public Fabricante(){}

    public Fabricante(Integer idFabricante, String nome, String produto) {

        this.idFabricante = idFabricante;
        this.nome = nome;
        this.produto = produto;
    }

    public Integer getIdFabricante() {
        return idFabricante;
    }

    public void setIdFabricante(Integer idFabricante) {
        this.idFabricante = idFabricante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }
}
