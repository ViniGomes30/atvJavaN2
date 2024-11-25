import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private String cpf;
    private String telefone;
    private List<Pet> pets;

    public Pessoa(String nome, String cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.pets = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    public void excluirCachorro(Cachorro cachorro) {
        pets.remove(cachorro);
    }

    public void adquirirCachorro(Cachorro cachorro) {
        pets.add(cachorro);
        cachorro.atribuirDono(this);
    }

    public void excluirGato(Gato gato) {
        pets.remove(gato);
    }

    public void adquirirGato(Gato gato) {
        pets.add(gato);
        gato.atribuirDono(this);
    }

    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", telefone='" + telefone + '\'' +
                ", pets=" + pets +
                '}';
    }
}