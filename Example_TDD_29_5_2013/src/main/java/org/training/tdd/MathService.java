package org.training.tdd;

/**
 * Created by IntelliJ IDEA.
 * User: haopt
 * Date: 5/29/13
 * Time: 2:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class MathService {

    public static int methodAdd(String string) {
        int resultReturn = 0;
        if (string == null || string.equals("")) {
            resultReturn = 0;
        } else {
            try {
                String[] arrayString = string.split(",");
                int index = arrayString.length;
                for (int i = 0; i < index; i++) {
                    resultReturn += Integer.valueOf(arrayString[i]);
                }
            } catch (Exception e) {
                resultReturn = 0;
            }
        }
        return resultReturn;
    }
}
