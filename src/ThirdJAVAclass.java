public class ThirdJAVAclass {
         /*Write a return method that can find the frequency of characters
    frequencyOfChars("AAABBCDD") =>A3B2C1D2 */
        public static void main(String[] args) {
            getfrequencyOfChars("AAABBCDD");
        }

        private static void getfrequencyOfChars(String str) {
            String freq = "";

            for (int i = 0; i < str.length(); i++) {

                int counter = 0;
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        counter++;
                    }
                }
                if(!freq.contains(String.valueOf(str.charAt(i)))){
                    freq += str.charAt(i) + "" + counter;
                }
            }

            System.out.println(freq);
        }
    }
