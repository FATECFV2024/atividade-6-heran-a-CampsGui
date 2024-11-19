public class Mensalista extends Empregado {

  private String cargo;

  // Construtor
  public Mensalista(String n, String e, String c) {
      super(n, e);
      cargo = c;
  }

  // Métodos de acesso
  public void set_cargo(String c) {
      cargo = c;
  }

  public String get_cargo() {
      return cargo;
  }

  /* Este código não especificava a condição de que o salario de 5500 estaria atribuido ao cargo Senior
    public void calcularSalario() {
     if (cargo.equals("Junior")) {
        salario = 2500;
     } else if (cargo.equals("Pleno")) {
        salario = 3500;
     } else {
        salario = 5500;
     }
    }
  */

  // Cálculo do salário bruto com base no cargo
  public void calcularSalario() {
    if (cargo.equals("Junior")) {
        salario = 2500;
    } else if (cargo.equals("Pleno")) {
        salario = 3500;
    } else if (cargo.equals("Senior")) {
        salario = 5500;
    } else {
        salario = 0; // Valor padrão caso o cargo não seja reconhecido
    }
  }
}