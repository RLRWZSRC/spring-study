import com.wjh.appconfig.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.wjh.pojo.User;


public class MyTest {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        User getUser = context.getBean("getUser", User.class);
        System.out.println(getUser.getName());

    }

}
