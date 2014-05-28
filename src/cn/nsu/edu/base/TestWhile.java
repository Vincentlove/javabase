package cn.nsu.edu.base;
/**
 * while循环
 * @author Vincent
 *
 */
public class TestWhile {
	public static void main(String [] args){
		//开始的时间
		long startTime=System.currentTimeMillis();
		int i = 0;
		while(i<=10000000){
			System.out.println(i);
			i++;
		}
		//结束的时间
		long endTime=System.currentTimeMillis(); 
		//运行的时间
		System.out.println("程序运行时间： "+(endTime-startTime)+"ms");
	}
}
