package com.company;

import java.util.Locale;

public class FirstCharToUpperCase implements StringTransformer{
    public String transform(String str){
        if (str!=null && ! str.isEmpty()){
            String res = "";
            res=str.substring(0,1).toUpperCase(Locale.ROOT)+str.substring(1);
            return res;
        }else
        {
            return "";
        }
    }
}
