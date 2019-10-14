package spring;

public class UserDaoImpl implements IUserDao{

	//构造函数
	public UserDaoImpl()
	{
		System.out.println("new UserDaoImpl() 实例化");
	}
	
	/**
	 * 自定义初始化方法（侵入性较低）
	 */
	public void myInit()
	{
		System.out.println("初始化...............");
	}
	
	@Override
	public void selectUser() {
		System.out.println("UserDaoImpl.selectUser..........杰成11111");
	}
	
	/**
	 * 自定义销毁方法（侵入性较低）
	 */
	public void myDestroy()
	{
		System.out.println("销毁...............");
	}

}
