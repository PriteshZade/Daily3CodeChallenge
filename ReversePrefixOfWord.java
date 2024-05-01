class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while(i<word.length() && word.charAt(i)!=ch ){
            sb.append(word.charAt(i));
            i++;

        }
        if(i>=word.length()){
            return word;
            
        }
        sb = sb.append(word.charAt(i));
            return sb.reverse().append(word.substring(i+1 ,word.length() )).toString();
        


    }
}