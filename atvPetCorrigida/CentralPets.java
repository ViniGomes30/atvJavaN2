import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CentralPets {

    private List<Pessoa> pessoas;
    private List<Cachorro> cachorros;
    private List<Gato> gatos;

    public CentralPets() {
        this.pessoas = new ArrayList<>();
        this.cachorros = new ArrayList<>();
        this.gatos = new ArrayList<>();
    }

    public void criarPessoa() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome da pessoa:");
        String nome = scanner.nextLine();
        System.out.println("Digite o CPF da pessoa:");
        String cpf = scanner.nextLine();
        System.out.println("Digite o telefone da pessoa:");
        String telefone = scanner.nextLine();
        Pessoa pessoa = new Pessoa(nome, cpf, telefone);
        pessoas.add(pessoa);
        System.out.println("Pessoa criada com sucesso!");
    }

    public void criarCachorro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a raça do cachorro:");
        String raca = scanner.nextLine();
        System.out.println("Digite a data de nascimento do cachorro (dd/mm/aaaa):");
        String dataNascimento = scanner.nextLine();
        String[] dataParts = dataNascimento.split("/");
        int dia = Integer.parseInt(dataParts[0]);
        int mes = Integer.parseInt(dataParts[1]);
        int ano = Integer.parseInt(dataParts[2]);
        Data nascimento = new Data(dia, mes, ano);
        System.out.println("Digite a cor do cachorro:");
        String cor = scanner.nextLine();
        System.out.println("Digite o nome do cachorro:");
        String nome = scanner.nextLine();
        Cachorro cachorro = new Cachorro(raca, nascimento, cor, nome);
        cachorros.add(cachorro);
        System.out.println("Cachorro criado com sucesso!");
    }

    public void criarGato() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a raça do gato:");
        String raca = scanner.nextLine();
        System.out.println("Digite a data de nascimento do gato (dd/mm/aaaa):");
        String dataNascimento = scanner.nextLine();
        String[] dataParts = dataNascimento.split("/");
        int dia = Integer.parseInt(dataParts[0]);
        int mes = Integer.parseInt(dataParts[1]);
        int ano = Integer.parseInt(dataParts[2]);
        Data nascimento = new Data(dia, mes, ano);
        System.out.println("Digite a cor do gato:");
        String cor = scanner.nextLine();
        System.out.println("Digite o nome do gato:");
        String nome = scanner.nextLine();
        Gato gato = new Gato(raca, nascimento, cor, nome);
        gatos.add(gato);
        System.out.println("Gato criado com sucesso!");
    }

    public void adquirirCachorro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o CPF do dono:");
        String cpf = scanner.nextLine();
        Pessoa dono = encontrarPessoaPorCPF(cpf);
        if (dono == null) {
            System.out.println("Pessoa não encontrada.");
            return;
        }
        System.out.println("Digite o nome do cachorro:");
        String nome = scanner.nextLine();
        Cachorro cachorro = encontrarCachorroPorNome(nome);
        if (cachorro == null) {
            System.out.println("Cachorro não encontrado.");
            return;
        }
        dono.adquirirCachorro(cachorro);
        System.out.println("Cachorro adquirido com sucesso!");
    }

    public void adquirirGato() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o CPF do dono:");
        String cpf = scanner.nextLine();
        Pessoa dono = encontrarPessoaPorCPF(cpf);
        if (dono == null) {
            System.out.println("Pessoa não encontrada.");
            return;
        }
        System.out.println("Digite o nome do gato:");
        String nome = scanner.nextLine();
        Gato gato = encontrarGatoPorNome(nome);
        if (gato == null) {
            System.out.println("Gato não encontrado.");
            return;
        }
        dono.adquirirGato(gato);
        System.out.println("Gato adquirido com sucesso!");
    }

    public void devolverCachorro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o CPF do dono:");
        String cpf = scanner.nextLine();
        Pessoa dono = encontrarPessoaPorCPF(cpf);
        if (dono == null) {
            System.out.println("Pessoa não encontrada.");
            return;
        }
        System.out.println("Digite o nome do cachorro:");
        String nome = scanner.nextLine();
        Cachorro cachorro = encontrarCachorroPorNome(nome);
        if (cachorro == null) {
            System.out.println("Cachorro não encontrado.");
            return;
        }
        dono.excluirCachorro(cachorro);
        cachorro.perderDono();
        System.out.println("Cachorro devolvido com sucesso!");
    }

    public void devolverGato() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o CPF do dono:");
        String cpf = scanner.nextLine();
        Pessoa dono = encontrarPessoaPorCPF(cpf);
        if (dono == null) {
            System.out.println("Pessoa não encontrada.");
            return;
        }
        System.out.println("Digite o nome do gato:");
        String nome = scanner.nextLine();
        Gato gato = encontrarGatoPorNome(nome);
        if (gato == null) {
            System.out.println("Gato não encontrado.");
            return;
        }
        dono.excluirGato(gato);
        gato.perderDono();
        System.out.println("Gato devolvido com sucesso!");
    }

    public void obterCachorrosComDono() {
        System.out.println("Cachorros com dono:");
        for (Pessoa pessoa : pessoas) {
            for (Pet pet : pessoa.getPets()) {
                if (pet instanceof Cachorro) {
                    System.out.println(((Cachorro) pet).toString());
                }
            }
        }
    }

    public void obterGatosComDono() {
        System.out.println("Gatos com dono:");
        for (Pessoa pessoa : pessoas) {
            for (Pet pet : pessoa.getPets()) {
                if (pet instanceof Gato) {
                    System.out.println(((Gato) pet).toString());
                }
            }
        }
    }

    public void obterCachorrosSemDono() {
        System.out.println("Cachorros sem dono:");
        for (Cachorro cachorro : cachorros) {
            if (cachorro.getDono() == null) {
                System.out.println(cachorro.toString());
            }
        }
    }

    public void obterGatosSemDono() {
        System.out.println("Gatos sem dono:");
        for (Gato gato : gatos) {
            if (gato.getDono() == null) {
                System.out.println(gato.toString());
            }
        }
    }

    public void listarCachorrosDeterminadoDono() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o CPF do dono:");
        String cpf = scanner.nextLine();
        Pessoa dono = encontrarPessoaPorCPF(cpf);
        if (dono == null) {
            System.out.println("Pessoa não encontrada.");
            return;
        }
        System.out.println("Cachorros do dono:");
        for (Pet pet : dono.getPets()) {
            if (pet instanceof Cachorro) {
                System.out.println(((Cachorro) pet).toString());
            }
        }
    }

    public void listarGatosDeterminadoDono() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o CPF do dono:");
        String cpf = scanner.nextLine();
        Pessoa dono = encontrarPessoaPorCPF(cpf);
        if (dono == null) {
            System.out.println("Pessoa não encontrada.");
            return;
        }
        System.out.println("Gatos do dono:");
        for (Pet pet : dono.getPets()) {
            if (pet instanceof Gato) {
                System.out.println(((Gato) pet).toString());
            }
        }
    }

    public void listarPessoasSemPets() {
        System.out.println("Pessoas sem pets:");
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getPets().isEmpty()) {
                System.out.println(pessoa.toString());
            }
        }
    }

    public void listarPessoasComMaisPets() {
        System.out.println("Pessoas com mais pets:");
        Pessoa pessoaComMaisPets = encontrarPessoaComMaisPets();
        if (pessoaComMaisPets != null) {
            System.out.println(pessoaComMaisPets.toString());
        } else {
            System.out.println("Nenhuma pessoa possui pets.");
        }
    }

    public void obterDonoDeterminadoCachorro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do cachorro:");
        String nome = scanner.nextLine();
        Cachorro cachorro = encontrarCachorroPorNome(nome);
        if (cachorro == null) {
            System.out.println("Cachorro não encontrado.");
            return;
        }
        if (cachorro.getDono() != null) {
            System.out.println("Dono do cachorro: " + cachorro.getDono().toString());
        } else {
            System.out.println("Cachorro não possui dono.");
        }
    }

    public void obterDonoDeterminadoGato() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do gato:");
        String nome = scanner.nextLine();
        Gato gato = encontrarGatoPorNome(nome);
        if (gato == null) {
            System.out.println("Gato não encontrado.");
            return;
        }
        if (gato.getDono() != null) {
            System.out.println("Dono do gato: " + gato.getDono().toString());
        } else {
            System.out.println("Gato não possui dono.");
        }
    }

    // Métodos auxiliares
    private Pessoa encontrarPessoaPorCPF(String cpf) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getCpf().equals(cpf)) {
                return pessoa;
            }
        }
        return null;
    }

    private Cachorro encontrarCachorroPorNome(String nome) {
        for (Cachorro cachorro : cachorros) {
            if (cachorro.getNome().equals(nome)) {
                return cachorro;
            }
        }
        return null;
    }

    private Gato encontrarGatoPorNome(String nome) {
        for (Gato gato : gatos) {
            if (gato.getNome().equals(nome)) {
                return gato;
            }
        }
        return null;
    }

    private Pessoa encontrarPessoaComMaisPets() {
        if (pessoas.isEmpty()) {
            return null;
        }
        Pessoa pessoaComMaisPets = pessoas.get(0);
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getPets().size() > pessoaComMaisPets.getPets().size()) {
                pessoaComMaisPets = pessoa;
            }
        }
        return pessoaComMaisPets;
    }
}