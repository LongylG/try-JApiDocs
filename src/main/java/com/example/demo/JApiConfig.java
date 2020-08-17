package com.example.demo;

import io.github.yedaxia.apidocs.Docs;
import io.github.yedaxia.apidocs.DocsConfig;
import io.github.yedaxia.apidocs.plugin.markdown.MarkdownDocPlugin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author liyulong
 * @date 2020-08-11 4:14 下午
 */
@Configuration
public class JApiConfig {


    @Bean
    public void generateDoc() {
        DocsConfig config = new DocsConfig();
        config.setProjectName("aswome");
        config.setApiVersion("V1.0");
        config.setAutoGenerate(Boolean.TRUE);
        config.setProjectPath("/Users/liyulong/IdeaProjects/awsome");
        config.setDocsPath("docs");
        config.addPlugin(new MarkdownDocPlugin());
        Docs.buildHtmlDocs(config);
    }
}
