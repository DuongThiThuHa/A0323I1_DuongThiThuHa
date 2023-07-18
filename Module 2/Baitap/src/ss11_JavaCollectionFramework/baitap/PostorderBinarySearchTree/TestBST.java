package ss11_JavaCollectionFramework.baitap.PostorderBinarySearchTree;

public class TestBST {
    public static void main(String[] args) {
        //create a BST
        BST<String> tree = new BST<>();
        tree.insert("TH");
        tree.insert("MH");
        tree.insert("DH");
        tree.insert("AQ");
        //traverse tree
        System.out.println("Sap xep theo thu tu: ");
        tree.inorder();
        System.out.println("So luong nut la: " + tree.getSize());
    }
}
