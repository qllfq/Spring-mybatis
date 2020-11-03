import com.qiao.mapper.UserMapper;
import com.qiao.pojo.User;
import com.qiao.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

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
}
