package cn.lwkang.jap;

import cn.lwkang.jap.dao.UserDao;
import cn.lwkang.jap.domain.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {
    @Resource
    private UserDao userDao;

    @Test
    public void userDaoTest() {
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        String formattedDate = dateFormat.format(date);
        /*SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = format.format(date.getTime());*/
        User user1 = new User("zhang san", "152364", "zs@qq.com", "zs", formattedDate);
        User user2 = new User("li si", "452151", "ls@hotmail.com", "ls", formattedDate);
        User user3 = new User("wang wu", "123456", "ww@163.com", "ww", formattedDate);
        /*System.out.println(user1.toString());
        System.out.println(user2.toString());
        System.out.println(user3.toString());*/
        userDao.save(user1);
        userDao.save(user2);
        userDao.save(user3);

        /*List<User> users = new ArrayList<>();
        users = userDao.findAll();
        for(User user : users){
            System.out.println(user.toString());
        }
        //判断返回结果是否和预期一致，不一致报错
        Assert.assertEquals(3, userDao.findAll().size());
        Assert.assertEquals("kk", userDao.findByUserNameOrEmail("kk","qq.com").getNickName());
        userDao.delete(userDao.findByUserName("kk"));*/
    }

    @Test
    public void pageQuery(){
        int page=1,size=10;
        Sort sort = new Sort(Sort.Direction.DESC,"id");
        Pageable pageable = new PageRequest(page,size,sort);
        Page<User> users = userDao.findAll(pageable);
        for(User user : users){
            System.out.println(user.toString());
        }
    }

    @Test
    public void modifyUserNameById(){
        int row = userDao.modifyNameById("kk",2L);
        System.out.println(row);
    }
}
