/**
 * 
 */
package cn.nsu.edu.base;

import java.util.Scanner;

/**
 * 测试键盘的输入
 * 
 * @author Vincent
 * @version1.0
 */
public class TestScanner {
	
	/**
	 * 用来接受键盘输入的方法
	 * 
	 */
	public static void input() {
		
		@SuppressWarnings("resource")
		Scanner inputScanner = new Scanner(System.in);
		// 接受键盘输入的数据
		String Str = inputScanner.next();
		System.out.println("刚才输入的数据是："+Str);
	}
	/**
	 * 用来计算的加法
	 */
	public static void compute(){
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入第一个数：");
		int a = scanner.nextInt();
		System.out.println("请输入第二个数：");
		int b = scanner.nextInt();
		
		int sum = a+b;
		System.out.println("计算的结果为："+sum);
	}
	
	public static void main(String[] args) {
//		input();
		compute();
	}
}
