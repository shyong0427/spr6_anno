package anno2_auto;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {
	public static void main(String[] args) {
		String []metas = new String[] {"anno2.xml"};
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(metas[0]);
		SenderProcess process = context.getBean("senderProcess", SenderProcess.class);
		
		process.dispData();
		process.getSender().show();
	}
}