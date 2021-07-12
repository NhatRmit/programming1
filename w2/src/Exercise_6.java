public class Exercise_6 {
  public static char shift(char c, int key) {
    int numOfChar = 26; // number of characters in the alphabet, for English it is 26
    // 1, 27, 53, etc. have the same shift
    key %= numOfChar;
    // transform key to a positive value
    if (key < 0) {
      key += numOfChar;
    }
    // shift and restart if necessary
    char newC = (char)('A' + ((c - 'A' + key) % numOfChar));
    return newC;
  }

  static void exe(String msg, int key){
    System.out.printf("\nExercise 6 - Encrypt and Decrypt with Shift cipher \n");
    System.out.printf("\nMessage %s and key %d \n", msg, key);
    // Encrypt
    StringBuffer cipherText = new StringBuffer();
    int index = 0;
    while (index < msg.length()) {
      char original = msg.charAt(index);
      char encrypted = shift(original, key);
      cipherText.append(encrypted);
      index++;
    }
    String encryptionResult = cipherText.toString();
    System.out.printf("\nCipher text is %s \n", encryptionResult);

    // Decrypt
    StringBuffer decipherText = new StringBuffer();
    index = 0;
    while (index < encryptionResult.length()) {
      char cipher = encryptionResult.charAt(index);
      char decipher = shift(cipher, -key);
      decipherText.append(decipher);
      index++;
    }
    String decryptionResult = decipherText.toString();
    System.out.printf("\nDecipher text is %s \n", decryptionResult);
  }
}

