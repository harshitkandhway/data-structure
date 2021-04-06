package tree;

import util.Node;

import java.util.LinkedList;
import java.util.Queue;

public class TreeTraversal {

    public static void levelOrderTraversal(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node temp = queue.peek();
            System.out.print(temp.getData() + "->");
            queue.remove(temp);

            if(temp.getLeft() != null){
                queue.add(temp.getLeft());
            }

            if(temp.getRight() != null){
                queue.add(temp.getRight());
            }
        }
    }

}
