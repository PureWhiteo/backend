package com.dao;

import com.entity.YuedudakaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuedudakaVO;
import com.entity.view.YuedudakaView;


/**
 * 阅读打卡
 * 
 * @author 
 * @email 
 * @date 2022-04-09 17:58:47
 */
public interface YuedudakaDao extends BaseMapper<YuedudakaEntity> {
	
	List<YuedudakaVO> selectListVO(@Param("ew") Wrapper<YuedudakaEntity> wrapper);
	
	YuedudakaVO selectVO(@Param("ew") Wrapper<YuedudakaEntity> wrapper);
	
	List<YuedudakaView> selectListView(@Param("ew") Wrapper<YuedudakaEntity> wrapper);

	List<YuedudakaView> selectListView(Pagination page,@Param("ew") Wrapper<YuedudakaEntity> wrapper);
	
	YuedudakaView selectView(@Param("ew") Wrapper<YuedudakaEntity> wrapper);
	

}
