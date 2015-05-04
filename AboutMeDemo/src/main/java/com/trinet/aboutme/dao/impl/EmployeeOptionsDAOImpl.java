package com.trinet.aboutme.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.trinet.aboutme.beans.Address;
import com.trinet.aboutme.dao.EmployeeOptionsDAO;
import com.trinet.aboutme.dtos.EmployeeOptionsDTO;

public class EmployeeOptionsDAOImpl extends HibernateDaoSupport implements
EmployeeOptionsDAO {

	private DetachedCriteria criteria = DetachedCriteria
			.forClass(Address.class);

	public DetachedCriteria getCriteria() {
		return criteria;
	}

	public void setCriteria(DetachedCriteria criteria) {
		this.criteria = criteria;
	}

	@Override
	public List<EmployeeOptionsDTO> updateEmployeeOptions(EmployeeOptionsDTO employeeOptionsDTO) {
		employeeOptionsDTO.getEmailOption();
		getCriteria().add(Restrictions.eq("emailOption", employeeOptionsDTO.getEmailOption()));
		getCriteria().add(Restrictions.eq("OtherNotices", employeeOptionsDTO.getOtherNotices()));
		getCriteria().add(Restrictions.eq("W2Option", employeeOptionsDTO.getW2Option()));
		getCriteria().add(Restrictions.eq("WorkflowNotifications", employeeOptionsDTO.getWorkflowNotifications()));
		
		List<EmployeeOptionsDTO> findByCriteria = (List<EmployeeOptionsDTO>)getHibernateTemplate().findByCriteria(criteria);
		return findByCriteria;
		
	}

}
