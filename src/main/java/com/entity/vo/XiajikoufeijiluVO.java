package com.entity.vo;

import com.entity.XiajikoufeijiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 下机扣费记录
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 */
public class XiajikoufeijiluVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
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
	
	private String shangjishijian;
		
	/**
	 * 机号
	 */
	
	private String jihao;
		
	/**
	 * 时间
	 */
	
	private Integer shijian;
		
	/**
	 * 单价
	 */
	
	private Integer danjia;
		
	/**
	 * 金额
	 */
	
	private Float jine;
		
	/**
	 * 提交时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tijiaoshijian;
				
	
	/**
	 * 设置：用户账号
	 */
	 
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
				
	
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
	 
	public void setShangjishijian(String shangjishijian) {
		this.shangjishijian = shangjishijian;
	}
	
	/**
	 * 获取：上机时间
	 */
	public String getShangjishijian() {
		return shangjishijian;
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
	 * 设置：时间
	 */
	 
	public void setShijian(Integer shijian) {
		this.shijian = shijian;
	}
	
	/**
	 * 获取：时间
	 */
	public Integer getShijian() {
		return shijian;
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
				
	
	/**
	 * 设置：金额
	 */
	 
	public void setJine(Float jine) {
		this.jine = jine;
	}
	
	/**
	 * 获取：金额
	 */
	public Float getJine() {
		return jine;
	}
				
	
	/**
	 * 设置：提交时间
	 */
	 
	public void setTijiaoshijian(Date tijiaoshijian) {
		this.tijiaoshijian = tijiaoshijian;
	}
	
	/**
	 * 获取：提交时间
	 */
	public Date getTijiaoshijian() {
		return tijiaoshijian;
	}
			
}
