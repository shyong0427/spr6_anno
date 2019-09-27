package anno2_auto;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("sender")
//@Scope("singleton") // @Component("sender") @Scope("singleton") 이것은 밑의 @Component와 같은 의미이다.
@Component // @Component사용 시 singleton type으로 스스로 객체 변수이름(new)을 갖는다.
public class Sender {
	public void show() {
		System.out.println("show working on method...");
	}
}