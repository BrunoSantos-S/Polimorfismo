public class Funcionario {
    protected String nome;
    protected double salario;

    // Construtor sem parâmetros
    public Funcionario() {
        this.nome = "Funcionário Padrão";
        this.salario = 1000.0;
    }

    // Construtor com parâmetros
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // Método para calcular bônus
    public double calcularBonus() {
        return salario * 0.10;
    }

    // Sobrecarga: calcular bônus com percentual extra
    public double calcularBonus(double percentualExtra) {
        return (salario * 0.10) + (salario * percentualExtra / 100);
    }

    // Exibir dados
    public String exibirDados() {
        return "Nome: " + nome + "\nSalário: R$" + salario + "\nBônus: R$" + calcularBonus();
    }
}
