/*
2) Faça um programa, em Java, que receba como entrada três notas de um aluno (digite
valores entre 0 e 10), calcule e mostre a média aritmética e a mensagem constante na
tabela a seguir:
Média Aritmética              Mensagem
de 0,0 a abaixo de 4,0        Reprovado
de 4,0 a abaixo de 6,0        Exame Especial
de 6,0 a 10,0                 Aprovado
*/
package ex02;
import java.util.Scanner;
/**
 * @author fredericorodrigues
 */
public class Ex02 {

    public static void main(String[] args) {
        double nota, soma = 0, media;
        String situacao;
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 3; i++){
            System.out.println("Digite a "+ i +"ª nota do aluno:");
            nota = input.nextDouble();
            while (nota < 0 || nota > 10){
                System.out.println("Nota inválida. Digite uma nota entre 0 e 10:");
                nota = input.nextDouble();
            }
            soma = soma + nota;
        }
        media = soma/3;
        if (media < 4){
            situacao = "Reprovado";
        } else if (media >= 4 && media < 6){
            situacao = "Exame Especial";
        } else
            situacao = "Aprovado";
        System.out.println("A média do aluno é: "+ media +" - "+ situacao);
    }
}
