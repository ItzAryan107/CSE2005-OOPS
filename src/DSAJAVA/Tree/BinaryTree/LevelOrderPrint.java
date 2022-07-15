package DSAJAVA.Tree.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderPrint<T> extends LevelOrderTreeBuilt<T> {

    public void print(){
        if (root==null)//this root is of Tree class
            return;

        Queue<Node<T>> tempQueue=new LinkedList<>();
        tempQueue.add(root);//this root is of Tree class
        tempQueue.add(null);

        while (!tempQueue.isEmpty()){
            Node<T> tempNode=tempQueue.remove();
            if (tempNode==null){
                System.out.println();
                if (tempQueue.isEmpty())
                    break;
                else
                    tempQueue.add(null);
            }else {
                System.out.print(tempNode.data+" ");
                if (tempNode.left!=null)
                    tempQueue.add(tempNode.left);
                if (tempNode.right!=null)
                    tempQueue.add(tempNode.right);
            }
        }
    }
}