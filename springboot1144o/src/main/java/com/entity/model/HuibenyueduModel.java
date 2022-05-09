package com.entity.model;

import com.entity.HuibenyueduEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 绘本阅读
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-09 17:58:47
 */
public class HuibenyueduModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
