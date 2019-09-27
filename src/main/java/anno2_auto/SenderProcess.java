package anno2_auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component("aa")
//@Component("senderProcess")
//@Component : singleton을 위한 것임을 감지할 수 있다. 
@Service // @Component와 같은 역할이나 가독성을 위함. 또한 Business Logic임을 감지할 수 있다. 
@ComponentScan("anno2_auto")
public class SenderProcess { // Business Logic
	@Autowired // set을 대신한다. type에 의한 mapping.
	private Sender sender;
	
//	public void setSender(Sender sender) {
//		this.sender = sender;
//	}
	
	public Sender getSender() {
		return sender;
	}
	
	public void dispData() {
		sender.show();
	}
}