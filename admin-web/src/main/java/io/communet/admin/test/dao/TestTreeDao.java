package io.communet.admin.test.dao;

import io.communet.admin.common.persistence.TreeDao;
import io.communet.admin.common.persistence.annotation.MyBatisDao;
import io.communet.admin.test.entity.TestTree;

/**
 * 树结构生成DAO接口
 * @author ThinkGem
 * @version 2015-04-06
 */
@MyBatisDao
public interface TestTreeDao extends TreeDao<TestTree> {
	
}