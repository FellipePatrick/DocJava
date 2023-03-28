package ModuloCinco.oo.heranca;

public class Heroi extends Jogador{
    @Override
    public boolean atacar(Jogador oponente) {
        super.atacar(oponente);
        return true;
    }
}
