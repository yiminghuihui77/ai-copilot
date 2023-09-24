package com.ai;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * AI助手应用启动类
 *
 * @author minghui.y
 * @create 2023-09-24 1:17 上午
 **/
@SpringBootApplication
public class AiCopilotApp {

    private static final Logger LOGGER = LoggerFactory.getLogger( AiCopilotApp.class );

    public static void main( String[] args ) {
        SpringApplication.run( AiCopilotApp.class, args );
        LOGGER.info( "AiCopilotApp start up success ..." );
    }
}
