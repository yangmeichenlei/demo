
package com.media.form.video;
import io.swagger.annotations.ApiModel;
/**
 * Created by lihaiqiang on 2018/11/01.
 */
@ApiModel(value = "VideoAttributeEditForm", description = "视频属性编辑form")
public class VideoAttributeEditForm {
    private String pkAttributeId;

    private String pkVideoId;

    private String attrValId;

    private String attrVal;

    public String getPkAttributeId() {
        return pkAttributeId;
    }

    public void setPkAttributeId(String pkAttributeId) {
        this.pkAttributeId = pkAttributeId;
    }

    public String getPkVideoId() {
        return pkVideoId;
    }

    public void setPkVideoId(String pkVideoId) {
        this.pkVideoId = pkVideoId;
    }

    public String getAttrValId() {
        return attrValId;
    }

    public void setAttrValId(String attrValId) {
        this.attrValId = attrValId;
    }

    public String getAttrVal() {
        return attrVal;
    }

    public void setAttrVal(String attrVal) {
        this.attrVal = attrVal;
    }
}
