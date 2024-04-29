package com.dao;

import com.entity.XiajixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiajixinxiVO;
import com.entity.view.XiajixinxiView;


/**
 * 下机信息
 */
public interface XiajixinxiDao extends BaseMapper<XiajixinxiEntity> {
	
	List<XiajixinxiVO> selectListVO(@Param("ew") Wrapper<XiajixinxiEntity> wrapper);
	
	XiajixinxiVO selectVO(@Param("ew") Wrapper<XiajixinxiEntity> wrapper);
	
	List<XiajixinxiView> selectListView(@Param("ew") Wrapper<XiajixinxiEntity> wrapper);

	List<XiajixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<XiajixinxiEntity> wrapper);
	
	XiajixinxiView selectView(@Param("ew") Wrapper<XiajixinxiEntity> wrapper);
	

}
