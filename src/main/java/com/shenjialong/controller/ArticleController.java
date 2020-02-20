package com.shenjialong.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.shenjialong.service.ArticleService;

/**
 * 
 * @ClassName: ArticleController 
 * @Description: TODO
 * @author:sjl 
 * @date: 2020年2月20日 下午6:01:33
 */
@Controller
public class ArticleController {

	@Autowired
	private ArticleService articleService;
	/**
	 * 查询区间
	 */
	@RequestMapping("articlelist")
	public String getArticleList(HttpServletRequest request,@RequestParam(defaultValue="1")Integer pageNum,String created1,String created2,@RequestParam(defaultValue="0")Integer orderValue) {
		PageInfo info = articleService.getArticleList(pageNum,created1,created2,orderValue);
		request.setAttribute("info", info);
		request.setAttribute("created1", created1);
		request.setAttribute("created2", created2);
		request.setAttribute("orderValue", orderValue);
		return "articlelist";
	}
}
