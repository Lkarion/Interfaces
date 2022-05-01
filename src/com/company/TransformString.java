package com.company;

public class TransformString {
    public String transformString(String str, StringTransformer action){
        return action.transform(str);
    }
}
