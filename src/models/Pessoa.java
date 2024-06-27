package models;

public class Pessoa {
    private int codigo;
    private String nome, rua, cidade;

    

    public Pessoa(int codigo, String nome, String rua, String cidade) {
        this.setCodigo(codigo);
        this.setNome(nome);
        this.setRua(rua);
        this.setCidade(cidade);
    }
    public Pessoa(int codigo, String nome) {
        this.setCodigo(codigo);
        this.setNome(nome);
    }
    public Pessoa(String rua, String cidade) {
        this.setRua(rua);
        this.setCidade(cidade);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    // "src\\util\\A.cvs"
    public String toCSV(){
        return getCodigo() + ";" + getNome() + ";" + getRua() + ";" + getCidade() + "\n";
    }
    
}