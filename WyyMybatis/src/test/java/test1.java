import com.wyy.dao.IUserDao;
import com.wyy.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


public class test1 {
    @Test
    public  void test01() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatisConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory=  builder.build(is);
        SqlSession session = sqlSessionFactory.openSession();
        IUserDao userDao = session.getMapper(IUserDao.class);
        List<User> userList = userDao.selectAll();
        System.out.println(userList.toString());
        session.close();
        is.close();

    }
}
