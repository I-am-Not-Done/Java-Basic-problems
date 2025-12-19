public class VowelConsonantCount {
    public static void main(String[]args){
        String str ="Hello world I am Abhishek";
        int vowels=0,consonants =0;
        for(char c:str.toCharArray()){
            if("AEIOUaeiou".indexOf(c)!=-1){
                vowels++;
            }
            else if((c>='A' && c<='Z') || (c>='a' && c<='z')){
                consonants++;
            }
        }
        System.out.println("Vowels" +vowels+" Consonants: "+consonants);
    } 
    
    
}
