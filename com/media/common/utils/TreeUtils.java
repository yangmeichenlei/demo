package com.media.common.utils;


import java.util.ArrayList;
import java.util.List;

import com.media.common.view.SelectTreeResultView;

/**
 * Created by lihaiqiang on 2018/08/15.
 */
public class TreeUtils {

    private int index = 0;

    /**
     * 构建分类信息
     *
     * @param list 全部分类信息
     * @return 有层级的分类信息
     */
    public List<SelectTreeResultView> buildSelectTree(List<SelectTreeResultView> list) {
        List<SelectTreeResultView> selectTree = new ArrayList<SelectTreeResultView>();
        SelectTreeResultView curSelectTree = null;
        while (index < list.size()) {
            curSelectTree = list.get(index);
            //父节点相同
            if (selectTree.size() == 0 || selectTree.get(0).getpId().equals(curSelectTree.getpId())) {
                selectTree.add(curSelectTree);
            } else {
                return selectTree;
            }
            index++;
            //是父节点且当前节点的id为下一节点父节点
            if (curSelectTree.getIsParent() &&
                    curSelectTree.getId().equals(list.get(index).getpId())) {
                curSelectTree.setChildSelectTreeList(buildSelectTree(list));
            }
        }
        return selectTree;
    }
}
