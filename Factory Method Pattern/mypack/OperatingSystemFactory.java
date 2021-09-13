package mypack;

import mypack.OS;
import mypack.Android;
import mypack.IOS;
import mypack.Windows;

public class OperatingSystemFactory{
    public OS getInstance(String str){
        if(str.equals("Open"))
            return new Android();
        else if(str.equals("Closed"))
                return new IOS();
            else
                return new Windows();
    }
}