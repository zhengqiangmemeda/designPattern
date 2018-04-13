/**
 * 
 */
package creational.singleton;

/** 
 * @ClassName: EagerSingleton 
 * @Description: TODO()
 * @author zhengqiang
 * @Date 2018-04-10 16:48
 */
public class EagerSingleton {


	private EagerSingleton(){}
	private static EagerSingleton eagerSingleton=new EagerSingleton();
	public static EagerSingleton getInstance() {
		// TODO Auto-generated method stub
		return eagerSingleton;
	}

}
