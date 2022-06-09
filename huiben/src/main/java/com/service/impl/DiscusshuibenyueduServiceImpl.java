package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscusshuibenyueduDao;
import com.entity.DiscusshuibenyueduEntity;
import com.service.DiscusshuibenyueduService;
import com.entity.vo.DiscusshuibenyueduVO;
import com.entity.view.DiscusshuibenyueduView;

@Service("discusshuibenyueduService")
public class DiscusshuibenyueduServiceImpl extends ServiceImpl<DiscusshuibenyueduDao, DiscusshuibenyueduEntity> implements DiscusshuibenyueduService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusshuibenyueduEntity> page = this.selectPage(
                new Query<DiscusshuibenyueduEntity>(params).getPage(),
                new EntityWrapper<DiscusshuibenyueduEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusshuibenyueduEntity> wrapper) {
		  Page<DiscusshuibenyueduView> page =new Query<DiscusshuibenyueduView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusshuibenyueduVO> selectListVO(Wrapper<DiscusshuibenyueduEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusshuibenyueduVO selectVO(Wrapper<DiscusshuibenyueduEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusshuibenyueduView> selectListView(Wrapper<DiscusshuibenyueduEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusshuibenyueduView selectView(Wrapper<DiscusshuibenyueduEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
