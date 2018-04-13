/**
 * 
 */
package creational.factoryMethod;

/** 
 * @ClassName: HisenseTVFactory 
 * @Description: TODO()
 * @author zhengqiang
 * @Email 1126686939@qq.com 
 * @Date 2018-04-08 15:59
 */
public class HisenseTVFactory implements TVFactory{

	/* (non-Javadoc)
	 * @see creational.factoryMethod.TVFactory#produceTV()
	 */
	@Override
	public TV produceTV() {
		// TODO Auto-generated method stub
		System.out.println("HisenseTVFactory is producing TV....");	
		return new HisenseTV();
	}

}
