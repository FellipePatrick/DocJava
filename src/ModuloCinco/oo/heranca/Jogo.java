package ModuloCinco.oo.heranca;

public class Jogo {
    public static void main(String[] args) {
        Heroi j1 = new Heroi();
        Monstro j2 = new Monstro();
        j1.andar(Direcao.NORTE);
        j1.getY();
        j2.getX();
        j1.atacar(j2);
        System.out.println("A vida do jogador é: " + j2.getVida());

    }
}
