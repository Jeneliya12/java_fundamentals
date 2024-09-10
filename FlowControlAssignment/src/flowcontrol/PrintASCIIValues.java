package flowcontrol;

public class PrintASCIIValues {

	public static void main(String[] args) {
        for (int i = 32; i <= 126; i++) {
            char character = (char) i;
            System.out.println("ASCII Value: " + i + " Character: " + character);
        }
    }

	}
