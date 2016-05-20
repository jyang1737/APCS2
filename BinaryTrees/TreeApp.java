public class TreeApp {

    public static<E> void traverseInorder(TreeNode<E> root) {
	if (root == null) return;
	traverseInorder(root.getLeft());
	System.out.print(root.getValue() + " ");
	traverseInorder(root.getRight());
    }

    public static<E> int countNodes(TreeNode<E> rt) {
	if (rt == null) return 0;
	else
	    return 1 + countNodes(rt.getLeft()) + countNodes(rt.getRight());
    }
 
    public static<E> boolean isLeaf(TreeNode<E> rt) {
	return (rt.getLeft() == null && rt.getRight() == null);
    }

    public static<E> int height(TreeNode<E> rt) {
	int left = 0;
	int right = 0;
	if (rt == null) return 0;
	if (rt.getLeft() != null)
	    left = 1 + height(rt.getLeft());
	if (rt.getRight() != null)
	    right = 1 + height(rt.getRight());
	return Math.max(left,right);
    }

    public static<E> int countLeaves(TreeNode<E> rt) {
	if (rt == null) return 0;
	if (isLeaf(rt)) return 1;
	return countLeaves(rt.getLeft()) + countLeaves(rt.getRight());
    }

    public static void main(String[] args) {
	TreeNode<Integer> root = new TreeNode<Integer>(1, null, null);
	root.setLeft(new TreeNode<Integer>(2, null, null));
	root.setRight(new TreeNode<Integer>(3, null, null));
	root.getLeft().setRight(new TreeNode<Integer>(4, null, null));
	root.getRight().setLeft(new TreeNode<Integer>(5, null, null));
	root.getRight().setRight(new TreeNode<Integer>(6, null, null));
	root.getRight().getLeft().setLeft(new TreeNode<Integer>(7, null, null));
	root.getRight().getLeft().setRight(new TreeNode<Integer>(8, null, null));
	traverseInorder(root);
	System.out.println(countNodes(root));
	System.out.println(isLeaf(root.getLeft()));
	System.out.println(height(root));

    }
   
}
