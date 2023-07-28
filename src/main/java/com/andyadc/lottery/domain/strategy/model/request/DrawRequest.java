package com.andyadc.lottery.domain.strategy.model.request;

public class DrawRequest {

    /**
     * 用户ID
     */
    private String uid;

    /**
     * 策略ID
     */
    private Long strategyId;

    /**
     * 防重ID
     */
    private String uuid;

    public DrawRequest() {
    }

    public DrawRequest(String uid, Long strategyId) {
        this.uid = uid;
        this.strategyId = strategyId;
    }

    public DrawRequest(String uid, Long strategyId, String uuid) {
        this.uid = uid;
        this.strategyId = strategyId;
        this.uuid = uuid;
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

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
