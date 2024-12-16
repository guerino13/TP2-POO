
package bancoif;


public class Posicao {
    protected Jogador jogadores [] = new Jogador [6];
    private ConteudoPosicao propriedade;
    private Eventos eventos;

    public Posicao(ConteudoPosicao propriedade) {
        this.propriedade = propriedade;
    }

    public Posicao(Eventos eventos) {
        this.eventos = eventos;
    }
    
    public void setPropriedade(Propriedades propriedade) {
        this.propriedade = propriedade;
    }

      
    
}
