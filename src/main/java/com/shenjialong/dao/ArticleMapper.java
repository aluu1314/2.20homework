package com.shenjialong.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shenjialong.entity.Article;

/**
 * 
 * @ClassName: ArticleMapper 
 * @Description: TODO
 * @author:sjl
 * @date: 2020年2月20日 下午6:03:26
 */
public interface ArticleMapper {

	/**
	 * 
	 * @Title: getArticleList 
	 * @Description: TODO
	 * @param created1
	 * @param created2
	 * @return
	 * @return: List<Article>
	 */
	List<Article> getArticleList(@Param("created1")String created1, @Param("created2")String created2,@Param("orderValue")Integer orderValue);

}
