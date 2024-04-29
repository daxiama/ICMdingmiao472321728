package com.entity.model;

import com.entity.ShangjixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 上机信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 */
public class ShangjixinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 手机号码
	 */
	
	private String shoujihaoma;
		
	/**
	 * 上机时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shangjishijian;
		
	/**
	 * 状态
	 */
	
	private String zhuangtai;
		
	/**
	 * 机号
	 */
	
	private String jihao;
		
	/**
	 * 单价
	 */
	
	private Integer danjia;
				
	
	/**
	 * 设置：用户姓名
	 */
	 
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
				
	
	/**
	 * 设置：手机号码
	 */
	 
	public void setShoujihaoma(String shoujihaoma) {
		this.shoujihaoma = shoujihaoma;
	}
	
	/**
	 * 获取：手机号码
	 */
	public String getShoujihaoma() {
		return shoujihaoma;
	}
				
	
	/**
	 * 设置：上机时间
	 */
	 
	public void setShangjishijian(Date shangjishijian) {
		this.shangjishijian = shangjishijian;
	}
	
	/**
	 * 获取：上机时间
	 */
	public Date getShangjishijian() {
		return shangjishijian;
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
				
	
	/**
	 * 设置：机号
	 */
	 
	public void setJihao(String jihao) {
		this.jihao = jihao;
	}
	
	/**
	 * 获取：机号
	 */
	public String getJihao() {
		return jihao;
	}
				
	
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
			
}
