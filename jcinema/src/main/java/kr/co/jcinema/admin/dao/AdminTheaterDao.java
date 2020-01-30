package kr.co.jcinema.admin.dao;

import java.util.List;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.co.jcinema.admin.vo.AdminTheaterVo;

@Repository
public class AdminTheaterDao {
	
	@Inject
	private SqlSessionTemplate mybatis;
	
	public void insertTheater() {}
	public AdminTheaterVo selectTheater() {
		
		return null;
	}
	public List<AdminTheaterVo> selectTheaters() {
		return null;
	}
	
	public void updateTheater() {}
	public void deleteTheater() {}
}
