package com.ecommerce.spring_jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.swing.tree.RowMapper;

import org.springframework.jdbc.core.JdbcTemplate;

import com.ecommerce.spring_jdbc.entity.EProductEntity;

public class EProductDAO {
	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public List<EProductEntity> getProducts() {
		return template.query("select * from eproduct", new RowMapper<EProductEntity>() {
			public EProductEntity mapRow(ResultSet rs, int row) throws SQLException {
				EProductEntity e = new EProductEntity();
				e.setID(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setPrice(rs.getBigDecimal(3));
				e.setDateAdded(rs.getDate(4));
				return e;
			}
		});
	}

}