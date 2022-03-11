import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> linkedList=new LinkedList<>();

        String filePath="C:/Users/sreen/Desktop/Pgms/test.txt";
        String words[]=linkedList.readFile(filePath);

        for(int i=0;i<words.length;i++){
            linkedList.add(words[i]);
        }

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter word : ");
        String search=sc.next();

        if(linkedList.search(search)){
            System.out.println("Word is already present in linked list");
        }else {
            linkedList.writeFile(new String[]{search},filePath);
            System.out.println("Word Added");
        }
    }
}
