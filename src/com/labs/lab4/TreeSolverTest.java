package com.labs.lab4;

/**
 * Created by Anna Kolesnikova on 16.04.2017.
 */
public class TreeSolverTest {
    public static void main(String[] args) {
        TreeSolver solver = new TreeSolver();

        TreeNode tree = solver.generate(5,4);
        solver.print(tree);

        System.out.println(solver.findMax(tree, 4));
    }
}
