
package bancoif;


abstract class ConteudoPosicao {
    
    protected String nome;
    private Jogador dono;
    private double valorCompra;
    private double valorAluguel;
    private int nivel = 1;

    public ConteudoPosicao(String nome, Jogador dono, double valorCompra, double valorAluguel) {
        this.nome = nome;
        this.dono = dono;
        this.valorCompra = valorCompra;
        this.valorAluguel = valorAluguel;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Jogador getDono() {
        return dono;
    }

    public void setDono(Jogador dono) {
        this.dono = dono;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    
    
}
