import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        //Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
        
        Scanner scanner = new Scanner(System.in);
 
        double salarioHora, horasTrabalhadasMes, salarioMes;

        System.out.println("Salário(Hora): ");
        salarioHora = scanner.nextDouble();

        System.out.println("Quantidade de Horas trabalhadas no mês: ");
        horasTrabalhadasMes = scanner.nextDouble();

        salarioMes = salarioHora * horasTrabalhadasMes;

        System.out.println("O salário mensal do funcionário é: " + salarioMes);
    }
}
