/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package io.communet.admin.modules.gen.dao;

import io.communet.admin.modules.gen.entity.GenTemplate;
import io.communet.admin.common.persistence.CrudDao;
import io.communet.admin.common.persistence.annotation.MyBatisDao;

/**
 * 代码模板DAO接口
 * @author ThinkGem
 * @version 2013-10-15
 */
@MyBatisDao
public interface GenTemplateDao extends CrudDao<GenTemplate> {
	
}
