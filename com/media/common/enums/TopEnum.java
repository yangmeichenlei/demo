package com.media.common.enums;

public enum TopEnum {
    TOP_NO("不置顶", 0),
    TOP_YES("置顶", 1);
    private String TopName;// 置顶类型名称
    private Integer TopCode;// 置顶类型编码

    private TopEnum(String topName, Integer topCode) {
        TopName = topName;
        TopCode = topCode;
    }

    public String getTopName() {
        return TopName;
    }

    public void setTopName(String topName) {
        TopName = topName;
    }

    public Integer getTopCode() {
        return TopCode;
    }

    public void setTopCode(Integer topCode) {
        TopCode = topCode;
    }

}
