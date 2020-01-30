package kr.co.sboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.sboard.dao.MemberDAO;
import kr.co.sboard.vo.MemberVO;
import kr.co.sboard.vo.TermsVO;
@Service
public class MemberService {
	
	@Autowired
	private MemberDAO dao;
	
	public TermsVO selectTerms () {
		return dao.selectTerms();
	}
	public void insertMember(MemberVO vo) {
		dao.insertMember(vo);
	}
	public MemberVO selectMember(MemberVO vo) {
		return dao.selectMember(vo);
	}
	public List<MemberVO> selectMembers() {
		return dao.selectMembers();
	}
	public void updateMember() {}
	public void deleteMember() {}
	
	public int selectUidCount(String uid) {
		return dao.selectUidCount(uid);
	}
}
