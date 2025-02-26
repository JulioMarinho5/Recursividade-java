package recursivo;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o número para ver o fatorial:");
		int num = sc.nextInt();
		System.out.println(num + "! = " + fatorial(num));
		sc.close();
	}
	public static int fatorial(int num) {
		if (num == 1 || num == 0) {
			return 1;
		}
		return num * fatorial(num - 1);

	}

}
