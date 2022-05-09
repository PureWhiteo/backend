package com.dao;

import com.entity.DiscusshuibenyueduEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusshuibenyueduVO;
import com.entity.view.DiscusshuibenyueduView;


/**
 * 绘本阅读评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-09 17:58:47
 */
public interface DiscusshuibenyueduDao extends BaseMapper<DiscusshuibenyueduEntity> {
	
	List<DiscusshuibenyueduVO> selectListVO(@Param("ew") Wrapper<DiscusshuibenyueduEntity> wrapper);
	
	DiscusshuibenyueduVO selectVO(@Param("ew") Wrapper<DiscusshuibenyueduEntity> wrapper);
	
	List<DiscusshuibenyueduView> selectListView(@Param("ew") Wrapper<DiscusshuibenyueduEntity> wrapper);

	List<DiscusshuibenyueduView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusshuibenyueduEntity> wrapper);
	
	DiscusshuibenyueduView selectView(@Param("ew") Wrapper<DiscusshuibenyueduEntity> wrapper);
	

}
