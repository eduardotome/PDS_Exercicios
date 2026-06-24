package model;

public class Autor {

    private String nome;
    private int cpf;
    private String email;
    private String genero;
    private String nacionalidade;

    public Autor(String nome, int cpf, String email, String genero, String nacionalidade) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.genero = genero;
        this.nacionalidade = nacionalidade;
    }

    public String getNome() { return nome; }
    public int getCpf() { return cpf; }
    public String getEmail() { return email; }
    public String getGenero() { return genero; }
    public String getNacionalidade() { return nacionalidade; }

    public void setNome(String nome) { this.nome = nome; }
    public void setCpf(int cpf) { this.cpf = cpf; }
    public void setEmail(String email) { this.email = email; }
    public void setGenero(String genero) { this.genero = genero; }
    public void setNacionalidade(String nacionalidade) { this.nacionalidade = nacionalidade; }
}