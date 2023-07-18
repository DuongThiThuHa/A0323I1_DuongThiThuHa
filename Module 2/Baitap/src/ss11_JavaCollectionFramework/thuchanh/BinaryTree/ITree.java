package ss11_JavaCollectionFramework.thuchanh.BinaryTree;

public interface ITree<E> {
    public boolean insert(E e);

    public void inorder();

    public int getSize();
}
