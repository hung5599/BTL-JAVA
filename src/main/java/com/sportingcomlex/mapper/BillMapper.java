package com.sportingcomlex.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.sportingcomplex.model.BillModel;

public class BillMapper implements RowMapper<BillModel>{

	@Override
	public BillModel mapRow(ResultSet res) {
		BillModel bill = new BillModel();
		try {
			bill.setId(res.getLong("id"));
			bill.setId_Match(res.getLong("id_match"));
			bill.setDate(res.getDate("date"));
			bill.setTotal(res.getFloat("total"));
			bill.setUserName(res.getString("username"));
			bill.setType(res.getString("type"));
			return bill;
		} catch(SQLException e) {
			return null;
		}
	}
}
