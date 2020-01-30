package kr.co.sboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.sboard.dao.BoardDAO;
import kr.co.sboard.vo.BoardArticleVO;

@Service
public class BoardService {
	
	@Autowired
	private BoardDAO dao;

	// 전체 게시물 갯수
	public int getTotalArticle() {
		return dao.getTotalArticle();
	}
	
	// LIMIT 번호
	public int getLimitStart(String pg) {
		if(pg == null) {
			return 0;
		}else {
			int page = Integer.parseInt(pg);
			return (page - 1)*10;
		}
	}
	
	// 페이지번호 계산
	public int getPageEnd(int total) {
		int pageEnd = 0;
		if(total % 10 ==0) {
			pageEnd = total/10;
		}else {
			pageEnd = (total/10) + 1;
		}
		return pageEnd;
	}
	
	// 글 순서 카운터 번호
	public int getListCount(int total, int start) {
		return (total - start)+1;
	}
	
	
	
	
	
	
	
	
	public void insertArticle(BoardArticleVO vo)	{
		dao.insertArticle(vo);
	}
	
	public BoardArticleVO selectArticle(int seq)	{
		return dao.selectArticle(seq);
	}
	public List<BoardArticleVO> selectArticles(int start)	{
		return dao.selectArticles(start);
	}
	
	public void updateArticle(BoardArticleVO vo)	{
		dao.updateArticle(vo);
	}
	public void deleteArticle(int seq)	{
		dao.deleteArticle(seq);
	}
	
	
	public void insertComment(BoardArticleVO vo) {
		dao.insertComment(vo);
	}
	public List<BoardArticleVO> selectComment(int parent) {
		return dao.selectComment(parent);
	}
	public void updateComment(BoardArticleVO vo) {
		dao.updateComment(vo);
	}
	public void deleteComment(int seq) {
		dao.deleteComment(seq);
	}
	
}
