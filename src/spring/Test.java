package spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args){
		/**
		 * bean的生命周期：
		 * 		实例化  -> 初始化 —> 使用对象  ->  销毁
		 */
		//1.加载并且解析applicationContext.xml
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//2.获取工厂中的IUserDao对象了
		IUserDao userDao = (IUserDao)factory.getBean("userDao"); 
		
		//3.调用方法
		userDao.selectUser();
		
		//4.销毁对象
		factory.close();

	}

}
