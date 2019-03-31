package org.hm.jdbc.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ArticleMain {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("chap02.xml");
		ArticleService articleService = ctx.getBean("articleService", org.hm.jdbc.spring.ArticleService.class);
		MemberService memberService = ctx.getBean("memberService", org.hm.jdbc.spring.MemberService.class);

		articleService.addArticle();
		memberService.registerMember();

		ctx.close();
	}

}