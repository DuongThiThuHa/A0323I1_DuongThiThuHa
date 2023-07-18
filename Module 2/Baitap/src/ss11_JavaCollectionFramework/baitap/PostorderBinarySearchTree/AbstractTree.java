package ss11_JavaCollectionFramework.baitap.PostorderBinarySearchTree;

public class AbstractTree <E> implements ITree<E> {
    @Override
    public boolean insert(E e) {
        return false;
    }

    public void inorder(){}

    @Override
    public int getSize() {
        return 0;
    }
}
