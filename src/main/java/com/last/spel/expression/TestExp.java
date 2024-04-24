package com.last.spel.expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.expression.BeanFactoryResolver;
import org.springframework.expression.*;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class TestExp {

    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class);
     
        StandardEvaluationContext evalContext = new StandardEvaluationContext();
        evalContext.setBeanResolver(new BeanFactoryResolver(container));
        
        ExpressionParser parser = new SpelExpressionParser();
        String parserPlayerName = (String)parser.parseExpression("@player.country").getValue(evalContext);

        System.out.println("Expression1 String: " + parserPlayerName);
    }
}
