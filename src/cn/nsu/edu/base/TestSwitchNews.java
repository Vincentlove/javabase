/**
 * 
 */
package cn.nsu.edu.base;

/**
 * @author Vincent JDK7中switch语句的新特性
 * 
 */
public class TestSwitchNews {
	public static void main(String[] args) {
		String str = "嘻嘻";
		switch (str) {
		case "哈哈":
			System.out.println("心情不错嘛！");
			break;
		case "嘻嘻":
			System.out.println("有点快乐");
			break;
		default:
			System.out.println("心情不太好");
			break;
		}

	}

}
