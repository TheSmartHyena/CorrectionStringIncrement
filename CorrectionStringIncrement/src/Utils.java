public class Utils {
    static int getIndice(String str) {
        int result = -1;

        for (int i = str.length() - 1; i >= 0; i--) {
            if (!Character.isDigit(str.charAt(i))) {
                result = i;
                break;
            }
        }

        return result;
    }

    static Splitted getSplitted(String txt) {
        int indice = Utils.getIndice(txt);
        String a = txt.substring(0, indice + 1);
        String b = txt.substring(indice + 1);

        return new Splitted(a, Integer.parseInt(b));
    }
}
