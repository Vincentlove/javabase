/**
 * 
 */
package cn.nsu.edu.base;

/**
 * @author Vincent switch语句
 */
public class TestSwitch {
	public static void main(String[] args) {

		for (int i = 0; i <= 10; i++) {

			int e = i;
			System.out.println(e);
			System.out.println("###################################");

			switch (e) {
			case 2:
				System.out.println("哇塞");
				break;
			case 3:
				System.out.println("还可以啦");
				break;
			case 4:
				System.out.println("非常的厉害");
				break;
			default:
				System.out.println("感谢参与");
				break;
			}
		}
	}

}
