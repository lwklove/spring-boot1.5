package cn.lwkang.jap.dao;

import cn.lwkang.jap.domain.UserDetail;
import cn.lwkang.jap.domain.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserInfoDao extends JpaRepository<UserDetail,Long> {

    @Query("select u.userName as userName, u.email as email, d.address as address , d.hobby as hobby from User u , UserDetail d " +
            "where u.id=d.userId  and  d.hobby = ?1 ")
    List<UserDetail> findUserInfo(String hobby);
}
