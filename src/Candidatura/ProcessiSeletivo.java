package Candidatura;

import java.util.concurrent.ThreadLocalRandom;

class ProcessoSeletivo {
    public static void main(String[] args) {
  
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"Felipe","Marcia","JUlia","PAulo","Augusto","Monica"};
        
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase=2000.0;
        while(candidatosSelecionados < 5) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println(" O Candidato " + candidato + " Solicitou este valor de salario ");
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado ");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }

    }
    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido){
            System.out.println("LIgar para o candidato");
    }   else if (salarioBase == salarioPretendido)
            System.out.println("contra proposta");
        else {
            System.out.println("Aguardando demais candidatos");
        }
    }
    
}
