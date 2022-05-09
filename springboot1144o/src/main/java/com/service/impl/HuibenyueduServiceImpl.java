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


import com.dao.HuibenyueduDao;
import com.entity.HuibenyueduEntity;
import com.service.HuibenyueduService;
import com.entity.vo.HuibenyueduVO;
import com.entity.view.HuibenyueduView;

@Service("huibenyueduService")
public class HuibenyueduServiceImpl extends ServiceImpl<HuibenyueduDao, HuibenyueduEntity> implements HuibenyueduService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuibenyueduEntity> page = this.selectPage(
                new Query<HuibenyueduEntity>(params).getPage(),
                new EntityWrapper<HuibenyueduEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuibenyueduEntity> wrapper) {
		  Page<HuibenyueduView> page =new Query<HuibenyueduView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuibenyueduVO> selectListVO(Wrapper<HuibenyueduEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuibenyueduVO selectVO(Wrapper<HuibenyueduEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuibenyueduView> selectListView(Wrapper<HuibenyueduEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuibenyueduView selectView(Wrapper<HuibenyueduEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
