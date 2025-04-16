package Tree;

public class Diameter {
    static  class Node{
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data= data;
            this.left=null;
            this.right= null;

        }
    }

    static  class buildtree{
        static int idx=-1;

        public static Node treedata(int node[])
        {
            idx++;
            if(node[idx]==-1)
            {
                return null;
            }

            Node newnode= new Node(node[idx]);

            newnode.left= treedata(node);
            newnode.right=treedata(node);
            return newnode;
        }

        static int height(Node root)
        {
            if(root==null)
            {
                return 0;
            }

            int lh= height(root.left);
            int rh= height(root.right);
            return  Math.max(rh , lh)+1;
        }

        static  int diameter(Node root)
        {
            if(root== null)
            {
                return 0;
            }
            int ld= diameter(root.left);
            int rd= diameter(root.right);
            int lh=height(root.left);
            int rh= height(root.right);
            int selfheight=rh+lh+1;
            return  Math.max(selfheight , Math.max(ld , rd));
        }

    }

    public static void main(String[] args) {
        int node[]={1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1};
        buildtree tree = new buildtree();

        Node root = tree.treedata(node);
        System.out.println("Diameter is : "+ tree.diameter(root));
        
    }
}
