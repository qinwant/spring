import com.kingwan.config.KingwanConfig;
import com.kingwan.repository.Hello;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by kingwan on 2020/8/11.
 * 说明：
 */
public class KingwanTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(KingwanConfig.class);
		Hello bean = context.getBean(Hello.class);
		bean.hello();
	}
}
