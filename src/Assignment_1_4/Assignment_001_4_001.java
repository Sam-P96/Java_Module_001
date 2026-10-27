package Assignment_1_4;

public class Assignment_001_4_001 {
    public static void main(String[] args) {
        String[] firstNames = {"Him", "Racheal", "Enni", "Joshua", "Sam", "Liam", "Roy", "Duy"};
        String[] lastNames = {"Fakeman", "Realman", "Potato", "Eater", "Lumpkin", "Chees-nado"};



        for (int i = 0; i < 10; i++) {
            int a = (int) (Math.random() * firstNames.length);
            int b = (int) (Math.random() * lastNames.length);
            System.out.println(firstNames[a] + " " + lastNames[b]);
        }

    }
}
