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


import com.dao.HuibenleixingDao;
import com.entity.HuibenleixingEntity;
import com.service.HuibenleixingService;
import com.entity.vo.HuibenleixingVO;
import com.entity.view.HuibenleixingView;

@Service("huibenleixingService")
public class HuibenleixingServiceImpl extends ServiceImpl<HuibenleixingDao, HuibenleixingEntity> implements HuibenleixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuibenleixingEntity> page = this.selectPage(
                new Query<HuibenleixingEntity>(params).getPage(),
                new EntityWrapper<HuibenleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuibenleixingEntity> wrapper) {
		  Page<HuibenleixingView> page =new Query<HuibenleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuibenleixingVO> selectListVO(Wrapper<HuibenleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuibenleixingVO selectVO(Wrapper<HuibenleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuibenleixingView> selectListView(Wrapper<HuibenleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuibenleixingView selectView(Wrapper<HuibenleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
