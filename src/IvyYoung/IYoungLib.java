package IvyYoung;

public class IYoungLib {
    public static String dateStr(String str){
        String month = str.substring(0,2);
        String day = str.substring(3,5);
        String year = str.substring(6,8);
        return day+"-"+month+"-"+year;
    }
    public static int sumUpTo(int num) {
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum = sum + i;
        }
        return sum;
    }
    public static String multiplicationTable(int base, int range){
        String result = "";
        for(int i=0; i<=range; i++){
            result = result + base*i +" ";
        }
        return result;
    }
    public static String fooBarBaz(int num1){
        String result = "";
        for(int i=1; i<=num1; i++){
            if(i%15==0) {
                result = result + "baz, ";
            }
            else if(i%5==0){
                result = result + "bar, ";
            }
            else if(i%3==0) {
                result = result + "foo, ";
            }
            else{
                result = result + i + ", ";
            }
        }
        return result;
    }
    public static boolean isPalindrome(String str){
        String newStr = "";
        for (int i=0; i<str.length(); i++){
            newStr = newStr + str.substring(str.length()-i-1, str.length()-i);
        }
        if (newStr.equals(str)) {
            return true;
        }
        else
        {
            return false;
        }
    }




}