package com.entity.model;

import com.entity.DiannaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 电脑信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 */
public class DiannaoxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 单价
	 */
	
	private Integer danjia;
		
	/**
	 * 电脑详情
	 */
	
	private String diannaoxiangqing;
		
	/**
	 * 状态
	 */
	
	private String zhuangtai;
				
	
	/**
	 * 设置：单价
	 */
	 
	public void setDanjia(Integer danjia) {
		this.danjia = danjia;
	}
	
	/**
	 * 获取：单价
	 */
	public Integer getDanjia() {
		return danjia;
	}
				
	
	/**
	 * 设置：电脑详情
	 */
	 
	public void setDiannaoxiangqing(String diannaoxiangqing) {
		this.diannaoxiangqing = diannaoxiangqing;
	}
	
	/**
	 * 获取：电脑详情
	 */
	public String getDiannaoxiangqing() {
		return diannaoxiangqing;
	}
				
	
	/**
	 * 设置：状态
	 */
	 
	public void setZhuangtai(String zhuangtai) {
		this.zhuangtai = zhuangtai;
	}
	
	/**
	 * 获取：状态
	 */
	public String getZhuangtai() {
		return zhuangtai;
	}
			
}
