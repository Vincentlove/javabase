/**
 * 
 */
package cn.nsu.edu.string;

/**
 * @author Vincent 比较equals方法和==的差别
 */
public class TestEquals {

	/**
	 * @param args
	 */
	public static void equals1() {
		String s1 = "abc";
		String s2 = "abc";

		System.out.println("等于方法：" + s1 == s2);// 值为false说明是不同的对象，进一步说明==比较的是内存地址
		System.out.println("方法equals: " + s1.equals(s2));// 值为true说明是同一个对象，进一步说明equals比较的是对象的值。
	}

	public static void equals2() {
		String s1 = new String("abc");
		String s2 = "abc";
		System.out.println("用new创建：" + s1 == s2);
		System.out.println("用new创建equals：" + s1.equals(s2));
	}

	public static void equals3() {
		String s1 = "abc";
		String s2 = "abc";

		if (s1 == s2) {
			System.out.println("s1==s2");
		} else {
			System.out.println("s1 != s2");
		}
	}

	public static void equals4() {
		String s1 = "abc";
		String s2 = new String("abc");

		if (s1 == s2) {
			System.out.println("s1==s2");
		} else {
			System.out.println("s1 != s2");
		}
		 if (s1.equals(s2)) {
			System.out.println("s1 equals s2!");
		} else {
			System.out.println("s1 not equals s2!");
		}
	}

	public static void main(String[] args) {
//		equals3();
//		System.out.println("------------------1---------------------");
		equals4();
		System.out.println("------------------2---------------------");
		// equals2();
		// System.out.println("------------------2---------------------");
		// equals3();
	}

}
