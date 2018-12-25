package com.media.common.model.video;

import com.media.common.base.BaseModel;

public class VideoClassRef extends BaseModel {
    private static final long serialVersionUID = 1L;

    private String pkVideoClassRef;

    private String pkVideoId;

    private String pkVideoClassId;

    public String getPkVideoClassRef() {
        return pkVideoClassRef;
    }

    public void setPkVideoClassRef(String pkVideoClassRef) {
        this.pkVideoClassRef = pkVideoClassRef == null ? null : pkVideoClassRef.trim();
    }

    public String getPkVideoId() {
        return pkVideoId;
    }

    public void setPkVideoId(String pkVideoId) {
        this.pkVideoId = pkVideoId == null ? null : pkVideoId.trim();
    }

    public String getPkVideoClassId() {
        return pkVideoClassId;
    }

    public void setPkVideoClassId(String pkVideoClassId) {
        this.pkVideoClassId = pkVideoClassId == null ? null : pkVideoClassId.trim();
    }
}