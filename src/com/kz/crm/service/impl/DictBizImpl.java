package com.kz.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kz.crm.dao.DictDao;
import com.kz.crm.entity.BasDict;
import com.kz.crm.entity.DictDimList;
import com.kz.crm.entity.PageParam;
import com.kz.crm.service.DictBiz;
@Service
public class DictBizImpl  implements DictBiz{
	@Autowired 
	private DictDao dictDao;

	public List DicByPage(PageParam pageParam) {
		return dictDao.DicByPage(pageParam);
	}

	public Long countDict() {
		return dictDao.countDict();
	}

	public BasDict dictList(BasDict basDic) {
		return dictDao.dictList(basDic);
	}

	public void dictUpdate(BasDict basDic) {
		dictDao.dictUpdate(basDic);
	}

	public void dictAdd(BasDict basDict) {
		if(basDict.getDictIsEditable()==null){
			basDict.setDictIsEditable(0);
		}
		dictDao.dictAdd(basDict);
	}

	public void dictDelete(BasDict basDict) {
		dictDao.dictDelete(basDict);
	}

	public List dictDimList(DictDimList dim) {
		List list = dictDao.dictDimList(dim);
		return list;
	}
	
}
