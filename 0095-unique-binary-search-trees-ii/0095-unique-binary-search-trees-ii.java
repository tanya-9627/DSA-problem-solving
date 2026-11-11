/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<TreeNode> generateTrees(int n) {
        	/**

	 * Definition for a binary tree node.

	 * public class TreeNode {

	 *     int val;

	 *     TreeNode left;

	 *     TreeNode right;

	 *     TreeNode(int x) { val = x; }

	 * }

	 */


	        if (n == 0) return new ArrayList<>();

	        return build(1, n);

	    }

	    

	    private List<TreeNode> build(int start, int end) {

	        List<TreeNode> trees = new ArrayList<>();

	        if (start > end) {

	            trees.add(null);

	            return trees;

	        }

	        for (int i = start; i <= end; i++) {

	            List<TreeNode> left = build(start, i - 1);

	            List<TreeNode> right = build(i + 1, end);

	            for (TreeNode l : left) {

	                for (TreeNode r : right) {

	                    TreeNode root = new TreeNode(i);

	                    root.left = l;

	                    root.right = r;

	                    trees.add(root);

	                }

	            }

	        }

	        return trees;

	    }

	}
    
