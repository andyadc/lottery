package com.andyadc.lottery.domain.strategy.model.response;

import com.andyadc.lottery.common.Constants;
import com.andyadc.lottery.domain.strategy.model.vo.DrawAwardVO;

public class DrawResponse {

    /**
     * 用户ID
     */
    private String uid;

    /**
     * 策略ID
     */
    private Long strategyId;

    /**
     * 中奖状态：0未中奖、1已中奖、2兜底奖 Constants.DrawState
     */
    private Integer drawState = Constants.DrawState.FAIL.code();

    /**
     * 中奖奖品信息
     */
    private DrawAwardVO drawAwardInfo;

    public DrawResponse() {
    }

    public DrawResponse(String uid, Long strategyId, Integer drawState) {
        this.uid = uid;
        this.strategyId = strategyId;
        this.drawState = drawState;
    }

    public DrawResponse(String uid, Long strategyId, Integer drawState, DrawAwardVO drawAwardInfo) {
        this.uid = uid;
        this.strategyId = strategyId;
        this.drawState = drawState;
        this.drawAwardInfo = drawAwardInfo;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Long getStrategyId() {
        return strategyId;
    }

    public void setStrategyId(Long strategyId) {
        this.strategyId = strategyId;
    }

    public Integer getDrawState() {
        return drawState;
    }

    public void setDrawState(Integer drawState) {
        this.drawState = drawState;
    }

    public DrawAwardVO getDrawAwardInfo() {
        return drawAwardInfo;
    }

    public void setDrawAwardInfo(DrawAwardVO drawAwardInfo) {
        this.drawAwardInfo = drawAwardInfo;
    }
}
