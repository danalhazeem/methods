import java.util.ArrayList;

public class SummationPractice {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(6);
        numbers.add(7);
        numbers.add(4);
        numbers.add(5);
        System.out.println(ArrayListSum(numbers));

    }
    static int ArrayListSum(ArrayList<Integer>   numbers){
        int sum = 0;
        for (int number:numbers){
            sum +=number;
        }
        return sum;
    }
    }