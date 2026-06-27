package model;

import java.util.HashMap;

public class MorseTranslator {

    private HashMap<Character, String> textToMorseMap;
    private HashMap<String, Character> morseToTextMap;

    public MorseTranslator(){
        textToMorseMap = new HashMap<>();
        morseToTextMap = new HashMap<>();

        fillMaps();
    }

    private void fillMaps(){
        textToMorseMap.put('A', ".-");
        textToMorseMap.put('B', "-...");
        textToMorseMap.put('C', "-.-.");
        textToMorseMap.put('Č', "----");
        textToMorseMap.put('Ć', "-.-..");
        textToMorseMap.put('D', "-..");
        textToMorseMap.put('Đ', ".-..-");
        textToMorseMap.put('E', ".");
        textToMorseMap.put('F', "..-.");
        textToMorseMap.put('G', "--.");
        textToMorseMap.put('H', "....");
        textToMorseMap.put('I', "..");
        textToMorseMap.put('J', ".---");
        textToMorseMap.put('K', "-.-");
        textToMorseMap.put('L', ".-..");
        textToMorseMap.put('M', "--");
        textToMorseMap.put('N', "-.");
        textToMorseMap.put('O', "---");
        textToMorseMap.put('P', ".--.");
        textToMorseMap.put('Q', "--.-");
        textToMorseMap.put('R', ".-.");
        textToMorseMap.put('S', "...");
        textToMorseMap.put('Š', "----.");
        textToMorseMap.put('T', "-");
        textToMorseMap.put('U', "..-");
        textToMorseMap.put('V', "...-");
        textToMorseMap.put('W', ".--");
        textToMorseMap.put('X', "-..-");
        textToMorseMap.put('Y', "-.--");
        textToMorseMap.put('Z', "--..");
        textToMorseMap.put('Ž', "--..-");
        textToMorseMap.put('1', ".----");
        textToMorseMap.put('2', "..---");
        textToMorseMap.put('3', "...--");
        textToMorseMap.put('4', "....-");
        textToMorseMap.put('5', ".....");
        textToMorseMap.put('6', "-....");
        textToMorseMap.put('7', "--...");
        textToMorseMap.put('8', "---..");
        textToMorseMap.put('9', "----.");
        textToMorseMap.put('0', "-----");

        // same list, but for Morse -> text
        for(char symbol : textToMorseMap.keySet()){
            String code = textToMorseMap.get(symbol);
            morseToTextMap.put(code, symbol);
        }
    }

    public String translateTextToMorse(String text, String separator){
        if (text == null || text.isEmpty()){
            return "";
        }

        text = text.toUpperCase();

        StringBuilder result = new StringBuilder();


        for (int i = 0; i < text.length(); i++){
            char symbol = text.charAt(i);

            if (symbol == ' '){
                String wordSeparator = separator + separator;
                // after every word one separator is placed, so the official space between words will be 1+2 separators
                result.append(wordSeparator);
                continue;
            }

            if (textToMorseMap.containsKey(symbol)){

                String convertedSymbol = textToMorseMap.get(symbol);
                result.append(convertedSymbol);
                result.append(separator);
            }else {
                result.append("?");
            }
        }

        return result.toString().trim();


    }

    // KONZULTACIJE!!!!

    public String translateMorseToText(String morseCode, String separator){
        if (morseCode == null || morseCode.trim().isEmpty()){
            return "";
        }

        StringBuilder result = new StringBuilder();

        String[] tokens = morseCode.split(separator);
        int emptyTokenCount = 0;

        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i].trim();

            if (token.isEmpty()) {
                emptyTokenCount++;

                if (emptyTokenCount == 2){
                    result.append(" ");
                    emptyTokenCount = 0;
                }
                continue;
            }else {
                emptyTokenCount = 0;
            }

            if (morseToTextMap.containsKey(token)) {
                Character convertedMorseCode = morseToTextMap.get(token);
                result.append(convertedMorseCode);
            }else {
                result.append("?");
            }
        }
    return result.toString().trim();
    }

    // SEPARATOR ZA SVAKO ODVAJANJE!

}
