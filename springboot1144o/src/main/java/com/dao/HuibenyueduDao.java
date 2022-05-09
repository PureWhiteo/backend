package com.dao;

import com.entity.HuibenyueduEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuibenyueduVO;
import com.entity.view.HuibenyueduView;


/**
 * 绘本阅读
 * 
 * @author 
 * @email 
 * @date 2022-04-09 17:58:47
 */
public interface HuibenyueduDao extends BaseMapper<HuibenyueduEntity> {
	
	List<HuibenyueduVO> selectListVO(@Param("ew") Wrapper<HuibenyueduEntity> wrapper);
	
	HuibenyueduVO selectVO(@Param("ew") Wrapper<HuibenyueduEntity> wrapper);
	
	List<HuibenyueduView> selectListView(@Param("ew") Wrapper<HuibenyueduEntity> wrapper);

	List<HuibenyueduView> selectListView(Pagination page,@Param("ew") Wrapper<HuibenyueduEntity> wrapper);
	
	HuibenyueduView selectView(@Param("ew") Wrapper<HuibenyueduEntity> wrapper);
	

}
