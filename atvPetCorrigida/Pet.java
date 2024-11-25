public abstract class Pet {
    private String raca;
    private Data nascimento;
    private String cor;
    private String nome;
    private Pessoa dono;

    public Pet(String raca, Data nascimento, String cor, String nome) {
        this.raca = raca;
        this.nascimento = nascimento;
        this.cor = cor;
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Data getNascimento() {
        return nascimento;
    }

    public void setNascimento(Data nascimento) {
        this.nascimento = nascimento;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa getDono() {
        return dono;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
    }

    public abstract String emitirSom();

    public String toString() {
        return "Pet{" +
                "raca='" + raca + '\'' +
                ", nascimento=" + nascimento +
                ", cor='" + cor + '\'' +
                ", nome='" + nome + '\'' +
                ", dono=" + dono +
                '}';
    }

    public int calcularIdade(Data dataAtual) {
        int idade = dataAtual.getAno() - nascimento.getAno();
        if (dataAtual.getMes() < nascimento.getMes() || (dataAtual.getMes() == nascimento.getMes() && dataAtual.getDia() < nascimento.getDia())) {
            idade--;
        }
        return idade;
    }

    public void atribuirDono(Pessoa dono) {
        this.dono = dono;
    }

    public void perderDono() {
        this.dono = null;
    }
}