//    1)	 Задача на лайв-кодинг
//    Напишите программу, которая переворачивает массив.
//    2)	Задача на лайв-кодинг
//    Напишите Java-программу для удаления всех пробелов из строки с помощью replace().

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str = "H e l l o wo r l d!";
        int[] nums = {1, 2, 3, 4, 5, 6, 7};

        System.out.println(Arrays.toString(reversInt(nums)));
        System.out.println(dellWhiteSpase(str));


    }
    public static int[] reversInt (int[] nums){
        int[] numsRewers = new int[nums.length];
        int a =0;
        for (int i = nums.length - 1; i >= 0; i--) {
            numsRewers[a] = nums[i];
            a++;
        }
        return numsRewers;
    }
    public static String dellWhiteSpase (String str){
        return str.replace(" ", "");
    }


}