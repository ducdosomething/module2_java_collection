package THO1BinarySearchTree;

public interface Tree<E> {

    public boolean insert(E e);

    // Duyệt cây theo thứ tự trung tố (inorder traversal): duyệt trước nút con trái,
    // sau đó duyệt
    // nút gốc, và cuối cùng là duyệt nút con phải
    public void inorder();

    public int getSize();
}
