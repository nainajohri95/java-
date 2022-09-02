public class Recursionsol3 {
    public static void removeduplicate(int idx, String str, StringBuilder newstr, boolean map){
            if(idx == str.length()){
                System.out.println(newstr);
                return;
            }

            char currChar =  str.charAt(idx);
            if(map[currChar-'a'] == true ){
                removeduplicate(idx+1, str, newstr, map);
            }
            else{
                removeduplicate(idx, str, newstr.append(currChar), map);
            }
    }
    public static void main(String[] args) {
        System.out.println(removeduplicate(idx, str, newstr, map););
    }
}
