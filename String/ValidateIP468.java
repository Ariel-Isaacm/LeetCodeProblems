package String;

public class ValidateIP468 {
    class Solution {
        public String validIPAddress(String IP) {
            if(IP == null || IP.isEmpty()) return "Neither";
            return isIpv4(IP) ? "IPv4" : isIpv6(IP) ? "IPv6" : "Neither";
        }

        public boolean isIpv6(String ip) {
            if (ip.endsWith(":") || ip.startsWith(":")) return false;
            String[] values = ip.split(":");
            if (values.length != 8) return false;
            for (int i = 0; i < values.length; i++) {
                String currentSegment = values[i];
                if (currentSegment == null || currentSegment.isEmpty() || currentSegment.length() > 4 ||currentSegment.startsWith("-") || currentSegment.startsWith("+")) return false;
                int decimal = getNumber(currentSegment, 16);
                if (decimal < 0 || decimal > 65535) {
                    return false;
                }
            }
            return true;
        }

        public int getNumber(String s, int base){
            int x;
            try {
                x= Integer.parseInt(s, base);
            }  catch (NumberFormatException e){
                return -1;
            }
            return x;
        }

        public boolean isIpv4(String ip) {
            if (ip.endsWith(".") || ip.startsWith("."))  return false;
            String[] values = ip.split("\\.");
            if (values.length != 4) return false;
            for (int i = 0; i < values.length; i++) {
                String currentSegment = values[i];
                if (currentSegment == null || currentSegment.isEmpty()|| (currentSegment.startsWith("0") && currentSegment.length()>1) || currentSegment.startsWith("-") || currentSegment.startsWith("+")) return false;
                int current = getNumber(currentSegment,10);
                if (current > 255 || current < 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
