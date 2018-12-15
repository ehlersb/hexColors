/**
 * Created by Benjamin Ehlers on 12/15/2018.
 */
public class HexColorsTest {

    public static void main(String[] args) {

        HexColor Tomato = new HexColor(255, 99, 71);
        System.out.println("Expected: #FF6347");
        System.out.println("Actual: " + Tomato.getHexString());
        System.out.println();

        HexColor DarkGoldenrod = new HexColor(184, 134, 11);
        System.out.println("Expected: #B8860B");
        System.out.println("Actual: " + DarkGoldenrod.getHexString());
        System.out.println();

        HexColor DarkKhaki = new HexColor(189, 183, 107);
        System.out.println("Expected: #BDB76B");
        System.out.println("Actual: " + DarkKhaki.getHexString());
        System.out.println();

        HexColor MediumBlue = new HexColor(0, 0, 205);
        System.out.println("Expected: #0000CD");
        System.out.println("Actual: " + MediumBlue.getHexString());
        System.out.println();

        String[] hexStringArrayOne = {"#000000", "#778899"};
        String[] hexStringArrayTwo = {"#E6E6FA", "#FF69B4", "#B0C4DE"};

        HexColor blendOne = new HexColor(hexStringArrayOne);
        System.out.println("Expected: #3B444C");
        System.out.println("Actual: " + blendOne.getHexString());
        System.out.println();

        HexColor blendTwo = new HexColor(hexStringArrayTwo);
        System.out.println("Expected: #DCB1D9");
        System.out.println("Actual: " + blendTwo.getHexString());
        System.out.println();
    }

}
