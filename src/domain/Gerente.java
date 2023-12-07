package domain;

import domain.CalculaBonificacao;
import domain.FuncionarioPJ;

public class Gerente extends FuncionarioPJ implements CalculaBonificacao {
    private Double valorBonificacao;

    @Override
    public void calculaBonificacao(Double porcentagemBonificacao) {
        this.valorBonificacao = (super.getValorRemuneracao() * (porcentagemBonificacao / 100)) + 100d;
    }

    @Override
    public String toString() {
        return "domain.Gerente{" +
                "valorBonidficacao= " + valorBonificacao +
                "nome=' " + super.getNome() + '\'' +
                ", documento=' " + super.getEndereco().getBairro() + '\'' +
                ", endereco= " + super.getEndereco() +
                ", horasTrabalhadas= " + super.getHorasTrabalhadas() +
                ", valorHora= " + super.getValorHora() +
                ", valorRemuneracao= " + super.getValorRemuneracao() +
                '}';
    }
}
