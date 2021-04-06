package util;

public class ObjectProvider {
    /*
                4
             /     \
            2       8
           / \     /
          5   9   6
     */
    public static Node getSampleTree(){
        Node root = new Node(4);
        Node l = new Node(2);
        Node r = new Node(8);
        Node ll = new Node(5);
        Node lr = new Node(9);
        Node rl = new Node(6);
        root.setLeft(l);
        root.setRight(r);
        l.setLeft(ll);
        l.setRight(lr);
        r.setLeft(rl);
        return root;
    }
}
