package cn.lwkang.jap.dao;

import cn.lwkang.jap.domain.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailDao extends JpaRepository<UserDetail,Long> {

}
