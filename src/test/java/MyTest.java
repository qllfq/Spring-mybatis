import com.qiao.mapper.UserMapper;
import com.qiao.pojo.User;
import com.qiao.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    @Test
    public void selectUser(){
        SqlSession sqlSession = MybatisUtil.getSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = userMapper.selectUser();
        for (User user : users) {
            System.out.println(user);
        }

    }
    @Test
    public void mybatisSpringTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper mapper = context.getBean("userDao",UserMapper.class);
        List<User> users = mapper.selectUser();
        System.out.println(users);
    }
    @Test
    public void mybatisSpringTest2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper mapper = context.getBean("userMapper",UserMapper.class);
        List<User> users = mapper.selectUser();
        System.out.println(users);
    }
}
