public class Horista extends Empregado {

  private double horas;

  // Construtor
  public Horista(String n, String e, double h) {
      super(n, e);
      horas = h;
  }

  // Métodos de acesso
  public void set_horas(double h) {
      horas = h;
  }

  public double get_horas() {
      return horas;
  }

  // Cálculo do salário com base nas horas trabalhadas
  public void calcularSalario() {
      salario = horas * 50;
  }
}