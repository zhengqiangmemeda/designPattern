/**
 * 
 */
package creational.singleton;

/** 
 * @ClassName: BestSingle 
 * @Description: TODO()
 * @author zhengqiang
 * @Date 2018-04-10 18:37
 */
public class BestSingle {

	private BestSingle(){}
	
	private static class HoldClass{
		private static final BestSingle bestSingle=new BestSingle();
	}
	
	public static BestSingle getInstance(){
		return HoldClass.bestSingle;
	}
	
	public static void main(String[] args) {
		
		BestSingle s1=BestSingle.getInstance();
		BestSingle s2=BestSingle.getInstance();
		System.out.println(s1==s2);
	}
}
