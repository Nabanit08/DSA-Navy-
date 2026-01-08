import java.util.Scanner;

class CountVowels{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.println(countVowels(str));
    }

    private static int countVowels(String str){

        String lowerCaseStr = str.toLowerCase();
        
        int len = str.length();

        int count = 0;

        for(int i = 0 ; i < len ; i++){
            if(lowerCaseStr.charAt(i) == 'a' ||
            lowerCaseStr.charAt(i) == 'e' ||
            lowerCaseStr.charAt(i) == 'i' ||
            lowerCaseStr.charAt(i) == 'o' ||
            lowerCaseStr.charAt(i) == 'u') count++;
        }

        return count;

    }
}