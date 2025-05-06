package ifsc.poo;

public class Pessoa {

    // Constantes
    public static final String NOME_PADRAO = "Nome faltando";
    private static final int IDADE_PADRAO = 0;

    // atributos
    private String nome;
    private int idade;
    private static int numPessoas;

    // construtores GERAL
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        numPessoas++;
    }

    // pessoa - construtor
    public Pessoa(String nome) {
       this(nome, IDADE_PADRAO);
    }

    // pessoa - construtor
    public Pessoa(int idade) {
        this(NOME_PADRAO, idade);
    }

    // não aceitar qualquer coisa.
    public void setNome(String nome) {
        if (!nome.isEmpty()) {
            this.nome = nome; // se o nome não for vazio, atribuir.
        }

    }

    // idade
    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        }
    }

    // GeTTERS
    public int getIdade() {
        return idade;
    }

    // Total de objetos criados
    public static int getNumPessoas() {
        return numPessoas; // A Classe guarda quantos produtos foram criados
    }

    // aniversario
    public void felizAniversario() {
        this.idade++;
    }

    // me retorna o nome.
    public String getNome() {
        return nome;
    }


}
