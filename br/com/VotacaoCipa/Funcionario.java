package br.com.VotacaoCipa;

public abstract class Funcionario {

    private String nome;
    private int matricula;
    private int tempoEmpresa;

    public Funcionario(String nome, int matricula, int tempoEmpresa) {
        this.nome = nome;
        this.matricula = matricula;
        this.tempoEmpresa = tempoEmpresa;
    }

    public abstract boolean isElegivel(int tempoEmpresa);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getTempoEmpresa() {
        return tempoEmpresa;
    }

    public void setTempoEmpresa(int tempoEmpresa) {
        this.tempoEmpresa = tempoEmpresa;
    }
    
}
