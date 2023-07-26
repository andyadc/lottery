package com.andyadc.lottery.infrastructure.repository;

import com.andyadc.lottery.domain.strategy.model.aggregates.StrategyRich;
import com.andyadc.lottery.domain.strategy.model.vo.AwardBriefVO;
import com.andyadc.lottery.domain.strategy.repository.StrategyRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StrategyRepositoryImpl implements StrategyRepository {

    @Override
    public StrategyRich queryStrategyRich(Long strategyId) {
        return null;
    }

    @Override
    public AwardBriefVO queryAwardInfo(String awardId) {
        return null;
    }

    @Override
    public List<String> queryNoStockStrategyAwardList(Long strategyId) {
        return null;
    }

    @Override
    public boolean deductStock(Long strategyId, String awardId) {
        return false;
    }
}
