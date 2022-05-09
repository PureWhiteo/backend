package com.entity.view;

import com.entity.DiscusshuibenyueduEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 绘本阅读评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-09 17:58:47
 */
@TableName("discusshuibenyuedu")
public class DiscusshuibenyueduView  extends DiscusshuibenyueduEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusshuibenyueduView(){
	}
 
 	public DiscusshuibenyueduView(DiscusshuibenyueduEntity discusshuibenyueduEntity){
 	try {
			BeanUtils.copyProperties(this, discusshuibenyueduEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
