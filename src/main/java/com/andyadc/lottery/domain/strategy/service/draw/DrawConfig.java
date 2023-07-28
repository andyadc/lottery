package com.andyadc.lottery.domain.strategy.service.draw;

import com.andyadc.lottery.domain.rule.annotation.Strategy;
import com.andyadc.lottery.domain.strategy.service.algorithm.DrawAlgorithm;
import org.springframework.core.annotation.AnnotationUtils;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 抽奖统一配置信息类
 */
public class DrawConfig {

    /**
     * 抽奖策略组
     */
    protected static Map<Integer, DrawAlgorithm> drawAlgorithmGroup = new ConcurrentHashMap<>();

    @Resource
    private List<DrawAlgorithm> drawAlgorithmList;

    @PostConstruct
    public void init() {
        drawAlgorithmList.forEach(algorithm -> {
            Strategy strategy = AnnotationUtils.findAnnotation(algorithm.getClass(), Strategy.class);
            if (strategy != null) {
                drawAlgorithmGroup.put(strategy.mode().code(), algorithm);
            }
        });
    }
}
