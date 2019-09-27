package anno1_required;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main1 {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("anno1.xml");
		Abc abc = context.getBean("abc", Abc.class);
		
		System.out.println(abc.showData());
	}
}