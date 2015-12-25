/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.dc.smarteam.modules.interfacelist.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dc.smarteam.common.persistence.Page;
import com.dc.smarteam.common.service.CrudService;
import com.dc.smarteam.modules.interfacelist.entity.EamInterface;
import com.dc.smarteam.modules.interfacelist.dao.EamInterfaceDao;

/**
 * 接口清单Service
 * @author zhanghaor
 * @version 2015-12-24
 */
@Service
@Transactional(readOnly = true)
public class EamInterfaceService extends CrudService<EamInterfaceDao, EamInterface> {

	public EamInterface get(String id) {
		return super.get(id);
	}
	
	public List<EamInterface> findList(EamInterface eamInterface) {
		return super.findList(eamInterface);
	}
	
	public Page<EamInterface> findPage(Page<EamInterface> page, EamInterface eamInterface) {
		return super.findPage(page, eamInterface);
	}
	
	@Transactional(readOnly = false)
	public void save(EamInterface eamInterface) {
		super.save(eamInterface);
	}
	
	@Transactional(readOnly = false)
	public void delete(EamInterface eamInterface) {
		super.delete(eamInterface);
	}
	
}