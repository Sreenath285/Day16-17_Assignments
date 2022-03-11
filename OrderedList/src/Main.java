import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        OrderedList<Integer> list=new OrderedList<Integer>();
        String filePath="C:/Users/sreen/Desktop/Pgms/test.txt";
        String num[]=LinkedList.readFile(filePath);
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<num.length;i++){
            System.out.println(num[i]);
            list.add(Integer.parseInt(num[i]));
        }
        System.out.println("Enter number : ");
        int numSearch=sc.nextInt();
        if(list.search(numSearch)){
            System.out.println("Number is present");
            list.pop(numSearch);
        } else {
            System.out.println("Number added");
            list.add(numSearch);
        }

        num=new String[list.size()];
        for(int i=0;i<list.size();i++){
            num[i]=String.valueOf(list.get(i));
            System.out.println(num[i]);
        }
        LinkedList.writeFile(num, filePath);
    }
}
