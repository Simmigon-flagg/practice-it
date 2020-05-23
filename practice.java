import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.List;
import java.util.Map;

public class practice {
    static int[][] matrix = { { 2, 7, 6 }, { 9, 5, 1 }, { 4, 3, 8 } };
    static int[] numbers1 = { 5, 2, 4, 9, 3, 6, 2, 1, 11, 1, 10, 4, 7, 3 };
    static int[] numbers2 = { 5, 2, 4, 9, 3, 6, 2, 1, 11, 1, 10, 7, 3, 4 };
    int element = 0;
    int start = 5;
    int end = 13;
    public static void main(String[] args) {
        clear();
        //Simmigon is the man!
        Map<String, String > map = new TreeMap<String,String>();
        Map<String, String > results = new TreeMap<String,String>();
        // {two=deux, five=cinq, one=un, three=trois, four=quatre}
        //{siskel=ebert, girl=boy, heads=tails, ready=begin, first=last, begin=end}
        map.put("skate","board");
        map.put("skate","chicken");
        System.out.println(map);
        // map.put("drive","car");
        // map.put("program","computer");
        // map.put("play","computer");
  
        // map.put("siskel","ebert");
        // map.put("girl","boy");
        // map.put("heads","tails");
        // map.put("ready","begin");
        // map.put("first","last");
        // map.put("begin","end");

        for(String key : map.keySet()){
            if(key.compareTo(map.get(key)) < 0 ){
                results.put(key, map.get(key));
            }else{
                results.put(map.get(key), key);
                // System.out.println(string + " " + string.compareTo(stringMap.get(string)));

            }
        }
  //   System.out.println(results);

    }
    public static void mapM(Map<String , String> map){
        

    }

    public static void printingthing(int [] numbers1){
       

        for(int i =0; i < 10; i++){

            System.out.println("numbers[i] = " +numbers1[i] );
        }
    }

    public static void letterOccurance(String string, String[] array) {
        int[] tally = new int[26];
        System.out.println(Arrays.toString(tally));

        for (int i = 0; i < string.length(); i++) {
            System.out.println((int) string.charAt(i) - 97);
            tally[(int) string.charAt(i) - 97]++;
        }

        System.out.println(Arrays.toString(tally));
    }
    public static void letterOccuranceMax(String string, String[] array) {
        int[] tally = new int[26];
        System.out.println(Arrays.toString(tally));

        for (int i = 0; i < string.length(); i++) {
            System.out.println((int) string.charAt(i) - 97);
            tally[(int) string.charAt(i) - 97]++;
        }

        System.out.println(Arrays.toString(tally));
    }
    public static void letterOccuranceMin(String string, String[] array) {
        int[] tally = new int[26];
        System.out.println(Arrays.toString(tally));

        for (int i = 0; i < string.length(); i++) {
            System.out.println((int) string.charAt(i) - 97);
            tally[(int) string.charAt(i) - 97]++;
        }

        System.out.println(Arrays.toString(tally));
    }
    public static void firstOccurance(String string, String[] array) {
        int[] tally = new int[26];
        System.out.println(Arrays.toString(tally));

        for (int i = 0; i < string.length(); i++) {
            System.out.println((int) string.charAt(i) - 97);
            tally[(int) string.charAt(i) - 97]++;
        }

        System.out.println(Arrays.toString(tally));
    }
    public static void lastOccurance(String string, String[] array) {
        int[] tally = new int[26];
        System.out.println(Arrays.toString(tally));

        for (int i = 0; i < string.length(); i++) {
            System.out.println((int) string.charAt(i) - 97);
            tally[(int) string.charAt(i) - 97]++;
        }

        System.out.println(Arrays.toString(tally));
    }

    public static List<Integer> alternate(List<Integer> alist, List<Integer> blist) {
        // Create an iterator

        Iterator<Integer> arator = alist.iterator();
        Iterator<Integer> brator = blist.iterator();
        List<Integer> clist = new LinkedList<Integer>();
        while (arator.hasNext() || brator.hasNext()) {

            if (arator.hasNext()) {
                clist.add(arator.next());
            }
            if (brator.hasNext()) {
                clist.add(brator.next());
            }
        }

        return clist;
    }

    public static ArrayList<Integer> failedinterleave(ArrayList<Integer> alist, ArrayList<Integer> blist) {
        System.out.println("A: " + alist.size() + " " + alist);
        System.out.println("B: " + blist.size() + " " + blist);
        System.out.println("This fails when alist is bigger then blist.");
        System.out.println("B: " + blist.size() + " " + blist);

        int tranfer = alist.size();
        for (int i = alist.size() - 1; i >= 0; i--) {
            alist.add(i + 1, blist.get(i));
        }
        for (int i = tranfer; i < blist.size(); i++) {
            alist.add(blist.get(i));
        }

        System.out.println("A: " + alist.size() + " " + alist);
        System.out.println("B: " + blist.size() + " " + blist);
        System.err.println(alist);
        return alist;
    }

    public static ArrayList<Integer> interleave(ArrayList<Integer> alist, ArrayList<Integer> blist) {
        System.out.println("A: " + alist.size() + " " + alist);
        System.out.println("B: " + blist.size() + " " + blist);
        int tranfer = Math.min(alist.size(), blist.size());

        for (int i = 0; i < tranfer; i++) {
            System.out.println(i);
            alist.add(2 * i + 1, blist.get(i));
        }
        for (int i = tranfer; i < blist.size(); i++) {
            System.out.println(i);
            alist.add(blist.get(i));
        }

        System.out.println("A: " + alist.size() + " " + alist);
        System.out.println("B: " + blist.size() + " " + blist);
        System.err.println(alist);
        return alist;
    }

    public static ArrayList<String> markLength4(ArrayList<String> list) {

        for (int i = 0; i < list.size(); i++) {

            String str = list.get(i);

            if (str.length() == 4) {

                list.add(i, "****");

                i += 2;

            }
        }

        return list;
    }

    public static ArrayList<Integer> removeInRange(ArrayList<Integer> list, int element, int start, int end) {
        ArrayList<Integer> singleelement = new ArrayList<Integer>();
        singleelement.add(element);

        System.out.println(list.subList(start, end).removeAll(singleelement));
        System.out.println(list);
        return list;
    }

    public static void mystery3(ArrayList<Integer> list) {
        for (int i = list.size() - 2; i > 0; i--) {
            int a = list.get(i);
            int b = list.get(i + 1);
            System.out.println("Happen or nah");
            list.set(i, a + b);
        }
    }

    public static void ArrayListMystery1(ArrayList<Integer> list) {
        for (int i = list.size() - 1; i > 0; i--) {
            if (list.get(i) < list.get(i - 1)) {
                int element = list.get(i);
                list.remove(i);
                list.add(0, element);
            }
        }
        System.out.println(list);
        /*
         * [8,2,9,7,4] [-1, 3, 28, 17, 9, 33] [ 0, 1, 2, 3, 4, 5]5 [33,-1, 3, 28, 17, 9,
         * 33,17]4 [33,-1, 3, 28, 17, 9, 33,17]3 [28, 33,-1, 3, 28, 17, 9, 33,17]2 [28,
         * 33,-1, 3, 28, 17, 9, 33,17, -1]2 [28, 33,-1, 3, 28, 17, 9, 33,17, -1]1
         * [33,28, 33,-1, 3, 28, 17, 9, 33,17, -1]0 [33,28, 33,-1, 3, 28, 17, 9, 33,17,
         * -1,33]
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         */

    }

    public static void arrayList_Strings() {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Marty");
        names.add("Kevin");
        names.add("Vicki");
        names.add("Larry");
        System.out.println(names.get(0).length()); // okay
        System.out.println(names.get(3)); // okay

    }

    public static void nestedLoopsNumbers() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= 10 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (i % 2 == 1) {
                    System.out.print(i);

                }
            }
            System.out.println();
        }
    }

    public static void nestedLoops() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static boolean isMagicSquare(int a[][]) {

        int backward = 0;
        int forward = 0;
        int rtotal = 0;
        int ctotal = 0;
        for (int i = 0; i < a.length; i++) {
            int rowTotal = 0;
            int colTotal = 0;

            for (int j = 0; j < a[0].length; j++) {
                rowTotal += a[i][j];
                colTotal += a[j][i];
                if (i == j) {
                    // System.out.print(a[i][j] + " ");
                    backward += a[i][j];
                    // System.out.println();
                }
                if (a[0].length - i - 1 == j) {
                    // System.out.println(a[0].length - i - 1 + " " + j);
                    forward += a[i][j];
                }
                // if(== a.length){

                // }
            }

            rtotal = rowTotal;
            ctotal = colTotal;

        }

        System.out.println(rtotal);
        System.out.println(ctotal);
        System.out.println(backward);
        System.out.println(forward);
        System.out.println();
        System.out.println("Matrix");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        if (rtotal != ctotal && backward != forward) {
            return false;
        }
        return true;

    }

    public static int[] evenBeforeOdd(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr));

            if (arr[i] % 2 == 1) {

                for (int j = arr.length - 1; j >= 0; j--) {
                    if (arr[j] % 2 == 0) {
                        System.out.println(arr[i] + " at index " + i + " is moved to " + arr[j] + " at index " + j);
                        int temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                        i++;
                        break;
                    }
                }
            }
        }
        return arr;
    }

    public static int[] collapse(int[] a) {
        int[] results;
        if (a.length % 2 == 0) {
            results = new int[a.length / 2];
        } else {
            results = new int[a.length / 2 + 1];
        }
        for (int i = 0; i < a.length - 1; i += 2) {

            results[i / 2] = a[i] + a[i + 1];
        }
        if (a.length % 2 == 1) {
            results[results.length - 1] = a[a.length - 1];
        }

        return results;
    }

    public static int priceIsRight(int bids[], int price) {
        int min = Integer.MIN_VALUE - 1;

        int index = -1;
        System.out.println("Bids: " + Arrays.toString(bids) + " Price " + price);

        for (int i = 0; i < bids.length; i++) {
            //System.out.println(bids[i] + " index " + i);
            System.out.println(price + " - " + bids[i] + " = " + (price - bids[i]));
            int closest = price - bids[i];
            if (closest >= 0 && closest < min) {

                min = closest;
                index = i;

            }

        }
        System.out.println(bids[index]);
        return bids[index];
    }

    public static boolean isUnique(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] == arr[j + 1]) {
                    return false;
                }
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        return true;
    }

    public static int median(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr));
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;

                }

            }
            System.out.println();

        }

        int median = (arr.length - 1) / 2;
        System.out.println(arr[median]);
        return arr[median];
    }

    public static int kthLargest(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr));
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;

                }

            }
            System.out.println();

        }
        System.out.println(arr[k]);
        return arr[k];
    }

    public static int mode(int[] numbers) {
        int[] tally = new int[51];
        int max = Integer.MAX_VALUE + 1;
        for (int i = 0; i < numbers.length; i++) {
            tally[numbers[i]]++;
        }
        int index = -1;
        System.out.println(Arrays.toString(tally));
        for (int i = tally.length - 1; i >= 0; i--) {
            if (max <= tally[i]) {
                max = tally[i];
                index = i;

            }
        }
        for (int i = 0; i < tally.length; i++) {
            System.out.print(" Found: " + i + " times " + tally[i]);
            System.out.println();

        }
        System.out.println(index);

        return index;
    }

    public static void createJagged() {
        int[][] jagged = new int[5][];
        int value = 1;
        for (int i = 0; i < 5; i++) {
            jagged[i] = new int[i + 1]; // the array can be initialized here
            System.out.println(i + 1);
            for (int j = 0; j < i + 1; j++) {
                jagged[i][j] = value; // assign the value here
                value++;
            }
        }
    }

    public static void copyColumn(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (j == 2) {
                    System.out.print(matrix[i][j] + " ");
                    matrix[i][5] = matrix[i][j];

                }
                if (j == 5) {
                    System.out.print(matrix[i][j] + " ");

                }
            }
            System.out.println();
        }
        System.out.println(Arrays.toString((matrix[0])));
    }

    public static void arrayMyster5(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            System.out.println(nums[i] > nums[i + 1]);
            if (nums[i] > nums[i + 1]) {
                nums[i + 1]++;
            }
        }

    }

    public static boolean isAllVowel(String a) {
        String singleletter = a.toLowerCase();
        if (singleletter.length() == 0) {
            return true;

        }
        int count = 0;
        char[] vowel = { 'a', 'e', 'i', 'o', 'u' };

        for (int index = 0; index < singleletter.length(); index++) {
            System.out.println("==========================: ");
            for (int i = 0; i < vowel.length; i++) {
                if (singleletter.charAt(index) == vowel[i]) {
                    count++;
                }
            }
        }
        if (count == singleletter.length()) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean isVowel(String a) {
        String singleletter = a.toLowerCase();
        String[] vowel = { "a", "e", "i", "o", "u" };
        for (int i = 0; i < vowel.length; i++) {
            if (singleletter.contains(vowel[i])) {
                return true;
            }
        }
        return false;
    }

    public static int swapDigitPairs(int n) {
        int results = 0;
        int original = n;
        int place = 1;
        int count = 0;
        while (n > 0) {

            System.out.println("Number: " + n);
            int last_number = n % 10;
            System.out.println("Remove: " + last_number);
            int whatleft = n / 10;
            System.out.println("what's Letf: " + whatleft);
            if (n != 0) {
                for (int i = 1; i < 2; i++) {
                    System.out.println(place);
                    place *= 10;
                    System.out.println(place);

                }
            }

            n /= 10;

        }

        return results;
    }

    public static int testswapDigitPairs(int n) {
        int results = 0;
        int original = n;
        int place = 1;

        while (n > 0) {

            int swapthese = n % 100;
            System.out.println("Before: " + swapthese);
            int a = swapthese % 10;
            int b = swapthese / 10;
            if (swapthese > 10) {
                int swapped = a * 10 + b;
                System.out.println(swapped);
                System.out.println(place);
                System.out.println(swapped * place);
                results += swapped * place;
                place *= 100;
            } else {
                results += swapthese * place;

            }

            n /= 100;

        }

        System.out.println("original: " + original);
        System.out.println("Results: " + results);
        return results;
    }

    public static void factors(int n) {
        System.out.print("Perfect numbers up to " + n + ": ");
        for (int i = 1; i <= n; i++) {

            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    // System.out.println("Factor (" + j + ") ");
                    sum += j;
                }
            }
            // System.out.println("Sum of factors " + sum);
            // System.out.println("Does Sum of factors " + i + " = " + sum + " (" + (sum ==
            // i) + ")");
            if (sum == i) {
                System.out.print(sum + " ");
            }

        }

    }

    public static int countFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(" Factor (" + i + ") ");
                count++;
            }
        }

        return count;
    }

    public static int wordCount(String str) {
        boolean start = true;

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) != ' ' && start) {

                start = false;
                count++;
            }
            if (str.charAt(i) == ' ') {
                start = true;
            }
        }

        return count;
    }

    public static String printPalindrome() {
        String str = "madan";

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i) + " = " + str.charAt(str.length() - i - 1));
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {

                return str + " is not a palindrome.";
            }
        }

        return str + " is a palindrome!";

    }

    public static double pow2(double n1, double n2) {
        double power = 1.0;
        for (int i = 1; i <= n2; i++) {
            System.out.print(n1 + " ");
            power *= (double) n1;
            System.out.println(power);
        }
        return power;
    }

    public static void dum() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a student record: ");
        String name = console.nextLine();
        int numbers = console.nextInt();
        int total = 0;
        for (int i = 1; i < numbers; i++) {
            total += console.nextInt();
        }
        double avg = (double) total / numbers;

        System.out.println(name + "'s grade is " + avg);

    }

    public static void xo(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 1; j <= size; j++) {

                if (j == i + 1 || j == size - i) {
                    System.out.print("x");
                } else {
                    System.out.print("o");
                }
            }

            System.out.println();

        }
    }

    public static String repl(String message, int number) {
        if (number != 0) {
            for (int i = 0; i < number; i++) {
                System.out.println(i);
                message += message;
            }
        }
        System.out.println(message);
        return message;
    }

    public static String lastFirst(String name) {
        String lastFirst = "";

        int space = 0;
        for (int i = 0; i < name.length(); i++) {
            Character letter = name.charAt(i);
            if (!Character.isLetter(letter)) {
                space = i;
            }
        }

        return name.substring(space + 1, name.length()) + ", " + name.substring(0, 1) + ".";
    }

    public static char[] createAlphabet() {
        char[] alphabets = new char[26];
        for (char letter = 'a', i = 0; letter <= 'z'; letter++, i++) {

            alphabets[i] = letter;
        }
        return alphabets;
    }

    public static void oddsNumber(int[] number) {
        int[] odds = new int[number.length / 2];
        int size = number.length / 2;
        int count = 0;
        for (int i = 0; i < number.length; i++) {
            System.out.print("[" + i + "] ");
            if (number[i] % 2 != 0) {

                System.out.print("Found Odd: " + number[i] + " at index " + i + " insert at " + (count));
                odds[count] = number[i];
                count++;

            }
            System.out.println();
        }
        System.out.println(Arrays.toString(odds));
    }

    public static void test() {
        System.out.println(123456789);
        System.out.println(669260267 / 10);
    }

    public static int[] testmemory(int n) {
        int[] a = { 1, 2, 3, 4, 5, 79 };
        int[] b = a;
        b[b.length - 1] = 6;
        System.out.println(Arrays.toString(a));
        return a;
    }

    public static void repeat(int n) {
        for (int i = 1; i <= n; i++) {
            // System.out.print(i + " ");
            System.out.print((7 / 2) + " ");
            if (i % 10 == 0) {
                System.out.println();

            }
        }
    }

    public static int digitRange(int n) {

        int min = Integer.MIN_VALUE - 1;
        int max = Integer.MAX_VALUE + 1;
        int countdigit = 0;
        while (n > 0) {

            int temp = n % 10;
            n /= 10;

            if (temp >= max) {
                max = temp;

            }
            if (temp <= min) {
                min = temp;
            }
            countdigit++;

        }

        if (countdigit <= 1) {
            return 1;
        } else {

            return max + min + 1;
        }

    }

    public static int missingnumber() {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 9, 10 };
        for (int i = 0; i < a.length; i++) {
            System.out.println((i + 1) != a[i]);
            if ((i + 1) != a[i]) {
                return i + 1;
            }
        }
        return -1;
    }

    public static int reverseDigit(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }

        System.out.println(rev);
        return rev;
    }

    public static int digitSum(int n) {
        System.out.println(n);
        n = Math.abs(n);

        int temp = n;
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        for (int i = 1; i < count; i++) {
            temp /= 10;
        }

        return temp;
    }

    public static boolean dominant(int a, int b, int c) {
        boolean found = false;
        if (a + b < c) {
            System.out.println(a + b + " = " + c);
            found = true;

        }
        if (a + c < b) {
            System.out.println(a + c + " = " + b);

            found = true;

        }
        if (b + c < a) {

            System.out.println(b + c + " = " + a);

            found = true;
        }

        return found;

    }

    public static boolean consecutive(int a, int b, int c) {

        /** Sort Numbers */
        if (a == b || b == c) {
            return false;
        }

        System.out.println("a " + a + " b " + b + " c " + c);
        if ((a < b) && (b < c)) {

            System.out.println("The sorted numbers are " + a + " " + b + " " + c);
            if (a + 1 == b && a + 2 == c) {

                return true;
            } else {
                return false;
            }
        }
        if ((a > b) && (b > c)) {

            System.out.println("The sorted numbers are " + a + " " + b + " " + c);
            if (a + 1 == b && a + 2 == c) {

                return true;
            } else {
                return false;
            }
        }
        if ((a < b) && (b > c)) {

            System.out.println("The sorted numbers are " + c + " " + a + " " + b);
            System.out.println("Changed");
            if (c + 1 == a && c + 2 == b) {
                return true;
            } else {
                return false;
            }
        }
        if ((a > b) && (b > c)) {
            System.out.println("The sorted numbers are " + c + " " + b + " " + a);
            if (c + 1 == b && c + 2 == a) {

                return true;
            } else {
                return false;
            }
        }
        if ((a > b) && (b < c)) {
            System.out.println("The sorted numbers are " + b + " " + c + " " + a);
            System.out.println("changed");
            if (b + 1 == c && b + 2 == a) {
                return true;
            } else {
                return false;
            }
        }

        return true;
    }

    public static void threeheads() {
        int count = 0;
        Random rand = new Random();
        String message = "";
        while (count != 3) {
            int value = rand.nextInt(2) + 1;

            if (value == 1) {
                count++;
                message += "H ";
                System.out.print(message);
            } else {
                count = 0;
                message += "T ";
                System.out.print(message);
            }

        }
    }

    public static void prime(int max) {
        if (max >= 3) {
            System.out.print("Prime (2)");
            for (int i = 3; i <= max; i++) {
                if (countFactors(i) == 2) {

                    System.out.print(" Prime (" + i + ") ");
                }
            }
        }
    }

    public static void doWhileSeashore(Scanner console) {
        String answer;
        do {

            System.out.println("She sells seashells by the seashore.");
            System.out.print("Do you want to hear it again? ");
            answer = console.nextLine();
        } while ("y".contains(answer));
    }

    public static void printAverage(Scanner console) {
        int grade = 0;
        int nogrades = -1;
        int sum = 0;
        do {
            System.out.println("Type a number: ");
            grade = console.nextInt();
            nogrades++;

            if (grade > -1) {
                sum += grade;
            }
        } while (grade > -1);
        System.out.println(sum);
        System.out.println(nogrades);

        if (nogrades != 0) {
            double avg = (double) sum / nogrades;
            System.out.println("Average was: " + avg);
        }
    }

    public static void makeGuesses() {
        Random rand = new Random();
        int totalguess = 0;
        int r = 0;

        do {
            r = rand.nextInt(50) + 1;
            totalguess++;
            System.out.println("guess = " + r);

        } while (r <= 48);
        System.out.println("total guesses = " + totalguess);
    }

    public static void randomLines() {
        Random rand = new Random();
        int r = rand.nextInt(6) + 5;
        for (int i = 1; i <= r; i++) {
            int col = rand.nextInt(80) + 1;
            for (int j = 1; j <= col; j++) {

                char c = (char) (rand.nextInt(26) + 'a');
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void randomX() {
        Random rand = new Random();
        int r = 0;
        do {
            r = rand.nextInt(15) + 5;

            for (int i = 1; i <= r; i++) {
                System.out.print("x");
            }
            System.out.println();

        } while (r <= 16);
    }

    public static String toBinary(int number) {
        String str = "";
        String result = "";
        if (number != 0) {
            while (number != 0) {
                str += Integer.toString(number % 2);
                number /= 2;
            }
            int length = str.length();

            for (int i = length - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
        } else {
            result = "0";
        }

        return result;
    }

    public static int linearSearch(int values[], int target, int n) {
        for (int i = 0; i < n; i++) {
            if (values[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int whileloop(int x, int y) {
        /*
         * x = 3, y = 3 test 3 != 0 true and 3 != 0 true S = True 3 < 3 false x: 3-3 = 0
         * test 0 != 0 false exit while return 3
         * 
         * x = 5 y = 3 test 5 != 0 and 3 != 0 true 5 < 3 false x:2 5 - 3 return 5
         * 
         * 
         * x = 2, y = 6 test 2 != 0 true and 6 != 0 true loop true 2 < 6 true y:4 6 - 2
         * 
         * test 2 != 0 true and 4 != 0 true loop true 2 < 4 true y:2 4 - 2
         * 
         * test 2 != 0 and 2 != 0 true loop true 2 < 2 false x:0 2 - 2 test 0 != 0 false
         * exit loop return
         * 
         * 
         * x = 12 , x = 18
         * 
         * test 12 != 0 true 18 != 0 true loop true 12 < 18 true y:6 18 - 12
         * 
         * test 12 != 0 true and 6 != 0 true loop true 12 < 6 false x:6 12 - 6 test 6 !=
         * 0 true and 6 != 0 true loop true 6 < 6 false x:0 6-6
         * 
         * test 0 != 0 false return 0 + 6 = 6
         * 
         * x = 30, y = 75
         * 
         * test 30 != 0 true and 75 != 0 true loop true 30 < 75 true y:45 75 - 30 30 !=
         * 0 true and 45 != 0 true loop true 30 < 45 true y:15 45 - 30 test 30 != 0 true
         * and 15 != 0 true loop true 30 < 15 false x:15 30 - 15 test 15 != 0 true and
         * 15 != 0 true loop true 15 < 15 false x:0 15 - 15 test 0 != 0 false return 0 +
         * 15
         * 
         * 
         */

        while (x != 0 && y != 0) {
            if (x < y) {
                System.out.println(true);
                y = y - x;
            } else {
                x = x - y;
                System.out.println(false);
            }
        }
        System.out.println(x + y);
        return x + y;
    }

    public static void doWhileLoops(String str) {
    }

    public static void oddoreven() {
        Scanner in = new Scanner(System.in);
        System.out.print("low?");
        String slow = in.nextLine();

        int low = Integer.parseInt(slow);

        if (low % 2 == 0) {

            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }

    public static void printIndexed(String str) {
        String[] arr = str.split("");
        int size = arr.length;
        for (int forward = 0, backward = arr.length - 1; forward < size; forward++) {
            System.out.print(arr[forward]);
            System.out.print(backward--);
        }
    }

    public static void printReverse(String str) {
        String[] arr = str.split("");
        System.out.print(arr);
        for (int i = arr.length - 1; i >= 1; i--) {
            System.out.print(arr[i]);
        }
    }

    public static void SumNumbers() {
        Scanner in = new Scanner(System.in);
        System.out.print("low?");
        String slow = in.nextLine();
        System.out.print("high?");
        String shigh = in.nextLine();

        int low = Integer.parseInt(slow);
        int high = Integer.parseInt(shigh);

        int sum = 0;
        for (int i = low; i <= high; i++) {
            sum += 1;
        }
        System.out.println("sum = " + sum);

    }

    public static int promptMultiplyBy2() {
        final Scanner in = new Scanner(System.in);
        System.out.println(in);
        final String s = in.nextLine();
        final int result = Integer.parseInt(s);
        System.out.println();
        return result * 2;

    }

    public static void stringExpression() {
        // System.out.println(countQuarters(64));

        final String str1 = "ARCTURAN MEGADONKEY";
        str1.charAt(7);

        System.out.println(str1.substring(10, 14));

    }

    public static int countQuarters(int cent) {
        // System.out.println(countQuarters(64));
        int count = 0;
        while (cent >= 100) {
            count++;
            cent %= 100;

        }
        return cent / 25;
    }

    public static void clear() {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

    }
}