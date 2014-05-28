package cn.nsu.edu.base;

public class TestDataType 
{
	
	public static void main(String[] args)
	{
		int a = 10;
		String name = "乱个乱码有点灵异";
		//转换成二进制阿斯达岁的撒旦啊是阿萨德阿萨德阿萨德啊是挨打啊啊啊阿萨德啊是
		System.out.println(Integer.toBinaryString(a));
		//转换为八进制的的
		System.out.println(Integer.toOctalString(a));
		//转换成二进制阿斯达岁的撒旦啊是阿萨德阿萨德阿萨德啊是挨打啊啊啊阿萨德啊是
		//注释
		System.out.println(Integer.toBinaryString(a));
		System.out.println(name);
		//转换为八进制的的
		System.out.println(Integer.toHexString(a));
	}
}