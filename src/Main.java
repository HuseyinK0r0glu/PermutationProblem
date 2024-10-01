public class Main {
    public static void main(String[] args) {

        String str = "abct";
        permutation(str,0,str.length()-1);

    }

    /*
    public static void permutation(String str,String prefix){
        if(str.length() == 0){
            System.out.println(prefix);
        }else{
            for(int i = 0;i<str.length();i++){
                // we seperate the index i
                String rem = str.substring(0,i) + str.substring(i+1);
                permutation(rem,prefix + str.charAt(i));
            }
        }
    }

    */

    public static void permutation(String str,int left,int right){

        if(left == right){
            System.out.println(str);
        }else{
            for(int i = left;i<=right;i++){
                str = swap(str,left,i);
                permutation(str,left+1,right);
                str = swap(str,left,i);
            }
        }

    }

    public static String swap(String str,int i,int j){

        char[] charArray = str.toCharArray();

        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;

        return String.valueOf(charArray);
    }

}