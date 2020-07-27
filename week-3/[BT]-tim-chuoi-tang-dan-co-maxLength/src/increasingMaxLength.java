import java.util.LinkedList;
import java.util.Scanner;

public class increasingMaxLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = scanner.nextLine();

        LinkedList<Character> max = new LinkedList<>();

        for(int i=0;i<string.length()-1;i++){
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            for(int j=i+1;j<string.length();j++){
                if(string.charAt(j)>list.getLast()){
                    list.add(string.charAt(j));
                }
            }
            if(list.size()>max.size()){
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
       for(char x: max){
           System.out.print(x);
       }
    }
}