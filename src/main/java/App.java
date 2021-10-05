public class App {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Laura", "123.457.891-87", 1);
        Pessoa p2 = new Pessoa("Karol", "598.321.473-20", 2);

        Endereco end1 = new Endereco("Rua da felicidade", "Vila São João", 32);
        Endereco end2 = new Endereco("Rua laranjeiras", "Bairro das Laranjas", 351);
        Endereco end3 = new Endereco("Rua Conceição Lopes", "Centro", 482);


        p1.addEndereco(end1);
        p2.addEndereco(end2);
        p2.addEndereco(end3);

        p1.mostraInfo();
        p2.mostraInfo();



    }
}
