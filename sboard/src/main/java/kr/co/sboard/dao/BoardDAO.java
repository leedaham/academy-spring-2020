package kr.co.sboard.dao;

import java.util.List;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.co.sboard.vo.BoardArticleVO;

@Repository
public class BoardDAO {

	@Inject
	private SqlSessionTemplate mybatis;
	
	public int getTotalArticle() {
		return mybatis.selectOne("mapper.sql_article.SELECT_TOTAL_ARTICLES");
	}
	
	public void insertArticle(BoardArticleVO vo) {
		mybatis.insert("mapper.sql_article.INSERT_ARTICLE", vo);
	}
	public BoardArticleVO selectArticle(int seq) {
		return mybatis.selectOne("mapper.sql_article.SELECT_ARTICLE", seq);
	}
	public List<BoardArticleVO> selectArticles(int start) {
		return mybatis.selectList("mapper.sql_article.SELECT_ARTICLES", start);
	}
	public void updateArticle(BoardArticleVO vo) {
		mybatis.update("mapper.sql_article.UPDATE_ARTICLE", vo);
	}
	public void deleteArticle(int seq) {
		mybatis.delete("mapper.sql_article.DELETE_ARTICLE", seq);
	}
	

	public void insertComment(BoardArticleVO vo) {
		mybatis.insert("mapper.sql_article.INSERT_COMMENT", vo);
	}
	public List<BoardArticleVO> selectComment(int parent) {
		return mybatis.selectList("mapper.sql_article.SELECT_COMMENTS", parent);
	}
	public void updateComment(BoardArticleVO vo) {}
	public void deleteComment(int seq) {}
	
}
