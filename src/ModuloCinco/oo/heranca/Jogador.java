package ModuloCinco.oo.heranca;

public class Jogador {
    private int vida = 100;

    private int dps = 10;
    private int x;
    private int y;

    public boolean atacar(Jogador oponente){
        int deltaX = Math.abs(x-oponente.x);
        int deltaY = Math.abs(y- oponente.y);
        if(deltaX == 0 && deltaY == 1){
            oponente.vida -= dps;
            return true;
        } else if (deltaX == 1 && deltaY == 0) {
            oponente.vida -= dps;
            return true;
        }else {
            return false;
        }
    }
    public void getY(){
        System.out.println(y);
    }

    public int getVida(){
        return vida;
    }
    public void getX(){
        System.out.println(x);
    }
    public boolean andar(Direcao direcao){
        if(direcao == Direcao.NORTE){
            if(y == 100){
                System.out.println("O jogador não pode subir, esse é o ponto de colisão do mapa");
            }else{
                y++;
            }
        }
        return true;
    }
}
