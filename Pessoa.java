public class Pessoa {
    private String nome;
    private String sobrenome;
    private String sexo;

    public Pessoa() {}

    //questão 4
    public Pessoa(String nome, String sobrenome, String sexo) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
    }

    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    //questão 3
    public void setName(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNome() {
        return this.nome + "\n";
    }

    public String getSobrenome() {
        return this.sobrenome + "\n";
    }

    public String getSexo() {
        return this.sexo + "\n";
    }
}
