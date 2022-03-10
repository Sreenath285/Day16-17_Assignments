public class OrderedList {

    Node start;
    NodeUtility nu=new NodeUtility();

    void getDataFromFile()
    {
        int[] retArray =nu.integerFileReader();
        int[] sortArray =nu.sort(retArray);
        int size =retArray.length;
        for(int i=0;i<size;i++)
        {
            addItem(retArray[i]);
        }
    }

    public void List()
    {
        if(start ==null)
        {
            System.out.println("List is Empty ");
        }
    }

    public void addItem(int data)
    {
        Node head =start;
        Node temp =new Node();
        temp.data =data;
        temp.nextNode =null;
        if(start == null)
        {
            start = temp;
        }
        else
        {
            while(head.nextNode != null)
            {
                head=head.nextNode;
            }
            head.nextNode=temp;
        }
    }

    public  void display()
    {
        Node temp =start;
        while( temp != null)
        {
            System.out.print(temp.data+"-");
            temp=temp.nextNode;
        }
        System.out.println(" ");
    }

    // Size of Function
    public  int size()
    {
        int count=0;
        Node temp =start;
        while( temp.nextNode != null)
        {
            temp=temp.nextNode;
            count++;
        }
        System.out.println("Size : " + count);
        return count;
    }

    public void searchData()
    {
        Node temp = start;
        int count=0;
        System.out.println("Enter number : ");
        int s =nu.inputInteger();
        int flag=0;
        while(temp.nextNode != null)
        {
            count++;
            if( temp.data==s)
            {
                System.out.println("Number found at : " + count);
                flag++;
                break;
            }
            temp=temp.nextNode;
        }

        if(flag == 1)
        {
            removeData(count);
        }
        else
        {
            addItem(s);
            System.out.println("After Adding a List ");
            display();
        }
    }

    // removeWord From a Linked lIst
    void removeData(int count)
    {
        Node temp = start;
        if(count==1)
        {
            start =start.nextNode;
            System.out.println("After Deleting List is ");
            display();
        }
        else
        {
            for(int i=0;i<count-1;i++)
            {
                temp=temp.nextNode;
            }
            temp.nextNode =temp.nextNode.nextNode;
            System.out.println("After Deleting List is ");
            display();
        }
    }

    public static void main(String[] args)
    {
        OrderedList obj = new OrderedList();
        obj.getDataFromFile();
        obj.display();
        obj.size();
        obj.searchData();
    }
}
