package cn.lwkang.jap;

import cn.lwkang.jap.dao.UserInfoDao;
import cn.lwkang.jap.domain.UserDetail;
import cn.lwkang.jap.domain.UserInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserInfoTest {

    @Resource
    private UserInfoDao userInfoDao;

    @Test
    public void saveUserInfo(){
        userInfoDao.save(new UserDetail("2","anhui","codeing"));
    }

    @Test
    public void testUserInfo(){
        /*List<UserInfo> userInfos=userInfo.findUserInfo("打球");
        for (UserInfo userInfo:userInfos){
            System.out.println("addree "+userInfo.getAddress());
        }*/
    }
}
