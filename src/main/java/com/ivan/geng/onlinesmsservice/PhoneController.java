package com.ivan.geng.onlinesmsservice;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@ComponentScan(basePackages={"com.ivan.geng"})
@RestController
public class PhoneController {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@RequestMapping("/phones")
	public List<PhoneInfo> phones() {
		List<PhoneInfo> phones = jdbcTemplate.query("SELECT * FROM phone_info", new RowMapper<PhoneInfo>() {

			@Override
			public PhoneInfo mapRow(ResultSet rs, int rowNum) throws SQLException {
				PhoneInfo phone = new PhoneInfo();
				phone.setId(rs.getString(1));
				phone.setCountry(rs.getString(2));
				phone.setPhoneNumber(rs.getString(3));
				phone.setAddedTime(rs.getString(4));
				phone.setDetailUrl(rs.getString(5));
				return phone;
			}
			
		});
		return phones;
	}
}