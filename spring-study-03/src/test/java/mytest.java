import com.wjh.demo1.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mytest {

    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        User user = context.getBean("user",User.class);
        System.out.println(user.name);
    }

}



