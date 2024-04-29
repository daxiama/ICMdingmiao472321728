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


import com.dao.ShangjixinxiDao;
import com.entity.ShangjixinxiEntity;
import com.service.ShangjixinxiService;
import com.entity.vo.ShangjixinxiVO;
import com.entity.view.ShangjixinxiView;

@Service("shangjixinxiService")
public class ShangjixinxiServiceImpl extends ServiceImpl<ShangjixinxiDao, ShangjixinxiEntity> implements ShangjixinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShangjixinxiEntity> page = this.selectPage(
                new Query<ShangjixinxiEntity>(params).getPage(),
                new EntityWrapper<ShangjixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShangjixinxiEntity> wrapper) {
		  Page<ShangjixinxiView> page =new Query<ShangjixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShangjixinxiVO> selectListVO(Wrapper<ShangjixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShangjixinxiVO selectVO(Wrapper<ShangjixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShangjixinxiView> selectListView(Wrapper<ShangjixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShangjixinxiView selectView(Wrapper<ShangjixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
