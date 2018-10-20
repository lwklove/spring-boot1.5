package cn.lwkang.jap;

import cn.lwkang.jap.dao.UserDetailDao;
import cn.lwkang.jap.domain.UserDetail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UsetDetailTest {
    @Resource
    private UserDetailDao userDetailDao;

    @Test
    public void saveUserDetail(){
        userDetailDao.save(new UserDetail("2","anhui","codeing"));
    }
}
