package cn.lwkang.jap.dao;

import cn.lwkang.jap.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;

public interface UserDao extends JpaRepository<User, Long> {
    User findByUserName(String userName);

    User findByUserNameOrEmail(String userName, String email);

    @Transactional
    @Modifying
    @Query("update User set userName = ?1 where id = ?2")
    int modifyNameById(String name,Long id);
}
