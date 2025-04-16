
package Tree;

public class sum_of_node {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class treedata {
        static int idx = -1;

        public static Node buildtree(int[] node) {
            idx++;
            if (idx >= node.length || node[idx] == -1) {
                return null;
            }

            Node newNode = new Node(node[idx]);
            newNode.left = buildtree(node);
            newNode.right = buildtree(node);
            return newNode;
        }

        public static int sum_of_node(Node root) {
            if (root == null) return 0;
            int leftsum = sum_of_node(root.left);
            int rightsum = sum_of_node(root.right);
            return root.data + leftsum + rightsum;
        }
    }

    public static void main(String[] args) {
        int[] node = {1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1};
        Node root = treedata.buildtree(node);
        int sum = treedata.sum_of_node(root);
        System.out.println("Sum of all nodes: " + sum);
    }
}
