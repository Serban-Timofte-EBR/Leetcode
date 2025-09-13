import Anagram.Solution;
import BST.SolutionBST;
import CycledLinkList.ListNode;
import CycledLinkList.SolutionCycledLinkList;
import FloodFill.SolutionFloodFill;
import LowestCommonAncestorOfABinarySearchTree.SolutionLCABST;
import LowestCommonAncestorOfABinarySearchTree.TreeNode;
import QueueUsingStack.MyQueue;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Solution s = new Solution();
//
//        String t1s1 = "anagram";
//        String t1s2 = "nagaram";
//
//        String t2s1 = "rat";
//        String t2s2 = "car";
//
//        System.out.println("Test 1: " + s.isAnagram(t1s1, t1s2));
//        System.out.println("Test 2: " + s.isAnagram(t2s1, t2s2));

//        SolutionBST solution = new SolutionBST();
//        System.out.println(solution.search(new int[]{-1,0,3,5,9,12}, 9));

//        SolutionFloodFill solutionFloodFill = new SolutionFloodFill();
//        int[][] image = new int[][] {
//                {1,1,1},
//                {1,1,0},
//                {1,0,1}
//        };
//        int[][] filledImade = solutionFloodFill.floodFill(image, 1, 1, 2);
//        for(int row = 0; row < filledImade.length; row++){
//            for(int col = 0; col < filledImade[0].length; col++){
//                System.out.print(filledImade[row][col] + " ");
//            }
//            System.out.println();
//        }
//
//        System.out.println();
//
//        int[][] image2 = new int[][] {
//                {0,0,0},
//                {0,0,0}
//        };
//        int[][] filledImage2 = solutionFloodFill.floodFill(image2, 1, 0, 2);
//        for(int row = 0; row < filledImage2.length; row++){
//            for(int col = 0; col < filledImage2[0].length; col++){
//                System.out.print(filledImage2[row][col] + " ");
//            }
//            System.out.println();
//        }

//        TreeNode helper = new TreeNode(0);
////        int[] vals = {6,2,8,0,4,7,9,3,5};
//        int[] vals = {6,2,8,0,4,7,9,3,5};
//        TreeNode root = helper.populateBST(vals);
//
//        SolutionLCABST solutionLCABST = new SolutionLCABST();
//        System.out.println(solutionLCABST.lowestCommonAncestor(root, new TreeNode(2), new TreeNode(8)));
//
//        System.out.println(solutionLCABST.isBST(root));

//        SolutionCycledLinkList solutionCycledLinkList = new SolutionCycledLinkList();
//        ListNode listNode = ListNode.populateList(new int[] {3,2,0,-4});
//        System.out.println(solutionCycledLinkList.hasCycle(listNode));

        MyQueue queue = new MyQueue();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);

        System.out.println(queue.pop());
        System.out.println(queue.pop());

        System.out.println(queue.peek());
        System.out.println(queue.pop());

        System.out.println(queue.empty());

        MyQueue queue2 = new MyQueue();
        queue2.push(1);
        System.out.println(queue2.peek());
    }
}