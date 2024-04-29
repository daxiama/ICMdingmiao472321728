package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShangjixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShangjixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShangjixinxiView;


/**
 * 上机信息
 */
public interface ShangjixinxiService extends IService<ShangjixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShangjixinxiVO> selectListVO(Wrapper<ShangjixinxiEntity> wrapper);
   	
   	ShangjixinxiVO selectVO(@Param("ew") Wrapper<ShangjixinxiEntity> wrapper);
   	
   	List<ShangjixinxiView> selectListView(Wrapper<ShangjixinxiEntity> wrapper);
   	
   	ShangjixinxiView selectView(@Param("ew") Wrapper<ShangjixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShangjixinxiEntity> wrapper);
   	

}

