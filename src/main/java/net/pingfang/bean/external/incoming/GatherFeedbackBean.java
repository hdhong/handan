package net.pingfang.bean.external.incoming;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 * Created by leohe on 2018/1/9.
 */
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class GatherFeedbackBean {
    @JsonProperty(value = "gather_feedback")
    private FeedbackInfoBean feedbackInfo;

    public FeedbackInfoBean getFeedbackInfo() {
        return feedbackInfo;
    }

    public void setFeedbackInfo(FeedbackInfoBean feedbackInfo) {
        this.feedbackInfo = feedbackInfo;
    }

    @JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
    public static class FeedbackInfoBean{
        private String sessionId;
        private String areaId;
        private String channelId;
        @JsonProperty(value = "i_e_flag")
        private String ieFlag;
        private String feedbackTime;
        private String checkResult;
        private String resultDescription;
        private String ledHint;
        private String printMessage;

        public String getSessionId() {
            return sessionId;
        }

        public void setSessionId(String sessionId) {
            this.sessionId = sessionId;
        }

        public String getAreaId() {
            return areaId;
        }

        public void setAreaId(String areaId) {
            this.areaId = areaId;
        }

        public String getChannelId() {
            return channelId;
        }

        public void setChannelId(String channelId) {
            this.channelId = channelId;
        }

        public String getIeFlag() {
            return ieFlag;
        }

        public void setIeFlag(String ieFlag) {
            this.ieFlag = ieFlag;
        }

        public String getFeedbackTime() {
            return feedbackTime;
        }

        public void setFeedbackTime(String feedbackTime) {
            this.feedbackTime = feedbackTime;
        }

        public String getCheckResult() {
            return checkResult;
        }

        public void setCheckResult(String checkResult) {
            this.checkResult = checkResult;
        }

        public String getResultDescription() {
            return resultDescription;
        }

        public void setResultDescription(String resultDescription) {
            this.resultDescription = resultDescription;
        }

        public String getLedHint() {
            return ledHint;
        }

        public void setLedHint(String ledHint) {
            this.ledHint = ledHint;
        }

        public String getPrintMessage() {
            return printMessage;
        }

        public void setPrintMessage(String printMessage) {
            this.printMessage = printMessage;
        }
    }
}
