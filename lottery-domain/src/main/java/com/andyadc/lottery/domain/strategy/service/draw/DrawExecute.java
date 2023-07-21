package com.andyadc.lottery.domain.strategy.service.draw;

import com.andyadc.lottery.domain.strategy.model.request.DrawRequest;
import com.andyadc.lottery.domain.strategy.model.response.DrawResponse;

/**
 * 抽奖执行接口
 */
public interface DrawExecute {

    DrawResponse execute(DrawRequest request);
}
