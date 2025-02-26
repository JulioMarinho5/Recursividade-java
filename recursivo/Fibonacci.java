package recursivo;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o número da posição do Fibonacci que deseja ver:");
		int num = sc.nextInt();
		System.out.println(num + "° número de Fibonacci: " + fibo(num));
		sc.close();
	}
	public static int fibo(int num) {
		if (num == 1) {
			return 0;
		} else if (num == 2 || num == 3) {
			return 1;
		}
		return fibo(num - 2) + fibo(num - 1);
	}

}
