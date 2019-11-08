package main.java.ip_addr_counter;

public class IpExeption extends Exception {
    String message;

    IpExeption(String str) {
        message = str;
    }

    public String toString() {
        return ("Incorrect IP:" + message);
    }
}
