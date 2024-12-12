package lesson_1;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {
	
	public static final String RESET = "\u001B[0m";
	public static final String BLACK = "\u001B[30m";
	public static final String RED = "\u001B[31m";
	public static final String GREEN = "\u001B[32m";
	public static final String YELLOW = "\u001B[33m";
	public static final String BLUE = "\u001B[34m";
	public static final String PURPLE = "\u001B[35m";
	public static final String CYAN = "\u001B[36m";
	public static final String WHITE = "\u001B[37m";

    public static void main(String[] args) {
    	System.out.println("Текст до...");
    	System.out.println(RED +"Привет" + " " + GREEN + "из" + " " + YELLOW + "мира" + " " + BLUE + "Java" + CYAN + "!" + RESET);
    	System.out.println("Текст после...");
    	
    	long x = 1_000_000_000;
    	final double PI = 3.14;
    	char ch = '\u3698';
    	String str = "Это строка текста";
    	int num;
    	
    	double res = Math.cos(PI);
    	System.out.printf("Косинус = %.15f\n", res);
    	System.out.println(x);
    	System.out.println(ch);
    	System.out.println(str);
    	
    	final int SIZE = 5;
    	final int FROM = -50, TO = 50;
    	int[] arr = new int[SIZE];
    	
    	System.out.println("Исходный массив:");
    	Utils.show(arr);
    	System.out.println("Массив заполнен случ. значениями:");
    	Utils.fill(arr, FROM, TO);
    	Utils.show(arr);
    	
    	Scanner scanKeyBoard = new Scanner(System.in);
    	
    	System.out.println("Введите целое число> ");
    	num = scanKeyBoard.nextInt();
    	scanKeyBoard.close();
    	System.out.println("Введенное вами число = " + num);
    	
    	num = Integer.parseInt(JOptionPane.showInputDialog("Введите целое число"));
    	JOptionPane.showMessageDialog(null, "Введенное число = " + num, "К сведению", JOptionPane.INFORMATION_MESSAGE);
    	
    }
   
}

