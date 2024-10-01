public class vowelandconsonant {

        public static void main(String[] args) {
            int VCount = 0, CCount = 0;
            String str = "I am a SQA Engineer";
            str = str.toLowerCase();
            for(int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                    VCount++;
                }
                else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {
                    CCount++;
                }
            }
            System.out.println("Number of vowels: " + VCount);
            System.out.println("Number of consonants: " + CCount);


        }


    }


