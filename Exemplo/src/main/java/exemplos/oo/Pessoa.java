package exemplos.oo;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String dizerNome(){
        return "Meu nome é "+ nome;
    }

    public String dizerIdade(){
        return "Minha idade é "+idade;
    }

}
