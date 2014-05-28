/**
 * 
 */
package cn.nsu.edu.base;

/**
 * @author Vincent
 *方法的使用
 */
public class Method {
	
	
	public static int add(int a,int b){
		int sum =a+b;
		return sum;
	}
	
	public static void main(String [] args){
		int s = add(3,5);
		System.out.println(s);
	}

}
