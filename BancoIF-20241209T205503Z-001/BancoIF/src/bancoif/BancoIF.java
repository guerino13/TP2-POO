
package bancoif;

import java.util.Random;
import java.util.Scanner;


public class BancoIF {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);;
        System.out.println("INFORME A QUANTIDADE DE JOGADORES: (2-6)");
        int quantJogadores = sc.nextInt();
        Jogador[] jogadores = new Jogador[quantJogadores];
        
        for(int i=0; i<jogadores.length; i++){
            System.out.println("POR FAVOR, INFORME O NOME DO JOGADOR:" + (i+1));
            Jogador novoJogador = new Jogador(sc.nextLine());
            jogadores[i] = novoJogador;
        }
    }
    
}
