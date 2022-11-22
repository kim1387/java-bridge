package bridge.utils;

public class ConvertUtil {

    public static Integer convertStringToInteger(String input){
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("[Error] String to Integer 변환 예외");
        }
        return null;
    }

}
