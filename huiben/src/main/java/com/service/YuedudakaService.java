package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuedudakaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuedudakaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuedudakaView;


/**
 * 阅读打卡
 *
 * @author 
 * @email 
 * @date 2022-04-09 17:58:47
 */
public interface YuedudakaService extends IService<YuedudakaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuedudakaVO> selectListVO(Wrapper<YuedudakaEntity> wrapper);
   	
   	YuedudakaVO selectVO(@Param("ew") Wrapper<YuedudakaEntity> wrapper);
   	
   	List<YuedudakaView> selectListView(Wrapper<YuedudakaEntity> wrapper);
   	
   	YuedudakaView selectView(@Param("ew") Wrapper<YuedudakaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuedudakaEntity> wrapper);
   	

}

