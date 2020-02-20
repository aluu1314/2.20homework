package com.shenjialong.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shenjialong.dao.ArticleMapper;
import com.shenjialong.entity.Article;
import com.shenjialong.service.ArticleService;
/**
 * 
 * @ClassName: ArticleServiceImpl 
 * @Description: TODO
 * @author:sjl
 * @date: 2020年2月20日 下午6:02:43
 */
@Service
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	private ArticleMapper articleMapper;

	@Override
	public PageInfo getArticleList(Integer pageNum, String created1, String created2,Integer orderValue) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, 10);
		List<Article> article = articleMapper.getArticleList(created1,created2,orderValue);
		PageInfo info = new PageInfo(article);
		return info;
	}
}
