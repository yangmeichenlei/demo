package com.media.common.view.video;

import java.util.List;

import com.media.common.enums.CodeEnum;

import io.swagger.annotations.ApiModel;

/**
 * Created by lihaiqiang on 2018/11/01.
 */
@ApiModel(value = "VideoImageByTypeView", description = "按类型获取商品图片视图")
public class VideoImageByTypeView {

    private String refId;
    private List<VideoImageView> auditImgList;//审核中的图片
    private List<VideoImageView> curEndableImgList;//当前有效的图片
    private List<VideoImageView> disabledImgList;//已失效的图片

    public String getRefId() {
        return refId;
    }

    public void setRefId(String refId) {
        this.refId = refId;
    }

    public Integer getImgStatus() {
        if (auditImgList != null && auditImgList.size() >= 1) {
            return CodeEnum.UNCHECED.getCode();
        }
        if (curEndableImgList != null && curEndableImgList.size() >= 1) {
            return CodeEnum.CHECKED.getCode();
        }
        if (disabledImgList != null && disabledImgList.size() >= 1) {
            return CodeEnum.DISCARD.getCode();
        }
        return CodeEnum.UNCOMMITTED.getCode();
    }

    public void setImgStatus(Integer imgStatus) {
    }

    public String getImgStatusName() {
        if (auditImgList != null && auditImgList.size() >= 1) {
            return CodeEnum.UNCHECED.getMsg();
        }
        if (curEndableImgList != null && curEndableImgList.size() >= 1) {
            return CodeEnum.CHECKED.getMsg();
        }
        if (disabledImgList != null && disabledImgList.size() >= 1) {
            return CodeEnum.DISCARD.getMsg();
        }
        return CodeEnum.UNCOMMITTED.getMsg();
    }

    public void setImgStatusName(String imgStatusName) {
    }

    public List<VideoImageView> getAuditImgList() {
        return auditImgList;
    }

    public void setAuditSkuImgList(List<VideoImageView> auditImgList) {
        this.auditImgList = auditImgList;
    }

    public List<VideoImageView> getCurEndableImgList() {
        return curEndableImgList;
    }

    public void setCurEndableImgList(List<VideoImageView> curSkuImgList) {
        this.curEndableImgList = curSkuImgList;
    }

    public List<VideoImageView> getDisabledImgList() {
        return disabledImgList;
    }

    public void setDisabledImgList(List<VideoImageView> disabledSkuImgList) {
        this.disabledImgList = disabledSkuImgList;
    }
}
