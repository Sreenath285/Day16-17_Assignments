import java.io.*;

public class NodeUtility {

    String[] stringArray;
    int[] intArray;
    BufferedReader br;


    public Node readFile(Node start)
    {
        try
        {
            FileInputStream fis = new FileInputStream("C:\\Users\\sreen\\Desktop\\Pgms\\Integer.txt");
            char ch;
            String word3="";

            while (fis.available() > 0)
            {
                ch = (char) fis.read();
                word3=word3+ch;
            }
            String[] wordsArray=word3.split(" ");
            int[] inputArray=new int[wordsArray.length-1];

            for(int i=0;i<wordsArray.length-1;i++)
            {
                inputArray[i]=Integer.parseInt(wordsArray[i]);
            }
            inputArray=sort(inputArray);

            for(int i =0; i < wordsArray.length-1 ; i++)
            {
                start= addWordsToList(start,inputArray[i]);
            }
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        return start;
    }

    public int inputInteger(){
        try{
            try{
                return Integer.parseInt(br.readLine());
            }
            catch(NumberFormatException nfe){
                System.out.println(nfe.getMessage());
            }
        }catch(IOException ioe){
            System.out.println(ioe.getMessage());
        }
        return 0;
    }

    public int[] integerFileReader()
    {
        try
        {
            String intFile = new String();
            FileReader fr = new FileReader("C:\\Users\\sreen\\Desktop\\Pgms\\Integer.txt");
            BufferedReader br = new BufferedReader(fr);
            String s;

            while((s = br.readLine()) != null)
            {
                intFile += s;
            }

            intFile = intFile.replaceAll("\\n",",");
            intFile = intFile.trim();
            stringArray = intFile.split(",");
            intArray = new int[stringArray.length];

            for(int i=0; i <intArray.length;i++)
            {
                try
                {
                    intArray[i]= Integer.parseInt(stringArray[i]);
                }
                catch(NumberFormatException e)
                {
                    System.out.println(e);
                }
            }
        }
        catch(Exception obj)
        {
            System.out.println(obj.getMessage());
        }
        return intArray;
    }


    public Node addWordsToList(Node node1, int num)
    {
        Node node2=node1;
        Node newNode=new Node();
        newNode.data=num;
        newNode.nextNode=null;

        if(node1==null)
        {
            return newNode;
        }
        else
        {
            while(node1.nextNode!=null)
            {
                node1=node1.nextNode;
            }
            node1.nextNode=newNode;
        }
        return node2;
    }

    public int[] sort(int[] arr )
    {
        int size=arr.length;
        for(int i=size;i>0;i--)
        {
            for(int j=1;j<size;j++)
            {
                if(arr[j-1]>arr[j])
                {
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
            size--;
        }
        return arr;
    }

    public Node search(Node tNode1, int num)
    {
        Node tNode=tNode1;
        if(tNode==null)
        {
            Node newNode=new Node();
            newNode.data=num;
            tNode=newNode;
            return tNode;
        }

        if(tNode.data==num)
        {
            tNode=null;
            return tNode1;
        }

        while(tNode!=null)
        {
            if(tNode.nextNode==null)
            {
                return tNode1;
            }

            if(tNode.nextNode.data==num)
            {
                tNode.nextNode=tNode.nextNode.nextNode;
                return tNode1;
            }
            tNode=tNode.nextNode;
        }
        return tNode1;
    }

}
