
public class Main {
    public static void main(String[] args) {

        Endereco endereco = new Endereco("Rua funcionario", "Complemento Funcionario", "Bairro Funcionario");

        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Cesar Constanzo");
        vendedor.setDocumento("123456467");
        vendedor.setValorSalario(1000d);
        vendedor.setEndereco(endereco);
        System.out.println(vendedor);
    }
}
