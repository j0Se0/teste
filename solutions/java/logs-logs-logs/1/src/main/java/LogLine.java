public class LogLine {
    private String logLine;
    
    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    public LogLevel getLogLevel() {
        String level = logLine.substring(1, 4); 
        
        switch (level) {
            case "TRC": return LogLevel.TRACE;
            case "DBG": return LogLevel.DEBUG;
            case "INF": return LogLevel.INFO;
            case "WRN": return LogLevel.WARNING;
            case "ERR": return LogLevel.ERROR;
            case "FTL": return LogLevel.FATAL;
            default: return LogLevel.UNKNOWN;
        }
    }

    public String getOutputForShortLog() {
        LogLevel level = getLogLevel();
        String message = logLine.substring(7); 
        
        int code = getCode(level);
        return code + ":" + message;
    }

       private int getCode(LogLevel level) {
        switch (level) {
            case UNKNOWN: return 0;
            case TRACE: return 1;
            case DEBUG: return 2;
            case INFO: return 4;
            case WARNING: return 5;
            case ERROR: return 6;
            case FATAL: return 42;
            default: return 0;
        }
    }
}
