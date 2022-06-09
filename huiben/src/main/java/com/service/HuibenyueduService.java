package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuibenyueduEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuibenyueduVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuibenyueduView;


/**
 * 绘本阅读
 *
 * @author 
 * @email 
 * @date 2022-04-09 17:58:47
 */
public interface HuibenyueduService extends IService<HuibenyueduEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuibenyueduVO> selectListVO(Wrapper<HuibenyueduEntity> wrapper);
   	
   	HuibenyueduVO selectVO(@Param("ew") Wrapper<HuibenyueduEntity> wrapper);
   	
   	List<HuibenyueduView> selectListView(Wrapper<HuibenyueduEntity> wrapper);
   	
   	HuibenyueduView selectView(@Param("ew") Wrapper<HuibenyueduEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuibenyueduEntity> wrapper);
   	

}

