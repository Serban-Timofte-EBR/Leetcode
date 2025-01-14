package eu.learn.ro;

public class Main {
    public static void main(String[] args) {
        Utils utils = new Utils();

        ListNode head = null;

        head = utils.insertNode(head, 1);
        head = utils.insertNode(head, 2);
        head = utils.insertNode(head, 3);
        head = utils.insertNode(head, 4);
        head = utils.insertNode(head, 5);

        System.out.println("The list is:");
        utils.printList(head);

//        head = utils.reverseList(head);
//        System.out.println("The reversed list is:");
//        utils.printList(head);

        head = utils.reverseListRecursive(head);
        System.out.println("The reversed list is:");
        utils.printList(head);
    }
}