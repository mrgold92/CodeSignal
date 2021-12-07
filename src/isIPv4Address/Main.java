public class Main {
    public static void main(String[] args) {
        System.out.println(solution("64.233.161.00"));
    }

    public static boolean solution(String inputString) {

        String[] parts = inputString.split("\\.");
        if (parts.length != 4) {
            return false;
        }
        for (String part : parts) {
            if (!isInteger(part)) {
                return false;
            }
            int num = Integer.parseInt(part);
            if (num < 0 || num > 255) {
                return false;
            }

            // Without leading zeros
            if (part.length() > 1 && part.charAt(0) == '0') {
                return false;
            }
        }
        return true;
    }

    private static boolean isInteger(String part) {
        try {
            Integer.parseInt(part);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}