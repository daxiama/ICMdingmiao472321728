package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 下机扣费记录
 * 数据库通用操作实体类（普通增删改查）
 */
@TableName("xiajikoufeijilu")
public class XiajikoufeijiluEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XiajikoufeijiluEntity() {
		
	}
	
	public XiajikoufeijiluEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 下机编号
	 */
					
	private String xiajibianhao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：下机编号
	 */
	public void setXiajibianhao(String xiajibianhao) {
		this.xiajibianhao = xiajibianhao;
	}
	/**
	 * 获取：下机编号
	 */
	public String getXiajibianhao() {
		return xiajibianhao;
	}
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
