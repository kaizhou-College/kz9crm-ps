package com.kz.crm.dao;

import java.util.List;

import com.kz.crm.entity.PlanDimList;
import com.kz.crm.entity.SalChance;
import com.kz.crm.entity.SalPlan;

public interface PlanDao {
	List byPage(int page,int pageSize);
	Long countPlan();
	List byPageDim(PlanDimList pdl,int page,int pageSize );
	Long countPlanList(PlanDimList pdl);
	SalChance planList(Long id);
	void planUpdate(SalPlan salPlan);
	void planDelete(SalPlan salPlan);
	int planinsert(SalPlan salplan);
}
