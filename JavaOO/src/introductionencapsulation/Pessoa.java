package introductionencapsulation;

public class Pessoa {

    // Atributos classe pessoa
    private String nome;
    private Integer idade;
    private Double altura;
    private String dataDeNascimento;


    //Construtor
    public Pessoa(){}

    public Pessoa(String nome, Integer idade, String dataDeNascimento, Double altura) {
        this.nome = nome;
        this.idade = idade;
        this.dataDeNascimento = dataDeNascimento;
        this.altura = altura;
    }

    // Métodos Acessadores e Alteradores

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    // Métodos Adicionais

    public int calculaIdade(int anoAtual, int anoNascimento){
        return anoAtual - anoNascimento;
    }

}
