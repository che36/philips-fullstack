public abstract class FuncionarioPJ {
    private String nome;
    private String documento;
    private Endereco endereco;
    private Integer horasTrabalhadas;
    private Double valorHora;
    private Double valorRemuneracao;

    public void calculaRemuneracao() {
        this.valorRemuneracao = this.horasTrabalhadas * this.valorHora;
    }
}
