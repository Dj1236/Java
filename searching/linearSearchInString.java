package searching;

public class linearSearchInString {
    public static void main(String[] args) {
        String str = "dhairya";
        char target = 'u';
        System.out.println(search(str,target));
        // sout (Arrays.toString(name.toCharArray))

    }
    static boolean search(String str ,char target){
        if (str.length()==0) {
            return false;
        }
        /*
         * for(char ch : str.toCharArray()){
         * if(ch ==target) return true 
         * }
         */
        // for (int i = 0; i < str.length(); i++) {
        //     if (target==str.charAt(i)) {
        //         return true;
        //     }
        // }
        return false;
    }
}
