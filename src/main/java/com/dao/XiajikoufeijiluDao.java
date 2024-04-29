package com.dao;

import com.entity.XiajikoufeijiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiajikoufeijiluVO;
import com.entity.view.XiajikoufeijiluView;


/**
 * 下机扣费记录
 */
public interface XiajikoufeijiluDao extends BaseMapper<XiajikoufeijiluEntity> {
	
	List<XiajikoufeijiluVO> selectListVO(@Param("ew") Wrapper<XiajikoufeijiluEntity> wrapper);
	
	XiajikoufeijiluVO selectVO(@Param("ew") Wrapper<XiajikoufeijiluEntity> wrapper);
	
	List<XiajikoufeijiluView> selectListView(@Param("ew") Wrapper<XiajikoufeijiluEntity> wrapper);

	List<XiajikoufeijiluView> selectListView(Pagination page,@Param("ew") Wrapper<XiajikoufeijiluEntity> wrapper);
	
	XiajikoufeijiluView selectView(@Param("ew") Wrapper<XiajikoufeijiluEntity> wrapper);
	

}
