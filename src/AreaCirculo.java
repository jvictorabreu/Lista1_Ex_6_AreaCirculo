import java.util.Scanner;

// 6-Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.

public class AreaCirculo {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);

        System.out.println("Insira o raio do círculo em metros: ");
        Double raio = userInput.nextDouble();
        Double diametro = raio * 2;

        Double area = Math.PI * Math.pow(raio, 2);
        System.out.println("O diâmetro do círculo é de: " + diametro + "m. E a área do cúrculo é de: " + area + "m²");
    }
}