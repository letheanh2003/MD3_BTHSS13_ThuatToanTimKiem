package BTH1_ThuatToanTimKiem;

public class BinarySearchTest {
    public static void main(String[] args) {
        BST_Binary bst = new BST_Binary();
     /* BST tree example
              45
           /     \
          10      90
         /  \    /
        7   12  50   */
    // insert data into BST
        bst.insert(45);
        bst.insert(10);
        bst.insert(7);
        bst.insert(50);
        bst.insert(90);
        bst.insert(20);
        bst.insert(55);
        //print the BST
        System.out.println("BST Được tạo với dữ liệu đầu vào (Trái-gốc-phải):");
        bst.inorder();

        //delete leaf node
        System.out.println("\nBST sau khi xóa nút 12(nút lá):");
        bst.deleteKey(12);
        bst.inorder();
        //delete the node with one child
        System.out.println("\nBST sau Khi Delete 90 (node có 1 con):");
        bst.deleteKey(90);
        bst.inorder();

        //delete node with two children
        System.out.println("\nBST sau Delete 45 (Node có 2 con):");
        bst.deleteKey(45);
        bst.inorder();
        //search a key in the BST
        boolean ret_val = bst.search (50);
        System.out.println("\nKhóa 50 được tìm thấy trong BST:" + ret_val );
        ret_val = bst.search (12);
        System.out.println("\nKhóa 12 được tìm thấy trong BST:" + ret_val );
    }
}