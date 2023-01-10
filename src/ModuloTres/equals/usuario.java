package ModuloTres.equals;

public class usuario {
    String nome;
    String email;

    @Override
    public boolean equals(Object objeto) {
        if (objeto instanceof usuario) {
            usuario outro = (usuario) objeto;
            boolean nomeIgual = outro.nome.equalsIgnoreCase(this.nome);
            boolean emailIgual = outro.email.equalsIgnoreCase(this.email);

            return nomeIgual && emailIgual;
        } else {
            return false;
        }

    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return 0;
    }
}
