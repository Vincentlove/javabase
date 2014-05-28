package cn.nsu.edu.base;

/**
 * 
 * @author Vincent
 * 
 *         For循环
 */

public class TestFor {
	public static void main(String[] args) {
		// 开始的时间
		long startTime = System.currentTimeMillis();
		for (int i = 0; i <= 10000000; i++) {
			System.out.println(i);
		}
		// 结束的时间
		long endTime = System.currentTimeMillis();
		// 运行的时间
		System.out.println("程序运行时间： " + (endTime - startTime) + "ms");
	}
}
