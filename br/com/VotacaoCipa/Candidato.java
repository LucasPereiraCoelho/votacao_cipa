package br.com.VotacaoCipa;

public class Candidato extends Funcionario{
    
    private int totalVotos;

    public Candidato(String nome, int matricula, int tempoEmpresa) {
        super(nome, matricula, tempoEmpresa);
    }
       
    @Override
    public boolean isElegivel(int tempoEmpresa) {
        return(tempoEmpresa >= 5);
    }
    
    public void addTotalVotos() {
        int antigo = getTotalVotos();
        this.totalVotos = ++antigo;
    }
    
    public int getTotalVotos() {
        return totalVotos;
    }
             
}
