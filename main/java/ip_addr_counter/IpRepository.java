package main.java.ip_addr_counter;

import java.util.BitSet;

public class IpRepository {

    private BitSet[] repository = new BitSet[256];

    public boolean checkAndAddIp(int[] ip){
        if(repository[ip[0]] == null){
            repository[ip[0]] = new BitSet(256^3);
        }
        if (!repository[ip[0]].get(ip[1]*256^2 + ip[2]*256 + ip[3])){
            repository[ip[0]].set(ip[1]*256^2 + ip[2]*256 + ip[3]);
            return false;
        }
        return true;
    }
}
