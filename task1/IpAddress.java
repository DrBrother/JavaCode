package task1;

public class IpAddress {
    public static void main(String[] args) {
        System.out.print(ipToLong("255.255.255.255"));
        System.out.println();
        System.out.print(longToIp(2147483647));
    }

    public static long ipToLong(String ipAddress) {
        String[] ipAddressInArray = ipAddress.split("\\.");
        int result = 0;
        for (int i = 0; i < ipAddressInArray.length; i++) {
            int power = 3 - i;
            int ip = Integer.parseInt(ipAddressInArray[i]);
            result += ip * Math.pow(256, power);
        }

        return result;
    }

    public static String longToIp(int i) {

        return ((i >> 24) & 0xFF) +
                "." + ((i >> 16) & 0xFF) +
                "." + ((i >> 8) & 0xFF) +
                "." + (i & 0xFF);

    }
}
