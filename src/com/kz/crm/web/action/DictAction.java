package com.kz.crm.web.action;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.kz.crm.entity.BasDict;
import com.kz.crm.entity.DictDimList;
import com.kz.crm.entity.PageParam;
import com.kz.crm.service.DictBiz;

@Controller
@Scope("prototype")
public class DictAction  {
	@Autowired
	private DictBiz dictBiz;
	
	//分页 上下跳  时会使用的数据
	private   PageParam byPage;

	//分页的初始数据   当前页面与每也显示的条数
	private static final int PAGE_CUSTOMER_INDEX=1;
	private static final int PAGE_CUSTOMER_SIZE=3;
	private List dicByPage ;
	
	private BasDict basDict;
	
	public DictDimList dim;
	
	public String dictDimList(){
		
		System.out.println("vbsvg");
		System.out.println(dim);
		dicByPage = dictBiz.dictDimList(dim);
		return "dictDimList";
	}
	
	public String dictDelete(){
		dictBiz.dictDelete(basDict);
		return "dictDelete";
	}
	public String dictInsert(){
		dictBiz.dictAdd(basDict);
		return "dictInsert";
	}
 	
	public String dictInsertTo(){
		basDict=new BasDict();
		long unboundedLong = new Random().nextLong();
		basDict.setDictId(unboundedLong);
		return "dictInsertTo";
	}
	
	public String dictUpdate(){
		dictBiz.dictUpdate(basDict);
		return "dictUpdate";
	}
	//修改时的查询
	public String dictList(){
		basDict= dictBiz.dictList(basDict);
		return "dictList";
	}
	
	
	//分页
	public  String byPageDict(){
		if(byPage==null){
			byPage=new PageParam();
			byPage.setPageIndex(1);
		}
		//设置每页显示的数据
		byPage.setPageSize(PAGE_CUSTOMER_SIZE);
		//设置上下页跳的路径
		byPage.setPageUrl("dictAction_byPageDict");
		//设置一共有多少条数据
		byPage.setCountPlan(dictBiz.countDict());
		//设置一共有多少页
		int max=new Long(byPage.getCountPlan()).intValue();//long转int 
		byPage.setPageMax(((max-1)/byPage.getPageSize())+1);//算出一共有多少页
		dicByPage = dictBiz.DicByPage(byPage);
		return "byPageDict";
	}

	public PageParam getByPage() {
		return byPage;
	}

	public void setByPage(PageParam byPage) {
		this.byPage = byPage;
	}

	public List getDicByPage() {
		return dicByPage;
	}

	public void setDicByPage(List dicByPage) {
		this.dicByPage = dicByPage;
	}


	public BasDict getBasDict() {
		return basDict;
	}


	public void setBasDict(BasDict basDict) {
		this.basDict = basDict;
	}
	public DictDimList getDim() {
		return dim;
	}
	public void setDim(DictDimList dim) {
		this.dim = dim;
	}


	
	
}
