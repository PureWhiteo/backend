package com.entity.view;

import com.entity.YuedudakaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 阅读打卡
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-09 17:58:47
 */
@TableName("yuedudaka")
public class YuedudakaView  extends YuedudakaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YuedudakaView(){
	}
 
 	public YuedudakaView(YuedudakaEntity yuedudakaEntity){
 	try {
			BeanUtils.copyProperties(this, yuedudakaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
