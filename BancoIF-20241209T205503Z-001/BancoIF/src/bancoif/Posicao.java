
package bancoif;


public class Posicao {
    protected Jogador jogadores [] = new Jogador [6];
    private ConteudoPosicao propriedade;

    public Posicao(ConteudoPosicao propriedade) {
        this.propriedade = propriedade;
    }


    public void setPropriedade(Propriedades propriedade) {
        this.propriedade = propriedade;
    }

      
    
}
