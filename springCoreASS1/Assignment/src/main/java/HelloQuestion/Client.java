package HelloQuestion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import framwork.assig.Custemer;

public class Client {
	
	public static void main(String[] args)
			throws Exception
		{

			
					
		ApplicationContext cap1= new ClassPathXmlApplicationContext("SpringContext.xml");
		Custemer c= (Custemer) cap1.getBean("custemer");
		c.printCustemerDetail();
			 			

			
			/* cap.close(); */
			((ConfigurableApplicationContext) cap1).close();
		}

}
