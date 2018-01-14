package com.kz.crm.dao;

import java.util.List;

import com.kz.crm.entity.BasDict;
import com.kz.crm.entity.DictDimList;
import com.kz.crm.entity.PageParam;

public interface DictDao {
	List  DicByPage(PageParam pageParam);
	Long  countDict();
	BasDict dictList(BasDict basDic);
	void dictUpdate(BasDict basDic);
	void dictAdd(BasDict basDict);
	void dictDelete(BasDict basDict);
	List dictDimList(DictDimList dim);
}
