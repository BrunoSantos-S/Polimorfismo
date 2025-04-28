public class Gerente extends Funcionario {
    private double bonusExtra;

    // Construtor
    public Gerente(String nome, double salario, double bonusExtra) {
        super(nome, salario);
        this.bonusExtra = bonusExtra;
    }

    // Sobrescrita: calcular bônus diferente
    @Override
    public double calcularBonus() {
        return (salario * 0.10) + bonusExtra;
    }

    // Sobrescrita: exibir dados diferente
    @Override
    public String exibirDados() {
        return "Nome: " + nome + "\nSalário: R$" + salario + "\nBônus Base + Extra: R$" + calcularBonus() + "\nBônus Extra: R$" + bonusExtra;
    }
}
