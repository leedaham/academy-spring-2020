package kr.co.ch06;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {

	@Autowired
	private JdbcTemplate jdbc;
	
	
	public void insertUser() {
		
		String sql = "INSERT INTO `USER3` VALUES (?, ?, ?, ?)";
		Object[] values = {"S101", "호우길동", "010-1212-0099", 40};
		
		jdbc.update(sql, values);
	}
	
	public UserVO selectUser(String uid) {
		
		String sql = "SELECT * FROM `USER3` WHERE `uid`=?";
		UserVO user = jdbc.queryForObject(sql, new UserRowMapper(), uid);
		
		return user;
	}
	
	public List<UserVO> selectUsers() {
		String sql = "SELECT * FROM `USER3`";
		List<UserVO> user = jdbc.query(sql, new UserRowMapper());
		
		return user;
	}
	
	public List<MemberVO> selectMembers() {
		String sql = "SELECT * FROM `MEMBER`";
		
		List<MemberVO> members = jdbc.query(sql, new MemberRowMapper());
		
		return members;
	}
	public List<Map<String, Object>> selectMembersMap() {
		String sql = "SELECT * FROM `MEMBER`";
		
		List<Map<String, Object>> members = jdbc.queryForList(sql);
		
		return members;
	}
	
	public void updateUser() {
		
		String sql = "UPDATE `USER3` SET `name` = ?  WHERE `uid`=?";
		Object[] values = {"ldh", "S101"};
		
		jdbc.update(sql, values);
	}
	
	public void deleteUser() {
		jdbc.update("DELETE FROM `USER3` WHERE `uid`=?", "S101");
	}
}
