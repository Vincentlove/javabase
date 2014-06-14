/**
 * 
 */
package cn.nsu.edu.singleton;

/**
 * @author Vincent
 *单例模式的第一种写法
 */
public class Singleton1 {
	
	private static Singleton1 instance;
	private Singleton1(){
		
	}
	public static Singleton1 getInstance(){
		if(instance == null){
			instance = new Singleton1();
		}
		return instance;
	}
}
