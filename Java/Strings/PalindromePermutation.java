import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

//Palindrome Permutation of a String in Java
/*

Approach:
1. Created a frequency Array of the String
2. Validated the Frequency Array to check if any Palindrome from the given String can be Created or Not
3. If above Step Return False, return the empty list else continue with Step 4
4. Find the One Odd Character in the String, if present
5. Created a Sub-String with exactly half frequency of each character
6. Created a HashSet of String with all the Permutation of the Sub-String
7. Used the HashSet to create List of Palindrome String
8. Sorted the List and return the List.
9. Used main Method to show the calling of the method and demo the result
10.Time Complexity -> O(N * N!)
11. Space Complexity -> O(R – L)
 */
public class PalindromePermutation {

    public static void main(String[] args){
        PalindromePermutation p= new PalindromePermutation();

        // Testing the PalindromePermutation Method
        String inputString="abba";
        List<String> palindromePermutationString= p.findPalindromePermutation(inputString);

        System.out.println(inputString);
        System.out.println(palindromePermutationString);

        // Input String : abba
        // Output String: abba, baab
        
    }

    public static final int MAX_CHAR_COUNT=26;

    // It will return the list of all the possible palindrome permutation of the String
    // In case no palindrome is possible it will return empty list
    public List<String> findPalindromePermutation(String str){
        List<String> list= new ArrayList<String>();
        HashSet<String> halfStringSet= new HashSet<String>();
        int[] arr= getIntArrayFromString(str);
        if(!isPalindromePossible(arr,str.length())){
            return list;
        }
        String middleChar=findOddCharAndReplace(arr,str.length());
        String halfString=getHalfStringFromArray(arr, str.length());
        permute(halfString,0,halfString.length()-1,halfStringSet);
        list = getPalindrome(halfStringSet,middleChar);
        Collections.sort(list);
        return list;
    }

    // This method is supposed is create Palindrome list from the Hash Set
    private List<String> getPalindrome(HashSet<String> halfStringSet, String middleChar) {
        List<String> list= new ArrayList<String>();
        for(String str : halfStringSet){
            String revStr="";
            for(int i=0;i<str.length();i++){
                revStr=str.charAt(i)+revStr;
            }
            list.add(str+middleChar+revStr);
        }
        return list;
    }

    // This method will return the String with exactly half frequency of each Character
    private String getHalfStringFromArray(int[] arr, int length) {
        int len=(length%2==0)?length/2:(length-1)/2;
        String str="";
        for(int i=0;i<26;i++){
            while(arr[i]!=0){
                char temp=(char)('a'+i);
                str=str+temp;
                arr[i]=arr[i]-2;
            }
        }
        return str;
    }

    // This Method will recursively find all the permutation of the String and will save it in HashSet
    private void permute(String str, int l, int r, HashSet<String> halfString)
    {
        if (l == r)
            halfString.add(str);
        else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r,halfString);
                str = swap(str, l, i);
            }
        }
    }

    //This Method will be used to Swap Character in String
    private String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    // This Method will find the Middle Odd Character to be placed in Middle of the Palindrome String
    // In case there is no Odd Character it will return empty String
    private String findOddCharAndReplace(int[] arr, int n){
        String oddChar="";
        for(int i=0;i<26;i++){
            if(arr[i]%2!=0){
                arr[i]--;
                oddChar=(char)('a'+i)+"";
                break;
            }
        }
        return oddChar;
    }

    // Method to check whether Palindrome is possible for the String or Not
    private boolean isPalindromePossible(int[] arr, int n){
        int odd=0;
        for(int i=0;i<26;i++){
            if(arr[i]%2!=0){
                odd++;
            }
        }
        if(n%2==0){
            if(odd>0){
                return false;
            }else{
                return true;
            }
        }
        if(odd!=1){
            return false;
        }
        return true;
    }

    // This method will create the Integer Array of the String
    // With frequency of each character
    private int[] getIntArrayFromString(String str){
        int[] arr= new int[MAX_CHAR_COUNT];
        for(int i=0;i<str.length();i++){
            arr[str.charAt(i)-'a']++;
        }
        return arr;
    }
}
