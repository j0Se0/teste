class SqueakyClean {
    static String clean(String identifier) {
        char[] res = identifier.toCharArray();
        StringBuilder srt = new StringBuilder();
        boolean uper = false;
        
        for(char c:res){
            if(Character.isWhitespace(c)){
                srt.append('_');
            }else if(Character.isLetter(c) && !uper){
                 srt.append(c);
            }else if(uper && Character.isLetter(c)){
                c = Character.toUpperCase(c);
                srt.append(c);
                uper = false;
            }else if(Character.isDigit(c)){
                if(c == '4'){
                    srt.append('a');
                }else if(c == '3'){
                    srt.append('e');
                }else if(c == '0'){
                    srt.append('o');
                }else if(c=='1'){
                    srt.append('l');
                }else if(c == '7'){
                    srt.append('t');
                 }
            }else if(c=='-') {
                uper = true;
            }
            
        }
        return srt.toString();
    }
}
