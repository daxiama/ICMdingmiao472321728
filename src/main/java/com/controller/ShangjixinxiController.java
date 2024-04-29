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

import com.entity.ShangjixinxiEntity;
import com.entity.view.ShangjixinxiView;

import com.service.ShangjixinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 上机信息
 * 后端接口
 */
@RestController
@RequestMapping("/shangjixinxi")
public class ShangjixinxiController {
    @Autowired
    private ShangjixinxiService shangjixinxiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShangjixinxiEntity shangjixinxi, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date shangjishijianstart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date shangjishijianend,
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			shangjixinxi.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ShangjixinxiEntity> ew = new EntityWrapper<ShangjixinxiEntity>();
                if(shangjishijianstart!=null) ew.ge("shangjishijian", shangjishijianstart);
                if(shangjishijianend!=null) ew.le("shangjishijian", shangjishijianend);
    	PageUtils page = shangjixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shangjixinxi), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShangjixinxiEntity shangjixinxi, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date shangjishijianstart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date shangjishijianend,
		HttpServletRequest request){
        EntityWrapper<ShangjixinxiEntity> ew = new EntityWrapper<ShangjixinxiEntity>();
                if(shangjishijianstart!=null) ew.ge("shangjishijian", shangjishijianstart);
                if(shangjishijianend!=null) ew.le("shangjishijian", shangjishijianend);
    	PageUtils page = shangjixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shangjixinxi), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShangjixinxiEntity shangjixinxi){
       	EntityWrapper<ShangjixinxiEntity> ew = new EntityWrapper<ShangjixinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shangjixinxi, "shangjixinxi")); 
        return R.ok().put("data", shangjixinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShangjixinxiEntity shangjixinxi){
        EntityWrapper< ShangjixinxiEntity> ew = new EntityWrapper< ShangjixinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shangjixinxi, "shangjixinxi")); 
		ShangjixinxiView shangjixinxiView =  shangjixinxiService.selectView(ew);
		return R.ok("查询上机信息成功").put("data", shangjixinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShangjixinxiEntity shangjixinxi = shangjixinxiService.selectById(id);
        return R.ok().put("data", shangjixinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShangjixinxiEntity shangjixinxi = shangjixinxiService.selectById(id);
        return R.ok().put("data", shangjixinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShangjixinxiEntity shangjixinxi, HttpServletRequest request){
    	shangjixinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shangjixinxi);

        shangjixinxiService.insert(shangjixinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShangjixinxiEntity shangjixinxi, HttpServletRequest request){
    	shangjixinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shangjixinxi);

        shangjixinxiService.insert(shangjixinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ShangjixinxiEntity shangjixinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shangjixinxi);
        shangjixinxiService.updateById(shangjixinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shangjixinxiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<ShangjixinxiEntity> wrapper = new EntityWrapper<ShangjixinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuzhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = shangjixinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	





}
