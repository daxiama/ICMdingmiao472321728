package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiajixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiajixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiajixinxiView;


/**
 * 下机信息
 */
public interface XiajixinxiService extends IService<XiajixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiajixinxiVO> selectListVO(Wrapper<XiajixinxiEntity> wrapper);
   	
   	XiajixinxiVO selectVO(@Param("ew") Wrapper<XiajixinxiEntity> wrapper);
   	
   	List<XiajixinxiView> selectListView(Wrapper<XiajixinxiEntity> wrapper);
   	
   	XiajixinxiView selectView(@Param("ew") Wrapper<XiajixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiajixinxiEntity> wrapper);
   	

}

