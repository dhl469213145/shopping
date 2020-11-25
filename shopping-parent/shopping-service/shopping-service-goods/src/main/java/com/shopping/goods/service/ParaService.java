package com.shopping.goods.service;


import com.baomidou.mybatisplus.extension.service.IService;
import pojo.entity.ParaEntity;
import utils.PageUtils;

import java.util.Map;

/**
 * 
 *
 * @author dhl
 * @email dinghl@sqqmall.com
 * @date 2020-11-23 15:45:56
 */
public interface ParaService extends IService<ParaEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

