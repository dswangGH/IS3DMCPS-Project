/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.twms.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.twms.entity.WmsPrdInDetl;
import com.jeesite.modules.twms.dao.WmsPrdInDetlDao;

/**
 * wms_prd_in_detlService
 * @author xx
 * @version 2019-05-14
 */
@Service
@Transactional(readOnly=true)
public class WmsPrdInDetlService extends CrudService<WmsPrdInDetlDao, WmsPrdInDetl> {
	
	/**
	 * 获取单条数据
	 * @param wmsPrdInDetl
	 * @return
	 */
	@Override
	public WmsPrdInDetl get(WmsPrdInDetl wmsPrdInDetl) {
		return super.get(wmsPrdInDetl);
	}
	
	/**
	 * 查询分页数据
	 * @param page 分页对象
	 * @param wmsPrdInDetl
	 * @return
	 */
	@Override
	public Page<WmsPrdInDetl> findPage(Page<WmsPrdInDetl> page, WmsPrdInDetl wmsPrdInDetl) {
		return super.findPage(page, wmsPrdInDetl);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param wmsPrdInDetl
	 */
	@Override
	@Transactional(readOnly=false)
	public void save(WmsPrdInDetl wmsPrdInDetl) {
		super.save(wmsPrdInDetl);
	}
	
	/**
	 * 更新状态
	 * @param wmsPrdInDetl
	 */
	@Override
	@Transactional(readOnly=false)
	public void updateStatus(WmsPrdInDetl wmsPrdInDetl) {
		super.updateStatus(wmsPrdInDetl);
	}
	
	/**
	 * 删除数据
	 * @param wmsPrdInDetl
	 */
	@Override
	@Transactional(readOnly=false)
	public void delete(WmsPrdInDetl wmsPrdInDetl) {
		super.delete(wmsPrdInDetl);
	}
	
	/**
	 * 根据wo_no,batch_no获取工单详情
	 */
	public WmsPrdInDetl getDetailByWB(@Param("woNo")String woNo,@Param("batchNo")String batchNo){
		return this.dao.getDetailByWB(woNo, batchNo);
	}
	
	/**
	 * 根据batch_no获取工单详情
	 */
	public List<WmsPrdInDetl> getDetailByBatchNo(String batchNo){
		return this.dao.getDetailByBatchNo(batchNo);
	}
}