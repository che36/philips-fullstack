import domain.Endereco;
import domain.Gerente;
import domain.OperadorDeCaixa;
import domain.Vendedor;

public class Main {
    public static void main(String[] args) {

        Endereco endereco = new Endereco("Rua funcionario", "Complemento Funcionario", "Bairro Funcionario");

        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Cesar Constanzo");
        vendedor.setDocumento("123456467");
        vendedor.setValorSalario(1000d);
        vendedor.calculaBonificacao(5d);
        vendedor.setEndereco(endereco);
        System.out.println(vendedor);

        OperadorDeCaixa operadorCaixa = new OperadorDeCaixa("Operador de Caixa", "123456465", 100d, endereco);
        System.out.println(operadorCaixa);

        Gerente gerente = new Gerente();
        gerente.setNome("César ");
        gerente.setDocumento("456465465465");
        gerente.setEndereco(endereco);
        gerente.setHorasTrabalhadas(20);
        gerente.setValorHora(100d);
        gerente.calculaRemuneracao();
        gerente.calculaBonificacao(3d);
        System.out.println(gerente);
    }
}
