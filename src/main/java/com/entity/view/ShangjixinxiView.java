package com.entity.view;

import com.entity.ShangjixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 上机信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("shangjixinxi")
public class ShangjixinxiView  extends ShangjixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShangjixinxiView(){
	}
 
 	public ShangjixinxiView(ShangjixinxiEntity shangjixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, shangjixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
