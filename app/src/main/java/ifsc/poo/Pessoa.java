package ifsc.poo;

public class Pessoa {

    private String nome;
    private int idade;

    // construtores diferentes.
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // pessoa - nome
    public Pessoa(String nome) {
        this.nome = nome;
    }

    // pessoa - idade
    public Pessoa(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // me retorna o nome
    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void felizAniversario() {
        idade = idade + 1;
    }
}
