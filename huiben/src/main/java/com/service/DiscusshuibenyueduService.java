package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusshuibenyueduEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusshuibenyueduVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusshuibenyueduView;


/**
 * 绘本阅读评论表
 *
 * @author 
 * @email 
 * @date 2022-04-09 17:58:47
 */
public interface DiscusshuibenyueduService extends IService<DiscusshuibenyueduEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusshuibenyueduVO> selectListVO(Wrapper<DiscusshuibenyueduEntity> wrapper);
   	
   	DiscusshuibenyueduVO selectVO(@Param("ew") Wrapper<DiscusshuibenyueduEntity> wrapper);
   	
   	List<DiscusshuibenyueduView> selectListView(Wrapper<DiscusshuibenyueduEntity> wrapper);
   	
   	DiscusshuibenyueduView selectView(@Param("ew") Wrapper<DiscusshuibenyueduEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusshuibenyueduEntity> wrapper);
   	

}

