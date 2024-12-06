public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Shekels : " + lowerCase("This costs 15 Shekels"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); 
        System.out.println(contains("happy", "unhappy")); 
        System.out.println(contains("historical", "story")); 
        System.out.println(contains("psychology", "psycho")); 
        System.out.println(contains("personality", "son")); 
        System.out.println(contains("personality", "dad")); 
        System.out.println(contains("resignation", "sign")); 
    }

    public static String lowerCase(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result.append((char) (ch + ('a' - 'A')));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static boolean contains(String str1, String str2) {
        return str1.contains(str2);
    }
}
