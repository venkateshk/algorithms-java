package hackerrank.datastructure.likedlist;

public class InsertANodeAtTheHeadOfALinkedList {

    Node Insert(Node head,int x) {
        Node newNode = new Node();
        newNode.data = x;
        newNode.next = head;
        return newNode;
    }

}
