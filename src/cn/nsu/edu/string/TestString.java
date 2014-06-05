/**
 * 
 */
package cn.nsu.edu.string;

/**
 * @author Vincent
 * @version 1.0
 */
public class TestString {
	/**
	 * 用来测试字符串的输出
	 */
	public static void string() {
		String name = " 国家宝藏这个电影我喜欢！";
		System.out.println(name);
	}

	/**
	 * 字符串的拼接
	 * 
	 * @param args
	 */
	public static void concatenation() {
		String str1 = "欢迎";
		String str2 = "xxx";
		String str3 = "您的到来！";

		System.out.println(str1 + str2 + str3);
	}
	/**
	 * 字符串的另一种写法
	 */
	public static void concatenation1() {
		String str1 = "欢迎";
		String str2 = str1 + "刘德华";
		String str3 = str2 + "出场！";
		System.out.println(str3);
	}
	/**
	 * equals方法
	 */
	public static void TestEquals(){
		String  str1 = new String("abc");
		String  str2 = new String("abc");
		System.out.println(str1.equals(str2));
	}
	/**
	 * 
	 * @param args
	 */
	public static void TestEquals2(){
		String str1 = "abc";
		String str2 = "abc";
		System.out.println(str1==str2);
	}
	public static void main(String[] args) {
		// string();
//		concatenation1();
//		TestEquals();
		TestEquals2();
	}
}
