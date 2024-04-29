package com.entity.view;

import com.entity.XiajikoufeijiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 下机扣费记录
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("xiajikoufeijilu")
public class XiajikoufeijiluView  extends XiajikoufeijiluEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiajikoufeijiluView(){
	}
 
 	public XiajikoufeijiluView(XiajikoufeijiluEntity xiajikoufeijiluEntity){
 	try {
			BeanUtils.copyProperties(this, xiajikoufeijiluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
