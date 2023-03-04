package br.com.VotacaoCipa;

public class Eleitor extends Funcionario{

    public Eleitor(String nome, int matricula, int tempoEmpresa) {
        super(nome, matricula, tempoEmpresa);
    }

    @Override
    public boolean isElegivel(int tempoEmpresa) {
        return(tempoEmpresa >= 1); 
    } 
    
}
