public class Pessoa {
    public String nome;
    public String cpf;
    public Endereco enderecos[];


    public Pessoa(String nome, String cpf, int qtdEnd) {
        this.nome = nome;
        this.cpf = cpf;
        enderecos = new Endereco[qtdEnd];
    }

    public void addEndereco(Endereco end) {
        this.enderecos[0] = end;

        for (int i = 0; i < enderecos.length; i++) {
            if(enderecos[i] == null) {
                enderecos[i] = end;
                break;
            }
        }
    }

    public void mostraInfo() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());

        for (int i = 0; i < enderecos.length ; i++) {
            if (enderecos[i] != null) {
                System.out.println(nome + " possui o(s) endereço(s): ");
                System.out.println("Rua " + enderecos[i].getRua());
                System.out.println("Bairro " + enderecos[i].getBairro());
                System.out.println("Número " + enderecos[i].getNum());
            }
        }
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

    public Endereco[] getEnderecos() {

        return enderecos;
    }

    public void setEnderecos(Endereco[] enderecos) {

        this.enderecos = enderecos;
    }
}
