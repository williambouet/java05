class IndianaCode {

    static final String FIRST_MESSAGE = "0@sn9sirppa@#?ia'jgtvryko1";
    static final String SECOND_MESSAGE = "q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj";
    static final String THIRD_MESSAGE = "aopi?sedohtém@#?sedhtmg+p9l!";
    static final int START_CHAR = 5;

    // Calcule la longueur de la chaîne et divise-la par 2, tu obtiendras ainsi le
    // "chiffre-clé".
    private static int keyFigure(String message) {
        return message.length() / 2;
    }

    // Récupère ensuite la sous-chaîne de la longueur du chiffre-clé, en commençant
    // à partir du 6ème caractère
    private static String subStringMessage(String message, int key) {
        int keyFigure = key;
        return message.substring(START_CHAR, START_CHAR + keyFigure);
    }

    // Remplace les chaînes '@#?' par un espace.
    private static String replaceInMessage(String message) {
        return message.replace("@#?", " ");
    }

    // Pour finir, inverse la chaîne de caractères.
    private static String reverseMessage(String message) {
        String reverseMessage = "";

        for (int i = message.length()-1; i >= 0; i--) {
            reverseMessage += message.charAt(i);
        }

        return reverseMessage;
    }

    private static String decode(String message) {
        // step 1
        int key = keyFigure(message);
        // step 2
        String stepTwo = subStringMessage(message, key);
        // step 3
        String stepThree = replaceInMessage(stepTwo);
        // step 4
        String stepFour = reverseMessage(stepThree);

        return stepFour;
    }

    public static void main(String[] args) {
        System.out.println(decode(FIRST_MESSAGE));
        System.out.println(decode(SECOND_MESSAGE));
        System.out.println(decode(THIRD_MESSAGE));
    }
}