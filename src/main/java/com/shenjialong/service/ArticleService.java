package com.shenjialong.service;

import com.github.pagehelper.PageInfo;

public interface ArticleService {

	PageInfo getArticleList(Integer pageNum, String created1, String created2,Integer orderValue);

}
