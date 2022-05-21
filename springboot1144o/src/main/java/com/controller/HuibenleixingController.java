package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.HuibenleixingEntity;
import com.entity.view.HuibenleixingView;

import com.service.HuibenleixingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 绘本类型
 * 后端接口
 * @author 
 * @email 
 * @date 2022-04-09 17:58:47
 */
@RestController
@RequestMapping("/huibenleixing")
public class HuibenleixingController {
    @Autowired
    private HuibenleixingService huibenleixingService;


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,HuibenleixingEntity huibenleixing,
		HttpServletRequest request){
        EntityWrapper<HuibenleixingEntity> ew = new EntityWrapper<HuibenleixingEntity>();
		PageUtils page = huibenleixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, huibenleixing), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,HuibenleixingEntity huibenleixing, 
		HttpServletRequest request){
        EntityWrapper<HuibenleixingEntity> ew = new EntityWrapper<HuibenleixingEntity>();
		PageUtils page = huibenleixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, huibenleixing), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( HuibenleixingEntity huibenleixing){
       	EntityWrapper<HuibenleixingEntity> ew = new EntityWrapper<HuibenleixingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( huibenleixing, "huibenleixing")); 
        return R.ok().put("data", huibenleixingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(HuibenleixingEntity huibenleixing){
        EntityWrapper< HuibenleixingEntity> ew = new EntityWrapper< HuibenleixingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( huibenleixing, "huibenleixing")); 
		HuibenleixingView huibenleixingView =  huibenleixingService.selectView(ew);
		return R.ok("查询绘本类型成功").put("data", huibenleixingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        HuibenleixingEntity huibenleixing = huibenleixingService.selectById(id);
        return R.ok().put("data", huibenleixing);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        HuibenleixingEntity huibenleixing = huibenleixingService.selectById(id);
        return R.ok().put("data", huibenleixing);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody HuibenleixingEntity huibenleixing, HttpServletRequest request){
    	huibenleixing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(huibenleixing);
        huibenleixingService.insert(huibenleixing);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody HuibenleixingEntity huibenleixing, HttpServletRequest request){
    	huibenleixing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(huibenleixing);
        huibenleixingService.insert(huibenleixing);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody HuibenleixingEntity huibenleixing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(huibenleixing);
        huibenleixingService.updateById(huibenleixing);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        huibenleixingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }


}
