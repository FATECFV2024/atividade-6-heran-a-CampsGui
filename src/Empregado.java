public class Empregado {

    protected String nome;
    protected String endereco;
    protected double salario;

    // Construtor
    public Empregado(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    // Métodos de acesso
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Cálculo do IRPF
    public double calcularIrpf() {
        if (salario <= 1903.98) {
            return 0;
        } else if (salario <= 2826.65) {
            return salario * 0.075;
        } else if (salario <= 3751.05) {
            return salario * 0.15;
        } else if (salario <= 4664.68) {
            return salario * 0.225;
        } else {
            return salario * 0.275;
        }
    }

    // Cálculo do INSS
    public double calcularInss() {
        if (salario <= 1212.00) {
            return salario * 0.075;
        } else if (salario <= 2427.35) {
            return salario * 0.09;
        } else if (salario <= 3641.03) {
            return salario * 0.12;
        } else {
            return salario * 0.14;
        }
    }

    // Método para impressão dos dados do empregado
    public void Imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Salário: " + salario);
        System.out.printf("IRPF: %.2f%n", calcularIrpf());
        System.out.printf("INSS: %.2f%n", calcularInss());
        System.out.println("\n");
    }
}
