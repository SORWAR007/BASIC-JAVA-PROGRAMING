public class wordandchar {


        public static void main(String[] args) {
            String str = "I am a SQA Engineer";
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != ' ')
                    count++;

            }
            System.out.println("Total number of characters in a string: " + count);



            int countWords = str.split("\\s").length;
            System.out.println("number of words: "+countWords);
        }





    }









