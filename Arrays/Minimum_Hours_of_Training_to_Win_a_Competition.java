// Time:O(m*n)
// Space:O(1)
public class Minimum_Hours_of_Training_to_Win_a_Competition {
    public static int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int sen = 0;
        int ie = initialEnergy;
        for(int i: energy){
            sen += i;
        }
        int en = 0, ex = 0, count = 0;
        if(sen - initialEnergy >= 0){
            while(1 == 1){
                en = initialEnergy;
                for(int i = 0; i < energy.length; i++){
                    initialEnergy -= energy[i];
                    if(initialEnergy <= 0){
                        break;
                    }
                }
                if(initialEnergy == 1){
                    break;
                }
                initialEnergy = en + 1;
            }
            int check = 0;
            while(1 == 1){
                ex = initialExperience;
                int i = 0;
                for(i = 0; i < experience.length; i++){
                    if(initialExperience <= experience[i]){
                        check = 1;
                        break;
                    }
                    else{
                        initialExperience += experience[i];
                    }
                    
                }
                if(i == experience.length || check == 0){
                    break;
                }
                count += 1;
                initialExperience = ex + 1;
            }
            System.out.println(en+" "+count);
            en = en - ie;
            return count + en;
        }
        return 0;
    }
    public static void main(String[] args) {
        int initialEnergy = 5;
        int initialExperience = 3;
        int[] energy = {1, 4, 3, 2};
        int[] experience = {2, 6, 3, 1};
        System.out.println(minNumberOfHours(initialEnergy, initialExperience, energy, experience));
    }
}
