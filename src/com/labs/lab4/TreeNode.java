package com.labs.lab4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anna Kolesnikova on 16.04.2017.
 */
public class TreeNode {
    private Integer value;
    private List<TreeNode> childNodes = new ArrayList<>();

    public TreeNode(Integer value) {
        this.value = value;
    }

    public void addChild(TreeNode childNode) {
        childNodes.add(childNode);
    }

    public Integer getValue() {
        return value;
    }

    public List<TreeNode> getChildNodes() {
        return childNodes;
    }
}
