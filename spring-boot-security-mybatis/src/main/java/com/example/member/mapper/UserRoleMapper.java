package com.example.member.mapper;

import com.example.member.entity.UserRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Mapper
public interface UserRoleMapper {

    @Transactional
    void setUserRoleInfo(@Param("param") UserRole param);

}