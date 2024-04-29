package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShangpinxiaofeijiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShangpinxiaofeijiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShangpinxiaofeijiluView;


/**
 * 商品消费记录
 */
public interface ShangpinxiaofeijiluService extends IService<ShangpinxiaofeijiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShangpinxiaofeijiluVO> selectListVO(Wrapper<ShangpinxiaofeijiluEntity> wrapper);
   	
   	ShangpinxiaofeijiluVO selectVO(@Param("ew") Wrapper<ShangpinxiaofeijiluEntity> wrapper);
   	
   	List<ShangpinxiaofeijiluView> selectListView(Wrapper<ShangpinxiaofeijiluEntity> wrapper);
   	
   	ShangpinxiaofeijiluView selectView(@Param("ew") Wrapper<ShangpinxiaofeijiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShangpinxiaofeijiluEntity> wrapper);
   	

}

