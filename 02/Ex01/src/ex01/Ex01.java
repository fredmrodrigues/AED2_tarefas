/*
1) Uma empresa pretende ajustar os salários de seus funcionários conforme a tabela a seguir:
Salário                    Percentual de Aumento
até R$ 1200,00             10%
acima de R$ 1200,00        5%
Faça um programa, em Java, que receba o salário atual do funcionário; calcule e mostre o
aumento que esse funcionário receberá e seu novo salário.
*/
package ex01;
import java.util.Scanner;
/**
 * @author fredericorodrigues
 */
public class Ex01 {

    public static void main(String[] args) {
        double salarioBase, novoSalario;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o salário do funcionário:");
        salarioBase = input.nextDouble();
        while (salarioBase <= 0){
            System.out.println("Salário deve ser maior que 0");
            System.out.println("Digite o salário do funcionário:");
            salarioBase = input.nextDouble();
        }
        if (salarioBase > 0 && salarioBase <= 1200){
            novoSalario = salarioBase + (salarioBase * 0.10);
        } else
            novoSalario = salarioBase + (salarioBase * 0.05);
        System.out.println("O novo salário do funcionário é: " + novoSalario);
    }
}
