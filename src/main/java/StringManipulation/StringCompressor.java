package StringManipulation;

public class StringCompressor {
    public static String compressString(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        int count =1;

        for (int i=0;i<input.length();i++){
            if(i<input.length()-1 && input.charAt(i)==input.charAt(i+1)){
                count++;
            }
            else {
                stringBuilder.append(input.charAt(i));
                if(count>1){
                    stringBuilder.append(count);
                    count=1;
                }
            }
        }
        return stringBuilder.toString();
    }
    public static void main(String[]args){
        String input = "aaabbcccc";
        String compress = compressString(input);
        System.out.println("Compress String:"+compress);
    }
}
