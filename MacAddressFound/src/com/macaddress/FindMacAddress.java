package com.macaddress;
import java. net. *;
public class FindMacAddress {
   
    public static void main(String arg[])
    {
    	
    try{
    InetAddress address = InetAddress. getLocalHost();
    NetworkInterface nwi = NetworkInterface. getByInetAddress(address);
    byte mac[] = nwi. getHardwareAddress();
    System. out. println("Mac Address is :"+mac);
    }
    catch(Exception e)
    {
    System. out. println("Exception is :"+e);
    }
}
}
