/**
 * 
 */
package creational.simpleFactory;

abstract class User{
	public void sameOperation(){
		System.out.println("sameOperation()");
	}
	public abstract void diffOperation();
}

class Employee extends User{
	public Employee()
	{
		System.out.println("create employee object£¡");
	}
	@Override
	public void diffOperation() {
		System.out.println("Employee have the permision to create note£¡");
	}
}

class Manager extends User{
	public Manager()
	{
		System.out.println("create Manager object£¡");
	}
	@Override
	public void diffOperation() {
		System.out.println("Manager have the permision to create note and approl note£¡");
	}
}

class Administrator extends User{
	public Administrator()
	{
		System.out.println("create Administrator object£¡");
	}
	@Override
	public void diffOperation() {
		System.out.println("Administrator have the permision to create note and manage note£¡");
	}
}

class UserFactory{
	public static User getUser(int permission){
		if(0==permission)
		{
			return new Employee();
		}
		else if(1==permission)
		{
			return new Manager();
		}
		else if(2==permission)
		{
			return new Administrator();
		}
		else
		{
			return null;
		}
	}
}

class UserDao{
	 public int findPermission(String userName,String userPassword)
	    {
	    	if("zhangsan"==userName&&"123456"==userPassword)
	    	{
	    		return 2;
	    	}
	    	else
	    	{
	    		return -1;
	    	}
	    }
}
/** 
 * @ClassName: UserDemo 
 * @Description: TODO()
 * @author zhengqiang
 * @Email 1126686939@qq.com 
 * @Date 2018-04-08 11:13
 */
public class UserDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			User user;
			UserDao userDao=new UserDao();
			int no=userDao.findPermission("zhangsan", "123456");
			user=UserFactory.getUser(no);
			user.sameOperation();
			user.diffOperation();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
