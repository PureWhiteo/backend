package com.entity.vo;

import com.entity.YuedudakaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 阅读打卡
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-09 17:58:47
 */
public class YuedudakaVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 绘本类型
	 */
	
	private String huibenleixing;
		
	/**
	 * 作者
	 */
	
	private String zuozhe;
		
	/**
	 * 录音
	 */
	
	private String luyin;
		
	/**
	 * 阅读时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date yuedushijian;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 跨表用户id
	 */
	
	private Long crossuserid;
		
	/**
	 * 跨表主键id
	 */
	
	private Long crossrefid;
				
	
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
	 * 设置：录音
	 */
	 
	public void setLuyin(String luyin) {
		this.luyin = luyin;
	}
	
	/**
	 * 获取：录音
	 */
	public String getLuyin() {
		return luyin;
	}
				
	
	/**
	 * 设置：阅读时间
	 */
	 
	public void setYuedushijian(Date yuedushijian) {
		this.yuedushijian = yuedushijian;
	}
	
	/**
	 * 获取：阅读时间
	 */
	public Date getYuedushijian() {
		return yuedushijian;
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
	 * 设置：跨表用户id
	 */
	 
	public void setCrossuserid(Long crossuserid) {
		this.crossuserid = crossuserid;
	}
	
	/**
	 * 获取：跨表用户id
	 */
	public Long getCrossuserid() {
		return crossuserid;
	}
				
	
	/**
	 * 设置：跨表主键id
	 */
	 
	public void setCrossrefid(Long crossrefid) {
		this.crossrefid = crossrefid;
	}
	
	/**
	 * 获取：跨表主键id
	 */
	public Long getCrossrefid() {
		return crossrefid;
	}
			
}
