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

import com.entity.HuibenyueduEntity;
import com.entity.view.HuibenyueduView;

import com.service.HuibenyueduService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 绘本阅读
 * 后端接口
 * @author 
 * @email 
 * @date 2022-04-09 17:58:47
 */
@RestController
@RequestMapping("/huibenyuedu")
public class HuibenyueduController {
    @Autowired
    private HuibenyueduService huibenyueduService;

    @Autowired
    private StoreupService storeupService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,HuibenyueduEntity huibenyuedu,
		HttpServletRequest request){
        EntityWrapper<HuibenyueduEntity> ew = new EntityWrapper<HuibenyueduEntity>();
		PageUtils page = huibenyueduService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, huibenyuedu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,HuibenyueduEntity huibenyuedu, 
		HttpServletRequest request){
        EntityWrapper<HuibenyueduEntity> ew = new EntityWrapper<HuibenyueduEntity>();
		PageUtils page = huibenyueduService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, huibenyuedu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( HuibenyueduEntity huibenyuedu){
       	EntityWrapper<HuibenyueduEntity> ew = new EntityWrapper<HuibenyueduEntity>();
      	ew.allEq(MPUtil.allEQMapPre( huibenyuedu, "huibenyuedu")); 
        return R.ok().put("data", huibenyueduService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(HuibenyueduEntity huibenyuedu){
        EntityWrapper< HuibenyueduEntity> ew = new EntityWrapper< HuibenyueduEntity>();
 		ew.allEq(MPUtil.allEQMapPre( huibenyuedu, "huibenyuedu")); 
		HuibenyueduView huibenyueduView =  huibenyueduService.selectView(ew);
		return R.ok("查询绘本阅读成功").put("data", huibenyueduView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        HuibenyueduEntity huibenyuedu = huibenyueduService.selectById(id);
        return R.ok().put("data", huibenyuedu);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        HuibenyueduEntity huibenyuedu = huibenyueduService.selectById(id);
        return R.ok().put("data", huibenyuedu);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R vote(@PathVariable("id") String id,String type){
        HuibenyueduEntity huibenyuedu = huibenyueduService.selectById(id);
        if(type.equals("1")) {
        	huibenyuedu.setThumbsupnum(huibenyuedu.getThumbsupnum()+1);
        } else {
        	huibenyuedu.setCrazilynum(huibenyuedu.getCrazilynum()+1);
        }
        huibenyueduService.updateById(huibenyuedu);
        return R.ok("投票成功");
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody HuibenyueduEntity huibenyuedu, HttpServletRequest request){
    	huibenyuedu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(huibenyuedu);
        huibenyueduService.insert(huibenyuedu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody HuibenyueduEntity huibenyuedu, HttpServletRequest request){
    	huibenyuedu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(huibenyuedu);
        huibenyueduService.insert(huibenyuedu);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody HuibenyueduEntity huibenyuedu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(huibenyuedu);
        huibenyueduService.updateById(huibenyuedu);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        huibenyueduService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<HuibenyueduEntity> wrapper = new EntityWrapper<HuibenyueduEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = huibenyueduService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
