class Solution {
    public int compress(char[] ch) {
        StringBuilder ans = new StringBuilder();
        int i = 0;
        int j = 0;
        int l = 0;

        if(ch.length==1) return 1;
        
        while(j<ch.length){
           
            if (ch[i] == ch[j]){
                j++;
            }
            else{
                int k = j-i;
                ch[l++] = ch[i];
                
                if(k>1){
                    for(char c : String.valueOf(k).toCharArray()){
                    ch[l++] = c;
                    }
                }
                i = j;
            }            
        }
        ch[l++] = ch[i];
        int k = j-i;
        if(k>1){
            for(char c : String.valueOf(k).toCharArray()){
                    ch[l++] = c;
            }
        }
        return l;
    }
}