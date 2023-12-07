public class Gerente extends FuncionarioPJ {
    private Double valorBonidficacao;

    @Override
    public String toString() {
        return "Gerente{" +
                "valorBonidficacao=" + valorBonidficacao +
                "nome='" + super.getNome() + '\'' +
                ", documento='" + super.getEndereco().getBairro() + '\'' +
                ", endereco=" + super.getEndereco() +
                ", horasTrabalhadas=" + super.getHorasTrabalhadas() +
                ", valorHora=" + super.getValorHora() +
                ", valorRemuneracao=" + super.getValorRemuneracao() +
                '}';
    }
}
