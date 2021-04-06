package tree;

import util.Node;
import util.ObjectProvider;

public class Driver {
    public static void main(String[] args) {
        Node root = ObjectProvider.getSampleTree();
        TreeTraversal.levelOrderTraversal(root);
    }
}
