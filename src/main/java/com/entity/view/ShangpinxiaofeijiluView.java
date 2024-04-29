package com.entity.view;

import com.entity.ShangpinxiaofeijiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 商品消费记录
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("shangpinxiaofeijilu")
public class ShangpinxiaofeijiluView  extends ShangpinxiaofeijiluEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShangpinxiaofeijiluView(){
	}
 
 	public ShangpinxiaofeijiluView(ShangpinxiaofeijiluEntity shangpinxiaofeijiluEntity){
 	try {
			BeanUtils.copyProperties(this, shangpinxiaofeijiluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
