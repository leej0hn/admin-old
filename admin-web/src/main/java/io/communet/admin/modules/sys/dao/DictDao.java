/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package io.communet.admin.modules.sys.dao;

import java.util.List;

import io.communet.admin.common.persistence.CrudDao;
import io.communet.admin.modules.sys.entity.Dict;
import io.communet.admin.common.persistence.annotation.MyBatisDao;

/**
 * 字典DAO接口
 * @author ThinkGem
 * @version 2014-05-16
 */
@MyBatisDao
public interface DictDao extends CrudDao<Dict> {

	public List<String> findTypeList(Dict dict);
	
}
