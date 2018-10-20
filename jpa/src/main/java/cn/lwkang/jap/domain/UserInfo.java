package cn.lwkang.jap.domain;

import cn.lwkang.jap.domain.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserInfo {
    String getUserName();
    String getEmail();
    String getAddress();
    String getHobby();
}
