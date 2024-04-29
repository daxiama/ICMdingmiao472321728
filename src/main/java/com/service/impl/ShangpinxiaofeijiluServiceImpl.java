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


import com.dao.ShangpinxiaofeijiluDao;
import com.entity.ShangpinxiaofeijiluEntity;
import com.service.ShangpinxiaofeijiluService;
import com.entity.vo.ShangpinxiaofeijiluVO;
import com.entity.view.ShangpinxiaofeijiluView;

@Service("shangpinxiaofeijiluService")
public class ShangpinxiaofeijiluServiceImpl extends ServiceImpl<ShangpinxiaofeijiluDao, ShangpinxiaofeijiluEntity> implements ShangpinxiaofeijiluService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShangpinxiaofeijiluEntity> page = this.selectPage(
                new Query<ShangpinxiaofeijiluEntity>(params).getPage(),
                new EntityWrapper<ShangpinxiaofeijiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShangpinxiaofeijiluEntity> wrapper) {
		  Page<ShangpinxiaofeijiluView> page =new Query<ShangpinxiaofeijiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShangpinxiaofeijiluVO> selectListVO(Wrapper<ShangpinxiaofeijiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShangpinxiaofeijiluVO selectVO(Wrapper<ShangpinxiaofeijiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShangpinxiaofeijiluView> selectListView(Wrapper<ShangpinxiaofeijiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShangpinxiaofeijiluView selectView(Wrapper<ShangpinxiaofeijiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
