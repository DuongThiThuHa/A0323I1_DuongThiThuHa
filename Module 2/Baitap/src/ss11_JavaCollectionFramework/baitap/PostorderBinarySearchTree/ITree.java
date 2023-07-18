package ss11_JavaCollectionFramework.baitap.PostorderBinarySearchTree;

public interface ITree<E> {
    public boolean insert(E e);

    public void inorder();

    public int getSize();
}
