public class Gato extends Pet {
    public Gato(String raca, Data nascimento, String cor, String nome) {
        super(raca, nascimento, cor, nome);
    }

    @Override
    public String emitirSom() {
        return "Miau!";
    }

    @Override
    public String toString() {
        return "Gato{" +
                "raca='" + getRaca() + '\'' +
                ", nascimento=" + getNascimento() +
                ", cor='" + getCor() + '\'' +
                ", nome='" + getNome() + '\'' +
                ", dono=" + getDono() +
                '}';
    }
}