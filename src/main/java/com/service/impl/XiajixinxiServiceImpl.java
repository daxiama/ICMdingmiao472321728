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


import com.dao.XiajixinxiDao;
import com.entity.XiajixinxiEntity;
import com.service.XiajixinxiService;
import com.entity.vo.XiajixinxiVO;
import com.entity.view.XiajixinxiView;

@Service("xiajixinxiService")
public class XiajixinxiServiceImpl extends ServiceImpl<XiajixinxiDao, XiajixinxiEntity> implements XiajixinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiajixinxiEntity> page = this.selectPage(
                new Query<XiajixinxiEntity>(params).getPage(),
                new EntityWrapper<XiajixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiajixinxiEntity> wrapper) {
		  Page<XiajixinxiView> page =new Query<XiajixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiajixinxiVO> selectListVO(Wrapper<XiajixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiajixinxiVO selectVO(Wrapper<XiajixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiajixinxiView> selectListView(Wrapper<XiajixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiajixinxiView selectView(Wrapper<XiajixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
