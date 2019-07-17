package tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;


//定义二叉查找树类
public class BST<E> extends AbstractTree{
	protected TreeNode  root;
	protected int size=0;
	public BST() {
		
	}
	public BST(E[] objects) {
		
		
	}
	private TreeNode create(ArrayList arr, int index) {
        if (index >= arr.size())       // 可以不需要，但是所有的值必须要写满，任一个#都要写，不然会越界
            return null;
        else if (String.valueOf(arr.get(index)).equals("#")||String.valueOf(arr.get(index)).equals("*")) {
            return null;
        } else {
            TreeNode node = new TreeNode(arr.get(index));
            node.left = create(arr, 2 * index + 1);
            node.right = create(arr, 2 * index + 2);
            return node;
        }
    }

	
	
}
