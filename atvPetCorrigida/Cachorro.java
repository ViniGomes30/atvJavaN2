public class Cachorro extends Pet {
    public Cachorro(String raca, Data nascimento, String cor, String nome) {
        super(raca, nascimento, cor, nome);
    }

    @Override
    public String emitirSom() {
        return "Au au!";
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "raca='" + getRaca() + '\'' +
                ", nascimento=" + getNascimento() +
                ", cor='" + getCor() + '\'' +
                ", nome='" + getNome() + '\'' +
                ", dono=" + getDono() +
                '}';
    }
}