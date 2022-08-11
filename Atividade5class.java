package Aula4;

import java.util.Scanner;

public class Atividade5class {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite 20 numeros para identificar quantos sao pares: ");
		
		int num5, contPar=0 , contImpar=0, contGeral=1;
		for (num5=0; contGeral<21; contGeral++) {
			num5 = input.nextInt();
			if(num5 % 2 == 0){
				contPar++;
			}else {
				contImpar++;
			}
			System.out.println("Resta digitar " + (20-contGeral) + " numeros");
			}
		System.out.println("Existem " + contPar + " numeros pares e " + contImpar + " numeros impares nos numeros digitados.");
		
			
		}
		
		
				

	}

