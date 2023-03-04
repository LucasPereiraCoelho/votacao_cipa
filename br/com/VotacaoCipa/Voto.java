package br.com.VotacaoCipa;

public class Voto {

    private Candidato candidato;
    private Eleitor eleitor;

    public Voto(Candidato candidato, Eleitor eleitor) {
        this.candidato = candidato;
        this.eleitor = eleitor;
        validarVotacao();
    }

    private void validarVotacao() {
        
        if (this.candidato.isElegivel(candidato.getTempoEmpresa())) {
            if (this.eleitor.isElegivel(eleitor.getTempoEmpresa())) {
                candidato.addTotalVotos();
                System.out.println("Situação voto = VOTADO");
            } else {
                System.out.println("Eleitor " + eleitor.getNome() + " não elegível para voto.");
            }
        } else {
            System.out.println("Candidato " + candidato.getNome() + " não elegível para candidatura");
        }
    }
}
