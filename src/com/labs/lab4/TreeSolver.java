package com.labs.lab4;

import sun.reflect.generics.tree.Tree;

import java.util.List;
import java.util.Random;

/**
 * Created by Anna Kolesnikova on 16.04.2017.
 */
public class TreeSolver {
    private Random random = new Random();

    public TreeNode generate(int depth, int maxChildCount) {
        TreeNode treeNode = new TreeNode(random.nextInt(100));

        if (depth > 1) {
            int childCount = random.nextInt(maxChildCount) + 1;
            for (int i = 0; i < childCount; i++){
                treeNode.addChild(generate(depth-1, maxChildCount));
            }
        }

        return treeNode;
    }

    public Integer findMax(TreeNode tree, int level) {
        return max(tree, level, 1, 0);
    }

    private Integer max(TreeNode treeNode, int level, int currLevel, int max) {
        if (currLevel < level) {
            List<TreeNode> childNodes = treeNode.getChildNodes();
            for (TreeNode node : childNodes) {
                max = max(node, level, currLevel + 1, max);
            }
        }

        if (currLevel == level) {
            if (max < treeNode.getValue()) {
                max = treeNode.getValue();
            }
        }

        return max;
    }

    public void print(TreeNode tree) {
        printNode(tree, "");
    }

    private void printNode(TreeNode tree, String indent) {
        System.out.print(indent);
        if (tree.getChildNodes().isEmpty()) {
            System.out.print("|-");
            indent += " ";
        } else {
            System.out.print("\\-");
            indent += "| ";
        }

        System.out.println(tree.getValue());

        for (int i = 0; i < tree.getChildNodes().size(); i++) {
            printNode(tree.getChildNodes().get(i), indent);
        }

    }
}
