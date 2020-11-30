import com.hand.Utils.MybatisUtils;
import com.hand.dao.UserMapper;
import com.hand.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Author ludongpeng
 * @Date 2020/11/30 21:16
 * @Description:
 */
public class MyTest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = mapper.queryUserById(41);
        System.out.println(user);

//        mapper.updateUser(new User(42,"太帅了", "哈哈哈"));

        sqlSession.clearCache();//手动清理缓存

        System.out.println("********");
        User user2 = mapper.queryUserById(41);
        System.out.println(user2);

        System.out.println(user == user2);

        sqlSession.close();
    }

    @Test
    public void test2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        SqlSession sqlSession2 = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = (User) mapper.queryUserById(41);
        System.out.println(user);
        sqlSession.close();

        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);
        User user2 = (User) mapper2.queryUserById(41);
        System.out.println(user2);

        System.out.println(user == user2);

        sqlSession2.close();
    }
}
