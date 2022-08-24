import java.util.Arrays;
public class anagramsol {
    public static void main(String[] args) {
        
        String str1 = "Race";
        String str2 = "Care";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length() == str1.length()){

            char[] str1chararray = str1.toCharArray();
            char[] str2chararray = str2.toCharArray();

            Arrays.sort(str1chararray);
            Arrays.sort(str2chararray);

            boolean res = Arrays.equals(str1chararray, str2chararray);

            if(res){
                System.out.println("strings are anagram");

            }
            else{
                System.out.println("Strings are not anagram");
            }
        }
        


    }
}
