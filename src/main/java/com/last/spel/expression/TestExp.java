package com.last.spel.expression;

import com.last.spel.expression.dto.Inventor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.expression.*;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class TestExp {

    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class);
        ExpressionParser parser = new SpelExpressionParser();
        String parserPlayerName = (String)parser.parseExpression("@player.age").getValue();
        
        
        StandardEvaluationContext evalContext = new StandardEvaluationContext();

        System.out.println("Expression1 String: " + parserPlayerName);
    }
}
