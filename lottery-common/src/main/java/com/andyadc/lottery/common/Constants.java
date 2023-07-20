package com.andyadc.lottery.common;

public class Constants {

    public enum ResponseCode {
        SUCCESS("000", "成功"),
        ;

        String code;
        String message;

        ResponseCode(String code, String info) {
            this.code = code;
            this.message = info;
        }

        public String code() {
            return code;
        }

        public String message() {
            return message;
        }
    }

    /**
     * 缓存 Key
     */
    public static final class RedisKey {
        // 抽奖活动库存 Key
        private static final String LOTTERY_ACTIVITY_STOCK_COUNT = "lottery_activity_stock_count_";
        // 抽奖活动库存锁 Key
        private static final String LOTTERY_ACTIVITY_STOCK_COUNT_TOKEN = "lottery_activity_stock_count_token_";

        public static String KEY_LOTTERY_ACTIVITY_STOCK_COUNT(Long activityId) {
            return LOTTERY_ACTIVITY_STOCK_COUNT + activityId;
        }

        public static String KEY_LOTTERY_ACTIVITY_STOCK_COUNT_TOKEN(Long activityId, Integer stockUsedCount) {
            return LOTTERY_ACTIVITY_STOCK_COUNT_TOKEN + activityId + "_" + stockUsedCount;
        }
    }

    /**
     * 决策树节点
     */
    public static final class NodeType {
        /**
         * 树茎
         */
        public static final Integer STEM = 1;
        /**
         * 果实
         */
        public static final Integer FRUIT = 2;
    }
}
