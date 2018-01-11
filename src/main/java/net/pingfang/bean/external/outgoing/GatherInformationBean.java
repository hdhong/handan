package net.pingfang.bean.external.outgoing;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 * Created by leohe on 2018/1/9.
 */
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class GatherInformationBean {

    @JsonProperty(value = "gather_information")
    private GatherInfo gatherInfo;

    public GatherInfo getGatherInfo() {
        return gatherInfo;
    }

    public void setGatherInfo(GatherInfo gatherInfo) {
        this.gatherInfo = gatherInfo;
    }

    @JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
    public static class GatherInfo{
        private String sessionId;
        private String areaId;
        private String channelId;
        @JsonProperty(value = "i_e_flag")
        private String ieFlag;
        @JsonProperty(value = "gether_mode")
        private String gatherMode;
        private String passTime;
        private String sendTime;
        @JsonProperty(value = "ocr")
        private OcrBean ocrBean;
        @JsonProperty(value = "image")
        private ImageBean images;
        private String weight;

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

        public String getGatherMode() {
            return gatherMode;
        }

        public void setGatherMode(String gatherMode) {
            this.gatherMode = gatherMode;
        }

        public String getPassTime() {
            return passTime;
        }

        public void setPassTime(String passTime) {
            this.passTime = passTime;
        }

        public String getSendTime() {
            return sendTime;
        }

        public void setSendTime(String sendTime) {
            this.sendTime = sendTime;
        }

        public OcrBean getOcrBean() {
            return ocrBean;
        }

        public void setOcrBean(OcrBean ocrBean) {
            this.ocrBean = ocrBean;
        }

        public ImageBean getImages() {
            return images;
        }

        public void setImages(ImageBean images) {
            this.images = images;
        }

        public String getWeight() {
            return weight;
        }

        public void setWeight(String weight) {
            this.weight = weight;
        }
    }
    @JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
    public static class OcrBean{
        private String plate;
        private String plateColor;
        private int containerCount;
        private String containerNumberFront;
        private String containerIsoFront;
        private String containerCheckFront;
        private String containerNumberBack;
        private String containerIsoBack;
        private String containerCheckBack;

        public String getPlate() {
            return plate;
        }

        public void setPlate(String plate) {
            this.plate = plate;
        }

        public String getPlateColor() {
            return plateColor;
        }

        public void setPlateColor(String plateColor) {
            this.plateColor = plateColor;
        }

        public int getContainerCount() {
            return containerCount;
        }

        public void setContainerCount(int containerCount) {
            this.containerCount = containerCount;
        }

        public String getContainerNumberFront() {
            return containerNumberFront;
        }

        public void setContainerNumberFront(String containerNumberFront) {
            this.containerNumberFront = containerNumberFront;
        }

        public String getContainerIsoFront() {
            return containerIsoFront;
        }

        public void setContainerIsoFront(String containerIsoFront) {
            this.containerIsoFront = containerIsoFront;
        }

        public String getContainerCheckFront() {
            return containerCheckFront;
        }

        public void setContainerCheckFront(String containerCheckFront) {
            this.containerCheckFront = containerCheckFront;
        }

        public String getContainerNumberBack() {
            return containerNumberBack;
        }

        public void setContainerNumberBack(String containerNumberBack) {
            this.containerNumberBack = containerNumberBack;
        }

        public String getContainerIsoBack() {
            return containerIsoBack;
        }

        public void setContainerIsoBack(String containerIsoBack) {
            this.containerIsoBack = containerIsoBack;
        }

        public String getContainerCheckBack() {
            return containerCheckBack;
        }

        public void setContainerCheckBack(String containerCheckBack) {
            this.containerCheckBack = containerCheckBack;
        }
    }

    public static class ImageBean{
        @JsonProperty(value = "filepath")
        private String filePath;

        public String getFilePath() {
            return filePath;
        }

        public void setFilePath(String filePath) {
            this.filePath = filePath;
        }
    }

}
