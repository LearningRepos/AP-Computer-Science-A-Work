//Name : Mihir Achyuta
//Date : 3/13/20
//Purpose : To decrypt a message and display the cipher alphabet
public class Decryption {

    public static String[] Cypher(int shift) {
        String[] alphabet = new String[CaesarTester.alp.length];

        for (int i = 0; i < CaesarTester.alp.length; i++) {
            if (i - shift >= 0 && i - shift <= 25) {
                alphabet[i] = CaesarTester.alp[i - shift];
            }
            else {
                alphabet[i] = CaesarTester.alp[i - shift + 26];
            }
        }

        for (String letter : CaesarTester.alp) {
            System.out.print(letter);
        }
        System.out.println();
        for (String letter : alphabet) {
            System.out.print(letter);
        }
        System.out.println();
        return alphabet;
    }

    public static String Decryption(String[] Cypher, String Input) {
        String decryptedMessage = "";
        for (int i = 0; i < Input.length(); i++) {
            if (Input.charAt(i) == ' ') {
                decryptedMessage += " ";
            }
            else {
                for (int j = 0; j < Cypher.length; j++) {
                    if (Input.substring(i, i + 1).equals(CaesarTester.alp[j])) {
                        decryptedMessage += Cypher[j];
                    }
                }
            }
        }
        return decryptedMessage;
    }

}