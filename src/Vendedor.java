public class Vendedor extends FuncionarioCLT {
    private Double valorDaBonificacao;

    @Override
    public String toString() {
        return "Vendedor{" +
                "valorDaBonificacao=" + valorDaBonificacao +
                ", nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", valorSalario=" + valorSalario +
                ", endereco=" + endereco.getRua() +
                '}';
    }
}
