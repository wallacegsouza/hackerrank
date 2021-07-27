public class TimeConversion {
    
    public static String result(String s) {
        String hoursFormat = s.substring(s.length() - 2);
        String hours = s.substring(0, 2);
        int a = Integer.valueOf(hours);
        if ("PM".equals(hoursFormat)) {
            a += (a == 12) ? 0 : 12;
            hours = 24 == a ? "00" : String.valueOf(a);
        } else {
            hours = 12 == a ? "00" : (a < 10 ? "0" : "") + String.valueOf(a);
        }
        return hours + s.substring(2, s.length() - 2);
    }

    public static void main(String[] args) {
        String r = result("07:05:45PM");
        System.out.println("19:05:45".equals(r));
        r = result("12:40:22AM");
        System.out.println("00:40:22".equals(r));
        r = result("06:40:03AM");
        System.out.println(r);
        System.out.println("06:40:03".equals(r));
        
    }
}
