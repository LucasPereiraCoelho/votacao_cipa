package br.com.VotacaoCipa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {     
        
        //Instanciando lista do tipo "Candidato";
        List<Candidato> candidatos = new ArrayList<>();
        
        //Instanciando objetos do tipo "Candidato";
        Candidato candidato1 = new Candidato("Luiz", 1111, 5);
        Candidato candidato2 = new Candidato("José", 2222, 10);
        Candidato candidato3 = new Candidato("Marcos", 3333, 6);
        
        //Adicionando os objetos a lista;
        candidatos.add(candidato1);
        candidatos.add(candidato2);
        candidatos.add(candidato3);
        
        //Instanciando objetos do tipo "Eleitor";
        Eleitor eleitor1 = new Eleitor("Afonso", 3312, 1);
        Eleitor eleitor2 = new Eleitor("Jorge", 1254, 2);
        Eleitor eleitor3 = new Eleitor("Bruno", 9856, 7);
        Eleitor eleitor4 = new Eleitor("Guilherme", 0764, 4);
        Eleitor eleitor5 = new Eleitor("Jonas", 4545, 5);
              
        try{
            //Instanciando objetos do tipo "Voto";
            Voto voto1 = new Voto(candidato1, eleitor1);
            Voto voto2 = new Voto(candidato1, eleitor2);
            Voto voto3 = new Voto(candidato1, eleitor3);
            Voto voto4 = new Voto(candidato2, eleitor4);
            Voto voto5 = new Voto(candidato2, eleitor5);
        }catch(Exception ex){          
            System.err.println("Voto não computado");
        }
        
        System.out.println();
        
        //FOR para percorrer lista "candidatos";
        for (Candidato candidato : candidatos) {           
            System.out.println("O candidato " + candidato.getNome() + " teve um total de " + candidato.getTotalVotos() + " votos.");           
        }        
    }   
}
