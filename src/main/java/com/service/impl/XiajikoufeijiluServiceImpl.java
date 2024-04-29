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


import com.dao.XiajikoufeijiluDao;
import com.entity.XiajikoufeijiluEntity;
import com.service.XiajikoufeijiluService;
import com.entity.vo.XiajikoufeijiluVO;
import com.entity.view.XiajikoufeijiluView;

@Service("xiajikoufeijiluService")
public class XiajikoufeijiluServiceImpl extends ServiceImpl<XiajikoufeijiluDao, XiajikoufeijiluEntity> implements XiajikoufeijiluService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiajikoufeijiluEntity> page = this.selectPage(
                new Query<XiajikoufeijiluEntity>(params).getPage(),
                new EntityWrapper<XiajikoufeijiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiajikoufeijiluEntity> wrapper) {
		  Page<XiajikoufeijiluView> page =new Query<XiajikoufeijiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiajikoufeijiluVO> selectListVO(Wrapper<XiajikoufeijiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiajikoufeijiluVO selectVO(Wrapper<XiajikoufeijiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiajikoufeijiluView> selectListView(Wrapper<XiajikoufeijiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiajikoufeijiluView selectView(Wrapper<XiajikoufeijiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
