public class FolhaPGTO {

  public static void main(String args[]) {
      Mensalista men1, men2, men3;
      Horista hora1, hora2;

      // Empregados mensalistas
      men1 = new Mensalista("Jose", "Rua abc", "Junior");
      men1.calcularSalario();
      men1.Imprimir();

      men2 = new Mensalista("Ana", "Rua sem fim", "Senior");
      men2.calcularSalario();
      men2.Imprimir();

      men3 = new Mensalista("Ana", "Rua sem fim", "");
      men3.calcularSalario();
      men3.Imprimir();

      // Empregados horistas
      hora1 = new Horista("Carlos", "Rua xyz", 20);
      hora1.calcularSalario();
      hora1.Imprimir();

      hora2 = new Horista("Cristina", "Rua do centro", 100);
      hora2.calcularSalario();
      hora2.Imprimir();
  }
}