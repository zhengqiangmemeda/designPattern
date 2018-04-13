package creational.simpleFactory;

/**
 * 
 */
interface TV{
	public void display();
}

class HisenseTV implements TV{
	@Override
	public void display() {
		System.out.println("Hisense TV is displaying....");	
	}	
}

class HaierTV implements TV{
	@Override
	public void display() {
		System.out.println("Haier TV is displaying....");	
	}	
}

class TVFactory{
	public static TV produceTV(String brandName) throws Exception{
		if(brandName.equalsIgnoreCase("Haier"))
		{
			System.out.println("TV factory produce Haier TV!");
			return new HaierTV();
		}
		else if(brandName.equalsIgnoreCase("Hisense"))
		{
			System.out.println("TV factory produce Hisense TV!");
			return new HisenseTV();
		}
		else
		{
			throw new Exception("Sorry,can't produce this kind of TV at present!");
		}
	}
}
/** 
 * @ClassName: TVDemo 
 * @Description: TODO()
 * @author zhengqiang
 * @Email 1126686939@qq.com 
 * @Date 2018-04-08 09:33
 */
public class TVDemo {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			TV tv=TVFactory.produceTV(XMLUtilTV.getBrandName(1));
			tv.display();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("error happen while producing tv!");
			e.printStackTrace();
			
		}
		
	}

}
