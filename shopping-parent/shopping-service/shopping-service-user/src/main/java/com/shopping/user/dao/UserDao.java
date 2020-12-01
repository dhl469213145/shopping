package com.shopping.user.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shopping.user.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户表
 * 
 * @author dhl
 * @email dinghl@sqqmall.com
 * @date 2020-12-01 12:02:07
 */
@Mapper
public interface UserDao extends BaseMapper<UserEntity> {
	
}
