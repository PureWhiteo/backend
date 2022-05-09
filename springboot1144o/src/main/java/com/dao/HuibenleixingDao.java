package com.dao;

import com.entity.HuibenleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuibenleixingVO;
import com.entity.view.HuibenleixingView;


/**
 * 绘本类型
 * 
 * @author 
 * @email 
 * @date 2022-04-09 17:58:47
 */
public interface HuibenleixingDao extends BaseMapper<HuibenleixingEntity> {
	
	List<HuibenleixingVO> selectListVO(@Param("ew") Wrapper<HuibenleixingEntity> wrapper);
	
	HuibenleixingVO selectVO(@Param("ew") Wrapper<HuibenleixingEntity> wrapper);
	
	List<HuibenleixingView> selectListView(@Param("ew") Wrapper<HuibenleixingEntity> wrapper);

	List<HuibenleixingView> selectListView(Pagination page,@Param("ew") Wrapper<HuibenleixingEntity> wrapper);
	
	HuibenleixingView selectView(@Param("ew") Wrapper<HuibenleixingEntity> wrapper);
	

}
