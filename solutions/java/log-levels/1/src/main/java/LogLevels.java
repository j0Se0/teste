public class LogLevels {
    
    public static String message(String logLine) {
        String[] menssagen = logLine.split(":",2);
        int index =0;
        String result="";
        for(String str:menssagen){
            if(index==1){
                result = str;
            }
            index++;
        }
        return result.trim();
    }

    public static String logLevel(String logLine) {
        int inicio = logLine.indexOf("[");
        int fim = logLine.indexOf("]");

        String menssagen = logLine.substring(inicio + 1,fim);
        
        return menssagen.toLowerCase();
    }

    public static String reformat(String logLine) {
        int fim = logLine.indexOf("]");
        int inicio = logLine.indexOf(":");

        String menssagen1 = logLine.substring(1,fim).toLowerCase();
        String menssagen2 = logLine.substring(inicio+1).trim();
        
        return menssagen2 +" ("+menssagen1+")";
       
    }
}
