package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author uiys
 * @email oxo.com
 * @date 2020-01-10 12:42:11
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
