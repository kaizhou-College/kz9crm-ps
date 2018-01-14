package com.kz.crm.service;

import java.util.List;

import com.kz.crm.entity.BasDict;
import com.kz.crm.entity.DictDimList;
import com.kz.crm.entity.PageParam;

public interface DictBiz {
	List  DicByPage(PageParam pageParam);
	Long  countDict();
	BasDict dictList(BasDict basDic);
	void dictUpdate(BasDict basDic);
	void dictAdd(BasDict basDict);
	void dictDelete(BasDict basDict);
	List dictDimList(DictDimList dim);
}
