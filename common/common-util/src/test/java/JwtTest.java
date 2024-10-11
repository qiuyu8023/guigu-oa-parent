import com.atguigu.common.jwt.JwtHelper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


public class JwtTest {

    @Test
    public void testToken(){
        String username = "zhangsan";
        long times = 360000;
        String token = JwtHelper.createToken(times,username);

        System.out.println(token);
    }
}
