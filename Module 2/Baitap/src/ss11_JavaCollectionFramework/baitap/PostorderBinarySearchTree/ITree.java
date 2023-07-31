package ss11_JavaCollectionFramework.baitap.PostorderBinarySearchTree;

public interface ITree<E> {
    boolean insert(E e);

    void inorder();

    int getSize();
}
