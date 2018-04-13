/**
 * 
 */
package creational.factoryMethod;

/** 
 * @ClassName: Client 
 * @Description: TODO()
 * @author zhengqiang
 * @Email 1126686939@qq.com 
 * @Date 2018-04-08 16:09
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			TVFactory factory;
			TV tv;
			factory=(TVFactory) XMLUtil.getBean();
			tv=factory.produceTV();
			tv.display();
		}catch(Exception e){
			e.printStackTrace();
		}
	
	}

}
