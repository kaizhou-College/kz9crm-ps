package com.kz.crm.web.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.kz.crm.entity.SalChance;
import com.kz.crm.service.ChanceBiz;
import com.opensymphony.xwork2.ActionSupport;

@Controller
@Scope("prototype")
public class SalChangeAction extends ActionSupport {
	private SalChance chance;
	private List list;
	@Autowired
	private ChanceBiz cb;
	
	private Integer chcId;

	// ��ѯ
	public String query() {
		System.out.println("�����ѯ");
		list = cb.query();
		System.out.println(list);
		return "query_success";
	}

	// �½�
	public String insert() {
		System.out.println("��������");
		System.out.println("进入添加action");
		System.out.println(chance);
		System.out.println(chance.getChcCustName());
		int res = cb.save(chance);
		if (res > 1) {
			System.out.println("�ɹ�");
			return "add_success";
		} else {
			System.out.println("�ɹ�2323");
			return "add_filed";
		}
	}

	// ���ID�����
	public String toupdate() {
		return "toupdate";
	}

	public SalChance getChance() {
		return chance;
	}

	public void setChance(SalChance chance) {
		this.chance = chance;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	public Integer getChcId() {
		return chcId;
	}

	public void setChcId(Integer chcId) {
		this.chcId = chcId;
	}

}
