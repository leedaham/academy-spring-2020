package kr.co.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.member.dao.MemberDAO;
import kr.co.member.vo.MemberVO;

/*
 * component scan 이 되게 위해 @Service 설정. 
 */
@Service
public class MemberService {
	
	/*
	 * MemberDAO를 @Autowired component로 주입.   
	 */
	@Autowired
	private MemberDAO dao;
	
	/*
	 * MemberController에서 전달받은 것들을 MemberDAO로 전달.
	 * insert, update, delete를 실행할 것들은 void형태로 리턴값 없이 삽입, 수정, 삭제.
	 * select는 리턴값을 가짐.  
	 */
	public void insertMember(MemberVO vo) {
		dao.insertMember(vo);
	}
	
	public List<MemberVO> selectMembers(){
		return dao.selectMembers();
	}

	public MemberVO selectMember(String uid) {
		return dao.selectMember(uid);
	}
	
	public void updateMember(MemberVO vo) {
		dao.updateMember(vo);
	}
	public void deleteMember(String uid) {
		dao.deleteMember(uid);
	}
}
