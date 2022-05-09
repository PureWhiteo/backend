package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuibenleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuibenleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuibenleixingView;


/**
 * 绘本类型
 *
 * @author 
 * @email 
 * @date 2022-04-09 17:58:47
 */
public interface HuibenleixingService extends IService<HuibenleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuibenleixingVO> selectListVO(Wrapper<HuibenleixingEntity> wrapper);
   	
   	HuibenleixingVO selectVO(@Param("ew") Wrapper<HuibenleixingEntity> wrapper);
   	
   	List<HuibenleixingView> selectListView(Wrapper<HuibenleixingEntity> wrapper);
   	
   	HuibenleixingView selectView(@Param("ew") Wrapper<HuibenleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuibenleixingEntity> wrapper);
   	

}

