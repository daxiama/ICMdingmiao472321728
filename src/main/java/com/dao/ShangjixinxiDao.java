package com.dao;

import com.entity.ShangjixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShangjixinxiVO;
import com.entity.view.ShangjixinxiView;


/**
 * 上机信息
 */
public interface ShangjixinxiDao extends BaseMapper<ShangjixinxiEntity> {
	
	List<ShangjixinxiVO> selectListVO(@Param("ew") Wrapper<ShangjixinxiEntity> wrapper);
	
	ShangjixinxiVO selectVO(@Param("ew") Wrapper<ShangjixinxiEntity> wrapper);
	
	List<ShangjixinxiView> selectListView(@Param("ew") Wrapper<ShangjixinxiEntity> wrapper);

	List<ShangjixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ShangjixinxiEntity> wrapper);
	
	ShangjixinxiView selectView(@Param("ew") Wrapper<ShangjixinxiEntity> wrapper);
	

}
