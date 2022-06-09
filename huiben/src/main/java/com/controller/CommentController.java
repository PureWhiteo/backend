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

import com.entity.DiscusshuibenyueduEntity;
import com.entity.view.DiscusshuibenyueduView;

import com.service.DiscusshuibenyueduService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

import java.io.IOException;

/**
 * 绘本阅读评论表
 * 后端接口
 *
 * @author
 * @email
 * @date 2022-04-09 17:58:47
 */
@RestController
@RequestMapping("/discusshuibenyuedu")
public class CommentController {
    @Autowired
    private DiscusshuibenyueduService discusshuibenyueduService;

    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, DiscusshuibenyueduEntity discusshuibenyuedu,
                  HttpServletRequest request) {
        EntityWrapper<DiscusshuibenyueduEntity> ew = new EntityWrapper<DiscusshuibenyueduEntity>();
        PageUtils page = discusshuibenyueduService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusshuibenyuedu), params), params));

        return R.ok().put("data", page);
    }

    /**
     * 前端列表
     */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, DiscusshuibenyueduEntity discusshuibenyuedu,
                  HttpServletRequest request) {
        EntityWrapper<DiscusshuibenyueduEntity> ew = new EntityWrapper<DiscusshuibenyueduEntity>();
        PageUtils page = discusshuibenyueduService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discusshuibenyuedu), params), params));
        return R.ok().put("data", page);
    }

    /**
     * 列表
     */
    @RequestMapping("/lists")
    public R list(DiscusshuibenyueduEntity discusshuibenyuedu) {
        EntityWrapper<DiscusshuibenyueduEntity> ew = new EntityWrapper<DiscusshuibenyueduEntity>();
        ew.allEq(MPUtil.allEQMapPre(discusshuibenyuedu, "discusshuibenyuedu"));
        return R.ok().put("data", discusshuibenyueduService.selectListView(ew));
    }

    /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscusshuibenyueduEntity discusshuibenyuedu) {
        EntityWrapper<DiscusshuibenyueduEntity> ew = new EntityWrapper<DiscusshuibenyueduEntity>();
        ew.allEq(MPUtil.allEQMapPre(discusshuibenyuedu, "discusshuibenyuedu"));
        DiscusshuibenyueduView discusshuibenyueduView = discusshuibenyueduService.selectView(ew);
        return R.ok("查询绘本阅读评论表成功").put("data", discusshuibenyueduView);
    }

    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        DiscusshuibenyueduEntity discusshuibenyuedu = discusshuibenyueduService.selectById(id);
        return R.ok().put("data", discusshuibenyuedu);
    }

    /**
     * 前端详情
     */
    @IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id) {
        DiscusshuibenyueduEntity discusshuibenyuedu = discusshuibenyueduService.selectById(id);
        return R.ok().put("data", discusshuibenyuedu);
    }


    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscusshuibenyueduEntity discusshuibenyuedu, HttpServletRequest request) {
        discusshuibenyuedu.setId(new Date().getTime() + new Double(Math.floor(Math.random() * 1000)).longValue());
        //ValidatorUtils.validateEntity(discusshuibenyuedu);
        discusshuibenyueduService.insert(discusshuibenyuedu);
        return R.ok();
    }

    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscusshuibenyueduEntity discusshuibenyuedu, HttpServletRequest request) {
        discusshuibenyuedu.setId(new Date().getTime() + new Double(Math.floor(Math.random() * 1000)).longValue());
        //ValidatorUtils.validateEntity(discusshuibenyuedu);
        discusshuibenyueduService.insert(discusshuibenyuedu);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody DiscusshuibenyueduEntity discusshuibenyuedu, HttpServletRequest request) {
        //ValidatorUtils.validateEntity(discusshuibenyuedu);
        discusshuibenyueduService.updateById(discusshuibenyuedu);//全部更新
        return R.ok();
    }


    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        discusshuibenyueduService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }


}
