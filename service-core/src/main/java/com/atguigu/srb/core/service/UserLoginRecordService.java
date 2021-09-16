package com.atguigu.srb.core.service;

import com.atguigu.srb.core.pojo.entity.UserLoginRecord;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 用户登录记录表 服务类
 * </p>
 *
 * @author 张慧
 * @since 2021-08-12
 */
public interface UserLoginRecordService extends IService<UserLoginRecord> {
    List<UserLoginRecord> listTop50(Long userId);
}
