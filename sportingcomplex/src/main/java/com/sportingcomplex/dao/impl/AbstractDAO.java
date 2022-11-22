package com.sportingcomplex.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.ObjectUtils.Null;

import com.sportingcomlex.mapper.RowMapper;
import com.sportingcomplex.dao.GenericDAO;

public class AbstractDAO<T> implements GenericDAO<T> {

	// load driver của sql server để kết nối csdl
	// mở kết nối tới csdl
	protected Connection getConnection() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String url = "jdbc:sqlserver://localhost;database = project_java_sporting_complex";
			String user = "project";
			String password = "1234";
			return DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException e) {
			return null;
		}
	}
	
	// set parameter truyền vào các câu lệnh sql
	private void setParameter(PreparedStatement statement, Object...parameters) {
		try {
			for(int i = 0; i < parameters.length; i++) {
				Object parameter = parameters[i];
				int index = i + 1;
				if(parameter instanceof Long) {
					statement.setLong(index, (Long)parameter);
				}
				else if(parameter instanceof String) {
					statement.setString(index, (String)parameter);
				}
				else if(parameter instanceof Integer) {
					statement.setInt(index, (Integer)parameter);
				}
				else if(parameter instanceof Float) {
					statement.setFloat(index, (Float)parameter);
				}
				else if(parameter instanceof Boolean) {
					statement.setBoolean(index, (Boolean)parameter);
				} 
				else if(parameter instanceof Date) {
					statement.setDate(index, (Date)parameter);
				}
				else if(parameter instanceof Null) {
					statement.setNull(index, java.sql.Types.NULL);
				}
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public <T> List<T> query(String sql, RowMapper<T> row, Object... parameters) {
		 List<T> results = new ArrayList<>();
		 PreparedStatement statement = null;
		 Connection connection = getConnection();
		 ResultSet resultset = null;
		 
		 if(connection != null) {
			 try {
				 statement = connection.prepareStatement(sql);
				 setParameter(statement, parameters);
				 resultset = statement.executeQuery();
				 while(resultset.next()) {
					 results.add(row.mapRow(resultset));
				 }
				 return results;
			 } catch(SQLException e) {
				 return null;
			 } finally {
				 	try {
						if(resultset != null) {
							resultset.close();
						}
						if(connection != null) {
							connection.close();
						}
						if(statement != null) {
							statement.close();
						}
					} catch (SQLException e) {
						return null;
					}
			 }
		 }
	return null;
	}

	@Override
	public Long insert(String sql, Object... parameters) {
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		Long id = null;
		try {
			connection = getConnection();
			connection.setAutoCommit(false);
			statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			setParameter(statement, parameters);
			statement.executeUpdate();
			resultSet = statement.getGeneratedKeys();
			if(resultSet.next()) {
				id = resultSet.getLong(1);
			}
			connection.commit();
			return id;
		} catch(SQLException e) {
			try {
				connection.rollback();
			} catch(SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			try {
				if(connection != null) {
					connection.close();
				}
				if(statement != null) {
					statement.close();
				}
				if(resultSet != null) {
					resultSet.close();
				}
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public void update(String sql, Object... parameters) {
		Connection connection = null;
		PreparedStatement statement = null;
		try {
			connection = getConnection();
			statement = connection.prepareStatement(sql);
			connection.setAutoCommit(false);
			setParameter(statement, parameters);
			statement.executeUpdate();
			connection.commit();
		} catch(SQLException e) {
			try {
				connection.rollback();
			} catch(SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			try {
				if(connection != null) {
					connection.close();
				}
				
				if(statement != null) {
					statement.close();
				}
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public Long search(String sql, Object... parameters) {
		Long id = null;
		PreparedStatement statement = null;
		Connection connection = null;
		ResultSet res = null;
		try {
			connection = getConnection();
			statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			setParameter(statement, parameters);
			res = statement.executeQuery();
			if(res != null) {
				id = res.getLong(1);
			}
			return id;
		} catch(SQLException e) {
			return null;
		} finally {
			try {
				if(connection != null) {
					connection.close();
				}
				if(statement != null) {
					statement.close();
				}
				if(res != null) {
					res.close();
				}
			} catch(SQLException e2) {
				return null;
			}
		}
	}
}