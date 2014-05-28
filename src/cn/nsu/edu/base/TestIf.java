package cn.nsu.edu.base;

/*
 * 控制语句
 */

public class TestIf {

	public static void main(String[] args) {
		// 生成一个小于1的随机数
		double d = Math.random();
		// 生成一个1——5的数
		int e = 1 + (int) (d * 5);

		System.out.println(d);
		System.out.println(e);

		if (e > 3) {
			System.out.println("恭喜你！");
		} else {
			System.out.println("继续加油！");
		}
	}
}