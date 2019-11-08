package main.java.ip_addr_counter;

public class StringToIP {
    public static int[] stringToIP(String string) throws IpExeption {
        int[] ip = new int[4];
        String[] strArr = string.split( "\\.");
        if (strArr.length != 4) throw new IpExeption(string);
        for (int i = 0; i < strArr.length; i++) {
            ip[i] = Integer.parseInt(strArr[i]);
            if (ip[i] < 0 || ip[i] > 255) throw new IpExeption(string);
        }
        return ip;
    }
}
