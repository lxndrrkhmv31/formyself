public class main {
    public static void main(String[] args) {

        int vasyaAge = 55;
        int katyaAge = 55;
        int mishaAge = 55;

        int min = -1; // минимальный возраст
        int middle = -1; // средний возраст
        int max = -1; // максимальный возраст

        if (vasyaAge > katyaAge && vasyaAge > mishaAge) {
            max = vasyaAge;
        } else if (vasyaAge > katyaAge || vasyaAge > mishaAge) {
            middle = vasyaAge;
        } else {
            min = vasyaAge;
        }

        if (katyaAge > vasyaAge && katyaAge > mishaAge) {
            max = katyaAge;
        } else if (katyaAge > vasyaAge || katyaAge > mishaAge) {
            middle = katyaAge;
        } else {
            min = katyaAge;
        }

        if (mishaAge > vasyaAge && mishaAge > katyaAge) {
            max = mishaAge;
        } else if (mishaAge > vasyaAge || mishaAge > katyaAge) {
            middle = mishaAge;
        } else {
            min = mishaAge;
        }

        if (vasyaAge == katyaAge && vasyaAge < mishaAge) {
            max = mishaAge;
            middle = vasyaAge;
            min = katyaAge;
        } else if (vasyaAge == katyaAge && vasyaAge > mishaAge) {
            max = vasyaAge;
            middle = katyaAge;
            min = mishaAge;
        }

        if (vasyaAge == mishaAge && vasyaAge < katyaAge) {
            max = katyaAge;
            middle = vasyaAge;
            min = mishaAge;
        } else if (vasyaAge == mishaAge && vasyaAge > katyaAge) {
            max = vasyaAge;
            middle = mishaAge;
            min = katyaAge;
        }

        if (mishaAge == katyaAge && mishaAge > vasyaAge) {
            max = mishaAge;
            middle = katyaAge;
            min = vasyaAge;
        } else if (mishaAge == katyaAge && mishaAge < vasyaAge) {
            max = vasyaAge;
            middle = mishaAge;
            min = katyaAge;
        }

        if (vasyaAge == katyaAge && vasyaAge == mishaAge) {
            min = vasyaAge;
            middle = katyaAge;
            max = mishaAge;
        }

        System.out.println("Minimal age: " + min);
        System.out.println("Middle age: " + middle);
        System.out.println("Maximum age: " + max);

    }
}
