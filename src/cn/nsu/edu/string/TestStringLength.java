/**
 * 
 */
package cn.nsu.edu.string;

/**
 * @author Vincent 读取字符串的长度
 */
public class TestStringLength {

	/**
	 * 读取字符串的长度
	 */
	public static void length() {
		// int n = "hello".length();
		String name = "hello";
		int n = name.length();

		System.out.println(n);
	}

	/**
	 * 
	 */
	public static void ADB() {
		// 这个方法表示的是从那一个下标开始返回
		String s = "hello".substring(0);
		// 这个方法表示的第一个实参是从这个下标开始返回，第二个参数是从这个下标结束（注意不包含这个下标指的数据）
		String s1 = "hello".substring(0, 4);

		System.out.println("这是s方法：" + s);
		System.out.println("这是s1方法：" + s1);

	}

	/**
	 * substring() 方法
	 * 
	 * @return
	 */
	public static String substring() {
		String s = "string".substring(2);
		System.out.println("substring方法1：" + s);
		return s;

	}

	/**
	 * substring()方法2
	 * 
	 * @param args
	 */
	public static String substring2() {
		String s = "string".substring(2, 4);
		System.out.println("substring方法2：" + s);
		return s;
	}
 
	public static void main(String[] args) {
		length();
		ADB();
		substring();
		substring2();
	}
}
