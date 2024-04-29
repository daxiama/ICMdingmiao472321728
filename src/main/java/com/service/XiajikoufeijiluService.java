package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiajikoufeijiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiajikoufeijiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiajikoufeijiluView;


/**
 * 下机扣费记录
 */
public interface XiajikoufeijiluService extends IService<XiajikoufeijiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiajikoufeijiluVO> selectListVO(Wrapper<XiajikoufeijiluEntity> wrapper);
   	
   	XiajikoufeijiluVO selectVO(@Param("ew") Wrapper<XiajikoufeijiluEntity> wrapper);
   	
   	List<XiajikoufeijiluView> selectListView(Wrapper<XiajikoufeijiluEntity> wrapper);
   	
   	XiajikoufeijiluView selectView(@Param("ew") Wrapper<XiajikoufeijiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiajikoufeijiluEntity> wrapper);
   	

}

