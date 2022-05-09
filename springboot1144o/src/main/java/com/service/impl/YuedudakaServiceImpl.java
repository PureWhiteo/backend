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


import com.dao.YuedudakaDao;
import com.entity.YuedudakaEntity;
import com.service.YuedudakaService;
import com.entity.vo.YuedudakaVO;
import com.entity.view.YuedudakaView;

@Service("yuedudakaService")
public class YuedudakaServiceImpl extends ServiceImpl<YuedudakaDao, YuedudakaEntity> implements YuedudakaService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuedudakaEntity> page = this.selectPage(
                new Query<YuedudakaEntity>(params).getPage(),
                new EntityWrapper<YuedudakaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuedudakaEntity> wrapper) {
		  Page<YuedudakaView> page =new Query<YuedudakaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuedudakaVO> selectListVO(Wrapper<YuedudakaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuedudakaVO selectVO(Wrapper<YuedudakaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuedudakaView> selectListView(Wrapper<YuedudakaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuedudakaView selectView(Wrapper<YuedudakaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
