
package com.sportingcomplex.dao;

import java.sql.Date;

import com.sportingcomplex.model.BillModel;

public interface IBillDAO extends GenericDAO<BillModel>{
	Long save(Long id_match, Date date, Float total, String userName, String type);
	void delete(Long id_match);
	BillModel findOneByIdMatch(Long idMatch);
	BillModel findOneById(Long id);
}