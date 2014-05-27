/**
 * 
 */
package cn.nsu.edu.base;

/**
 * 
 * @author Vincent
 * 
 */
public class ForSum {

	// 利用for求100的和

	public static void main(String[] args) {
		int oddsum = 0;// 保存奇数
		for (int i = 0; i <= 100; i++) {
			
			if (i % 2 != 0) {
				oddsum += i;
			}
		}
		System.out.println("奇数的和："+oddsum);
	}
}
