import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Benjamin Ehlers on 12/15/2018.
 */


public class HexColor {

    public static final String[] HEXCODE = {"0", "1", "2", "3",
                                            "4", "5", "6", "7",
                                            "8", "9", "A", "B",
                                            "C", "D", "E", "F"};

    String hexString;

    public HexColor(int red, int green, int blue) {
        this.hexString = generateHexString(red, green, blue);
    }

    public HexColor(String[] stringsToBlend) {

        int red = 0;
        int green = 0;
        int blue = 0;

        for (int i = 0; i < stringsToBlend.length; i++) {
            String redCode = "" + stringsToBlend[i].charAt(1) + stringsToBlend[i].charAt(2);
            String greenCode = "" + stringsToBlend[i].charAt(3) + stringsToBlend[i].charAt(4);
            String blueCode = "" + stringsToBlend[i].charAt(5) + stringsToBlend[i].charAt(6);
            red+= getIntFromTwoDigitHex(redCode);
            green+= getIntFromTwoDigitHex(greenCode);
            blue+= getIntFromTwoDigitHex(blueCode);
        }
        hexString = generateHexString(
                red/stringsToBlend.length,
                green/stringsToBlend.length,
                blue/stringsToBlend.length);
    }

    private String generateHexString(int red, int green, int blue) {
        String redHexBitOne = HEXCODE[red/16];
        String redHexBitZero = HEXCODE[red%16];
        String greenHexBitOne = HEXCODE[green/16];
        String greenHexBitZero = HEXCODE[green%16];
        String blueHexBitOne = HEXCODE[blue/16];
        String blueHexBitZero = HEXCODE[blue%16];

        return "#" +
                redHexBitOne + redHexBitZero +
                greenHexBitOne + greenHexBitZero +
                blueHexBitOne + blueHexBitZero;
    }

    private int getIntFromTwoDigitHex(String hexCode){
        ArrayList<String> hexCodeArray = new ArrayList<>(Arrays.asList(HEXCODE));
        int bitOne = hexCodeArray.indexOf(hexCode.charAt(0) + "") * 16;
        int bitTwo = hexCodeArray.indexOf(hexCode.charAt(1) + "");
        return bitOne + bitTwo;
    }

    public String getHexString() {
        return hexString;
    }
}
