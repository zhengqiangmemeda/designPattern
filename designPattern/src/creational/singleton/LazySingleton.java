/**
 * 
 */
package creational.singleton;

/** 
 * @ClassName: LazySingleton 
 * @Description: TODO()
 * @author zhengqiang
 * @Date 2018-04-10 18:26
 */
public class LazySingleton {
	private static volatile LazySingleton lazySingleton=null;
	private LazySingleton(){}
	
	public LazySingleton getInstance(){
		if(lazySingleton==null){
			synchronized(LazySingleton.class){
				if(lazySingleton==null){
					return new LazySingleton();
				}
			}
		}
		return lazySingleton;
	}
}
