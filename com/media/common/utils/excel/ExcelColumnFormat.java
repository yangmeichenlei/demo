package com.media.common.utils.excel;

/**
 * Created by lihaiqiang on 2018/08/15.
 */
public abstract class ExcelColumnFormat {
    public abstract String parse(String t);
    
    public abstract String print(String t);
    
    public abstract static class None extends ExcelColumnFormat {
        
    }
    
}
