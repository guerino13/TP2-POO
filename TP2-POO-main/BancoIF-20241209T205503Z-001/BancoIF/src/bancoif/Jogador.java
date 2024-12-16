
package bancoif;

import java.util.Random;


public class Jogador {
    private String nome;
    private Propriedades propriedades[];
    private double saldo = 1500.00;
    private int posicao = 0;

    public Jogador(String nome) {
        this.nome = nome;
    }
    
    public int jogarDados(){
        Random rd = new Random();
        int dado1 = rd.nextInt(1, 6);
        int dado2 = rd.nextInt(1, 6);
        return dado1 + dado2;
    }
    
}
