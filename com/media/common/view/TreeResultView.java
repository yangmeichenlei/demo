package com.media.common.view;

/**
 * Created by lihaiqiang on 2018/08/13.
 */
public class TreeResultView {
    private String id;//id
    private String pId;//父级id
    private String name;//显示名称
    private Boolean isParent = Boolean.TRUE;//是否父节点

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getIsParent() {
        return isParent;
    }

    public void setIsParent(Boolean isParent) {
        this.isParent = isParent;
    }

    /**
     * 获取根节点
     * @return 根节点
     */
    public static TreeResultView getRootNode() {
        TreeResultView treeResultView = new TreeResultView();
        treeResultView.setId("root");
        treeResultView.setName("Root");
        treeResultView.setIsParent(Boolean.TRUE);
        return treeResultView;
    }
}
