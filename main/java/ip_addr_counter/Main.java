package main.java.ip_addr_counter;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String filePath = "ip.log";
        long count = 0;
        IpRepository ipRepository = new IpRepository();
        try {
            File file = new File(filePath);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                try {
                    int[] ip = StringToIP.stringToIP(line);
                    if (!ipRepository.checkAndAddIp(ip)) count++;
                } catch (IpExeption e) {
                    System.out.println(e);
                }
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(count);

    }

}
