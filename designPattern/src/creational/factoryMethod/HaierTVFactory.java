/**
 * 
 */
package creational.factoryMethod;

/** 
 * @ClassName: HaierTVFactory 
 * @Description: TODO()
 * @author zhengqiang
 * @Email 1126686939@qq.com 
 * @Date 2018-04-08 16:03
 */
public class HaierTVFactory implements TVFactory{
	
	@Override
	public TV produceTV() {
		// TODO Auto-generated method stub
		System.out.println("HaierTVFactory is producing TV....");	
		return new HaierTV();
	}
}
