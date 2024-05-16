package Candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        selecaoCandidatos();
        String[] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica"};
        for(String candidato: candidatos) {
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTenttando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTenttando = !atendeu;
            if(continuarTenttando)
                tentativasRealizadas++;
            else
                System.out.println("Contato realizado!");
        } while(continuarTenttando && tentativasRealizadas<3);

        if (atendeu)
            System.out.println("conseguimos contato " + candidato + " na " + tentativasRealizadas);
        else 
            System.out.println("Não conseguimos contato " + candidato + " na " + tentativasRealizadas);
    }

    static boolean atender() {
        return new Random().nextInt(3)==1;
    }


    static void imprimirSelecionados() {
        String[] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica"};
        System.out.println("Imprimindo a lista de candidatos");
        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de número " + (indice + 1) + " é " + candidatos[indice]);
        }
    }

    static void selecaoCandidatos() {
        String[] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica"};

        int candidatosSelecionados = 0;
        int candidatosAtuais = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatosAtuais < candidatos.length) {
            String candidato = candidatos[candidatosAtuais];
            double salarioPretendido = gerarSalarioPretendido();

            System.out.println("O Candidato " + candidato + " solicitou este valor de salário: " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado ");
                candidatosSelecionados++;
            }
            candidatosAtuais++;
        }
    }

    static double gerarSalarioPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Contra proposta");
        } else {
            System.out.println("Aguardando demais candidatos");
        }
    }
}
