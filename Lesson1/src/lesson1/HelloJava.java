package lesson1;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class HelloJava {

	public static void main(String[] args) {
		System.out.println("\033[34mПривет, \033[32mмир \033[31mJava!\033[30m");
		
		// создание переменных различных типов данных
		int num;
		int res;
		int a = 6;
		int b = 9;
		res = a * b;
		long x1 = 1000000000;
		long x2 = 1_000_000_000;
		char ch1 = 'a';
		char ch2 = '\u3698';
		String str = "Это строка текста типа String";
		final double PI = 3.14;
		int r = 120;
		double area = PI * r * r;
		
		System.out.printf("Произведение a * b = %d\n", res);
		System.out.printf("Площадь круга равна = %f\n", area);
		
		System.out.print(str + "\n" + x1 + "\n" + x2 + "\n" + ch1 + "\n" + ch2 + "\n");
		
		// массивы
		final int FROM = -50, TO = 50;
		final int SIZE = 5;
		int[] arr = new int[SIZE];
		
		// Свои методы
		System.out.println("Исходный массив:");
		Utils.show(arr);
		System.out.println("Массив заполнен случайными значениями:");
		Utils.fill(arr, FROM, TO);
		Utils.show(arr);
		
		// Ввод данных
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите целое число> ");
		num = scan.nextInt();
		scan.close();
		System.out.println("Значение переменной num = " + num);
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Введите целое число"));
		JOptionPane.showMessageDialog(null, "Введенное значение: " + num, "К сведению", JOptionPane.INFORMATION_MESSAGE);

	}

}
