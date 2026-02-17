public class MirrorBST {
     static class Node {
        int data ;
        Node left ;
        Node right;
        Node (int data)
        {
            this .data = data;
        }
    }
    // insertion
    public static Node insert (Node root , int val)
    {
           if(root == null)
           {
            root = new Node (val);
            return root;
           }
           if(root.data > val)
           {
            //left subtree 
            root.left = insert (root.left,val);
           }
           else
           {
            //right subtree 
            root.right = insert (root.right,val);
           }
          return root; 
    }


    // mirror image of the BST 
    public static Node mirrorBST(Node root)
    {
       // base case 
       if(root == null) 
        return null;
       Node leftSubtreeMirror = mirrorBST(root.left);
       Node rightSubtreeMirror = mirrorBST(root.right);
       
       // exchange of left and right subtree 
       root.left = rightSubtreeMirror;
       root.right = leftSubtreeMirror;

       return root;
    }
    public static void preorder(Node root)
    {
        if(root == null)
        {
            return ;
        }
        System.out.print(root.data +" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String args[])
    {
        int values[] = {8,5,10,3,6,11};
        /*
                  8
                 / \
                 5  10
                / \   \
               3   6   11
         */
        Node root = null;
        for(int i = 0 ; i<values.length ; i++)
        {
            root = insert (root , values[i]);
        }
        /*mirror 
                  8
                 /  \
                 10  5
                /   / \
               11  6   3
         */

       
      root = mirrorBST((root));
      preorder(root);
    }
}
