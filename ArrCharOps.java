public class ArrCharOps {
    public static void main(String[] args) {
        String str = "clearly";
        char[] arr1 = {'c', 'l', 'e', 'a', 'r', 'l', 'y'};
        char[] arr2 = {'U', 'n', 'd', 'e', 'r', 's', 't', 'o', 'o', 'd'};

        System.out.println(str);
        println(arr1);
        System.out.println(charAt(arr1, 2));      
        System.out.println(indexOf(arr1, 'l'));  
        System.out.println(indexOf(arr1, 'l', 3)); 
        System.out.println(lastIndexOf(arr1, 'l'));
        System.out.println(concat(arr1, arr2));
        System.out.println(subArray(arr2, 2, 9));
        System.out.println(hashCode(arr1));
        System.out.println(hashCode(arr2));
    }

    public static void println(char[] arr) {
        for (char c : arr) {
            System.out.print(c);
        }
        System.out.println();
    }

    public static char charAt(char[] arr, int index) {
        return arr[index];
    }

    public static int indexOf(char[] arr, char ch) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ch) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOf(char[] arr, char ch, int fromIndex) {
        for (int i = fromIndex; i < arr.length; i++) {
            if (arr[i] == ch) {
                return i;
            }
        }
        return -1;
    }

    public static int lastIndexOf(char[] arr, char ch) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == ch) {
                return i;
            }
        }
        return -1;
    }

    public static char[] concat(char[] arr1, char[] arr2) {
        char[] result = new char[arr1.length + arr2.length];
        int i = 0;
        for (; i < arr1.length; i++) {
            result[i] = arr1[i];
        }
        for (int j = 0; j < arr2.length; j++) {
            result[i++] = arr2[j];
        }
        return result;
    }

    public static char[] subArray(char[] arr, int beginIndex, int endIndex) {
        char[] result = new char[endIndex - beginIndex];
        for (int i = 0; i < result.length; i++) {
            result[i] = arr[beginIndex + i];
        }
        return result;
    }

    public static long hashCode(char[] arr) {
        long hash = 0;
        long power = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            hash += arr[i] * power;
            power *= 7;
        }
        return hash;
    }
}
