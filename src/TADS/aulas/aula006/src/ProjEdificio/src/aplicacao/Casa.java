package aplicacao;

public class Casa extends Imovel{
    Porta porta1, porta2, porta3;
    public Casa(String cor, Porta porta1, Porta porta2, Porta porta3) {
        super(cor);
        this.porta1 = porta1;
        this.porta2 = porta2;
        this.porta3 = porta3;
    }
    public int quantasPortasEstaoAbertas(){
        if(porta1.estaAberta() && porta2.estaAberta() && porta3.estaAberta()){
            return 3;
        }else{
            if((porta1.estaAberta() && porta2.estaAberta()) || (porta1.estaAberta() && porta3.estaAberta()) || (porta3.estaAberta() && porta2.estaAberta())){
                return 2;
            }else{
                if(porta1.estaAberta() || porta2.estaAberta() || porta3.estaAberta()){
                    return 1;
                }else{
                    return 0;
                }
            }
        }
    }
    public int totalDePortas(){
        return 3;
    }
}
