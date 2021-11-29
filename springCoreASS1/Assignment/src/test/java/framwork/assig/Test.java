package framwork.assig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
        testApplicationContext();
    }
 
    private static void testApplicationContext(){
 
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/spring/series/core/SpringContext.xml");
        Custemer custemer = (Custemer) applicationContext.getBean("custemer");
 
        System.out.println("Spring Application Demo using ApplicationContext\n");
 
        
        custemer.printCustemerDetail();

    }

}
