/**
 * 
 */
package cn.nsu.edu.base;

/**
 * @author Vincent
 *用方法重写乘法表类
 */
public class ForSum3 {

	/**
	 * @param args
	 */
	
	public static void sum(){
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(i+"x"+j+"="+(i*j)+"\t");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		sum();
	}

}
