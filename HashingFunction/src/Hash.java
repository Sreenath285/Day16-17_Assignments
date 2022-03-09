public class Hash<T> {

    MyNode<T>[] array = new MyNode[11];
    MyNode<T> next;
    int data;

    public void add(int data) {

        MyNode<T> new_Node = new MyNode(data);
        int index = data % 11;
        if (array[index] == null) {
            array[index] = new_Node;
        } else {
            MyNode<T> temp = array[index];

            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new_Node;
        }
    }

    public void display() {
        System.out.println("Remainder " + "values : ");
        for (int i = 0; i < array.length; i++) {
            MyNode<T> temp = array[i];
            if (temp != null) {
                System.out.print(" [" + i + "]      {");
                while (temp != null) {
                    System.out.print(temp.data + "  ");
                    temp = temp.next;
                }
            }
            System.out.println("}");
        }
    }
}
