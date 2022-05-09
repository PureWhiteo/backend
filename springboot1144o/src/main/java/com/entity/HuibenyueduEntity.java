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
 * 绘本阅读
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-09 17:58:47
 */
@TableName("huibenyuedu")
public class HuibenyueduEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public HuibenyueduEntity() {
		
	}
	
	public HuibenyueduEntity(T t) {
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
	 * 绘本名称
	 */
					
	private String huibenmingcheng;
	
	/**
	 * 封面
	 */
					
	private String fengmian;
	
	/**
	 * 绘本类型
	 */
					
	private String huibenleixing;
	
	/**
	 * 作者
	 */
					
	private String zuozhe;
	
	/**
	 * 级别
	 */
					
	private String jibie;
	
	/**
	 * 绘本听读
	 */
					
	private String huibentingdu;
	
	/**
	 * 绘本阅读
	 */
					
	private String huibenyuedu;
	
	/**
	 * 绘本译文
	 */
					
	private String huibenyiwen;
	
	/**
	 * 发布时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date fabushijian;
	
	/**
	 * 赞
	 */
					
	private Integer thumbsupnum;
	
	/**
	 * 踩
	 */
					
	private Integer crazilynum;
	
	
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
	 * 设置：绘本名称
	 */
	public void setHuibenmingcheng(String huibenmingcheng) {
		this.huibenmingcheng = huibenmingcheng;
	}
	/**
	 * 获取：绘本名称
	 */
	public String getHuibenmingcheng() {
		return huibenmingcheng;
	}
	/**
	 * 设置：封面
	 */
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
	/**
	 * 设置：绘本类型
	 */
	public void setHuibenleixing(String huibenleixing) {
		this.huibenleixing = huibenleixing;
	}
	/**
	 * 获取：绘本类型
	 */
	public String getHuibenleixing() {
		return huibenleixing;
	}
	/**
	 * 设置：作者
	 */
	public void setZuozhe(String zuozhe) {
		this.zuozhe = zuozhe;
	}
	/**
	 * 获取：作者
	 */
	public String getZuozhe() {
		return zuozhe;
	}
	/**
	 * 设置：级别
	 */
	public void setJibie(String jibie) {
		this.jibie = jibie;
	}
	/**
	 * 获取：级别
	 */
	public String getJibie() {
		return jibie;
	}
	/**
	 * 设置：绘本听读
	 */
	public void setHuibentingdu(String huibentingdu) {
		this.huibentingdu = huibentingdu;
	}
	/**
	 * 获取：绘本听读
	 */
	public String getHuibentingdu() {
		return huibentingdu;
	}
	/**
	 * 设置：绘本阅读
	 */
	public void setHuibenyuedu(String huibenyuedu) {
		this.huibenyuedu = huibenyuedu;
	}
	/**
	 * 获取：绘本阅读
	 */
	public String getHuibenyuedu() {
		return huibenyuedu;
	}
	/**
	 * 设置：绘本译文
	 */
	public void setHuibenyiwen(String huibenyiwen) {
		this.huibenyiwen = huibenyiwen;
	}
	/**
	 * 获取：绘本译文
	 */
	public String getHuibenyiwen() {
		return huibenyiwen;
	}
	/**
	 * 设置：发布时间
	 */
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
	/**
	 * 设置：赞
	 */
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
	/**
	 * 设置：踩
	 */
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}

}
