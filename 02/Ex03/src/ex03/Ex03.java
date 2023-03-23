/*
3) Faça um programa, em Java, que simule um radar na Av. Cristiano Machado. Esse radar
deve receber a velocidade de cinco veículos, calcular e exibir a quantidade de veículos
com velocidade acima de 60 km/h. O radar também deve informar o total arrecadado com
multas, considerando que o valor de cada multa é de R$ 150,00 e que veículos com
velocidade superior a 60 km/h serão multados.
 */
package ex03;
import java.util.Scanner;
/**
 * @author fredericorodrigues
 */
public class Ex03 {

    public static void main(String[] args) {
        int velocidade, cont = 0, totalArrecadado = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 5; i++){
            System.out.println("Digite a velocidade do "+ i +"º veículo:");
            velocidade = input.nextInt();
            while (velocidade <= 0){
                System.out.println("Velocidade deve ser maior que 0. Digite a velocidade do " + i +"º veículo:");
                velocidade = input.nextInt();
            }
            if (velocidade > 60){
                cont+=1;
            }
            totalArrecadado = cont * 150;
        }
        System.out.println(cont +" carros foram multados e o total arrecadado foi de R$"+ totalArrecadado +",00.");
    }
}
