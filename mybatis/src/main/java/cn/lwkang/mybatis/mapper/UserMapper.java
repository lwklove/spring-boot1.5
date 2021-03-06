package cn.lwkang.mybatis.mapper;

import cn.lwkang.mybatis.entity.UserEntity;

import java.util.List;

public interface UserMapper {
    List<UserEntity> getAll();

    UserEntity getOne(Long id);

    void insert(UserEntity user);

    void update(UserEntity user);

    void delete(Long id);
}
