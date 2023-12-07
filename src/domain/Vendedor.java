package domain;

import domain.CalculaBonificacao;
import domain.FuncionarioCLT;

public class Vendedor extends FuncionarioCLT implements CalculaBonificacao {
    private Double valorDaBonificacao;

    @Override
    public void calculaBonificacao(Double porcentagemBonificacao) {
        this.valorDaBonificacao = this.valorSalario * (porcentagemBonificacao / 100d);
    }

    @Override
    public String toString() {
        return "domain.Vendedor{" +
                "valorDaBonificacao=" + valorDaBonificacao +
                ", nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", valorSalario=" + valorSalario +
                ", endereco=" + endereco.getRua() +
                '}';
    }

}
