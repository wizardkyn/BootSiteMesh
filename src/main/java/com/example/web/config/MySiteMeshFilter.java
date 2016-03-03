package com.example.web.config;

import org.sitemesh.builder.SiteMeshFilterBuilder;
import org.sitemesh.config.ConfigurableSiteMeshFilter;
import org.sitemesh.content.tagrules.html.DivExtractingTagRuleBundle;

public class MySiteMeshFilter extends ConfigurableSiteMeshFilter {

	@Override
	protected void applyCustomConfiguration(SiteMeshFilterBuilder builder) {
		// Map default decorator. This shall be applied to all paths if no other paths match.
	    builder.addDecoratorPath("/*", "/WEB-INF/decorators/defaultDecorator.jsp") 
	           // Map decorators to path patterns. 
	           .addDecoratorPath("/web/**.do*", "/WEB-INF/decorators/defaultDecorator.jsp")
	           .addDecoratorPath("/backend/**.do", "/WEB-INF/decorators/adminDecorator.jsp")
	           // Map multiple decorators to the a single path.
//	           .addDecoratorPaths("/articles/*", "/decorators/article.html",
//	                                             "/decoratos/two-page-layout.html", 
//	                                             "/decorators/common.html")
	           // Exclude path from decoration.
	           .addExcludedPath("/login/**")
	           .addExcludedPath("/main/**")
        	   .addExcludedPath("/popup/**");
	    	    
	    // add div tag rule
	    builder.addTagRuleBundles(new DivExtractingTagRuleBundle());
	}
}
