class Solution {
    public boolean detectCapitalUse(String word) {
       // char ch[] = word.toCharArray();
        int l= word.length()-1;
        
        for(int i=0; i<= l; i++){
             if(Character.isLowerCase(word.charAt(i))){
                 break;
             }
            if(Character.isUpperCase(word.charAt(i))){
                if( i== l ){
                   return  true;
                }
            }
        }
        
        for(int i=0; i<= l; i++){
             if(Character.isUpperCase(word.charAt(i))){
                 break;
             }
            if(Character.isLowerCase(word.charAt(i))){
                if( i== l ){
                   return  true;
                }
            }
        }
         for(int i=1; i<= l; i++){
             if(Character.isUpperCase(word.charAt(0))){
               
             if(Character.isUpperCase(word.charAt(i))){
               break;
             }
                 if(Character.isLowerCase(word.charAt(i))){
                if( i== l ){
                   return  true;
                }
            }
                 
                 
             }
         }       
      return false;                 
    }
     
}