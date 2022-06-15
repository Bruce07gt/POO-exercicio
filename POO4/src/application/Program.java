package application;
import entities.Employee;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.println("Digite o nome do funcionario: ");
        employee.name = sc.nextLine();
        System.out.println("Digite o salario bruto: ");
        employee.grossSalary = sc.nextDouble();
        System.out.println("qual é o desconto mensal: ");
        employee.tax = sc.nextDouble();




        System.out.println("Employee: "+employee.name+", $ "+employee.netSalary());

        System.out.println();
        System.out.println("Qual a porcentagem de aumento terá? ");
        employee.percentage = sc.nextDouble();

        System.out.println();
        System.out.println("Dados atualizados: "+employee.name+", $ "+employee.increaseSalary());

        sc.close();
    }
}
