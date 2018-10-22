package cn.lwkang.jap.dao;

import cn.lwkang.jap.domain.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserDetailDao extends JpaRepository<UserDetail,Long> {
    List<UserDetail> findByHobby(String hobby);
}
