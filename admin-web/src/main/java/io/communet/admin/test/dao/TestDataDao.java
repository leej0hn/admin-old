package io.communet.admin.test.dao;

import io.communet.admin.common.persistence.CrudDao;
import io.communet.admin.common.persistence.annotation.MyBatisDao;
import io.communet.admin.test.entity.TestData;

/**
 * 单表生成DAO接口
 * @author ThinkGem
 * @version 2015-04-06
 */
@MyBatisDao
public interface TestDataDao extends CrudDao<TestData> {
	
}