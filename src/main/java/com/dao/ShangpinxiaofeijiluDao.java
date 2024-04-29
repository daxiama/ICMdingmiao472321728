package com.dao;

import com.entity.ShangpinxiaofeijiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShangpinxiaofeijiluVO;
import com.entity.view.ShangpinxiaofeijiluView;


/**
 * 商品消费记录
 */
public interface ShangpinxiaofeijiluDao extends BaseMapper<ShangpinxiaofeijiluEntity> {
	
	List<ShangpinxiaofeijiluVO> selectListVO(@Param("ew") Wrapper<ShangpinxiaofeijiluEntity> wrapper);
	
	ShangpinxiaofeijiluVO selectVO(@Param("ew") Wrapper<ShangpinxiaofeijiluEntity> wrapper);
	
	List<ShangpinxiaofeijiluView> selectListView(@Param("ew") Wrapper<ShangpinxiaofeijiluEntity> wrapper);

	List<ShangpinxiaofeijiluView> selectListView(Pagination page,@Param("ew") Wrapper<ShangpinxiaofeijiluEntity> wrapper);
	
	ShangpinxiaofeijiluView selectView(@Param("ew") Wrapper<ShangpinxiaofeijiluEntity> wrapper);
	

}
