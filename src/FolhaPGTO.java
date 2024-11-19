public class FolhaPGTO {

  public static void main(String args[]) {
      Mensalista men1, men2;
      Horista hora1, hora2;

      // Empregados mensalistas
      men1 = new Mensalista("Jose", "Rua abc", "Junior");
      men1.calcularSalario();
      men1.calcularInss();
      System.out.println("Nome: " + men1.getNome());
      System.out.println(
          "EnderecoNome: " + men1.getEndereco()
      );
      System.out.println(
          "Salario: " + men1.getSalario()
      );

      men2 = new Mensalista("Ana", "Rua sem fim", "Senior");
      men2.calcularSalario();
      men2.calcularInss();
      System.out.println("Nome: " + men2.getNome());
      System.out.println(
          "EnderecoNome: " + men2.getEndereco()
      );
      System.out.println(
          "Salario: " + men2.getSalario()
      );

      // Empregados horistas
      hora1 = new Horista("Carlos", "Rua xyz", 20);
      hora1.calcularSalario();
      System.out.println("Nome: " + hora1.getNome());
      System.out.println(
          "EnderecoNome: " + hora1.getEndereco()
      );
      System.out.println(
          "Salario: " + hora1.getSalario()
      );

      hora2 = new Horista("Cristina", "Rua do centro", 100);
      hora2.calcularSalario();
      System.out.println("Nome: " + hora2.getNome());
      System.out.println(
          "EnderecoNome: " + hora2.getEndereco()
      );
      System.out.println(
          "Salario: " + hora2.getSalario()
      );
  }
}