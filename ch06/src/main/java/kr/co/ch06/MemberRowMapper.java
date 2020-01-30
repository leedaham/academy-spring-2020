package kr.co.ch06;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MemberRowMapper implements RowMapper<MemberVO>{

	@Override
	public MemberVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		MemberVO mvo = new MemberVO();
		mvo.setUid(rs.getString(1));
		mvo.setName(rs.getString(2));
		mvo.setHp(rs.getString(3));
		mvo.setPos(rs.getString(4));
		mvo.setDep(rs.getInt(5));
		mvo.setRdate(rs.getString(6));
		
		return mvo;
	}

}
