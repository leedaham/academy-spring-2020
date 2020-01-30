package kr.co.member.dao;

import java.util.List;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.co.member.vo.MemberVO;

/*
 * component scan 이 되게 위해 @Repository 설정. 
 */
@Repository
public class MemberDAO {
	
	/*
	 * spring-context에 추가한 mybatis를 주입.   
	 */
	@Inject
	private SqlSessionTemplate mybatis;
	
	/*
	 *  MemberDAO에서 전달 받은것들을 mapper/sql.xml 를 참조하여, DB에 쿼리 전송.
	 */
	public void insertMember(MemberVO vo) {
		mybatis.insert("mapper.sql.INSERT_MEMBER", vo);
	}
	
	public List<MemberVO> selectMembers(){
		return mybatis.selectList("mapper.sql.SELECT_MEMBERS");
	}
	
	public MemberVO selectMember(String uid) {
		return mybatis.selectOne("mapper.sql.SELECT_MEMBER", uid);
	}
	
	public void updateMember(MemberVO vo) {
		mybatis.update("mapper.sql.UPDATE_MEMBER", vo);
	}
	public void deleteMember(String uid) {
		mybatis.delete("mapper.sql.DELETE_MEMBER", uid);
	}
}
