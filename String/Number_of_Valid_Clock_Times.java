public class Number_of_Valid_Clock_Times {
    
}
class Solution {
    public int countTime(String s) {
        int que = 0;
        int ind1 = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '?'){
                que += 1;
                ind1 = i;
            }
        }
        if(que == 0){
            return 1;
        }
        if(que == 4){
            return 1440;
        }
        if(que == 1){
            if(ind1 == 0){
                int c = Integer.valueOf(s.charAt(1) - '0');
                if(c < 4){
                    return 3;
                }
                else{
                    return 2;
                }
            }
            if(ind1 == 1){
                int c = Integer.valueOf(s.charAt(0) - '0');
                if(c == 2){
                    return 4;
                }
                return 10;
            }
            if(ind1 == 3){
                return 6;
            }
            return 10;
        }
        if(que == 2){
            int i1 = -1;
            int i2 = -1;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '?'){
                    if(i1 >= 0){
                        i2 = i;
                        break;
                    }
                    else{
                        i1 = i;
                    }
                }
            }
            if(i1 == 3 && i2 == 4){
                return 60;
            }
            if(i1 == 0 && i2 == 1){
                return 24;
            }
            if(i1 == 0 && i2 == 3){
                int c = Integer.valueOf(s.charAt(1) - '0');
                if(c < 4){
                    return 18;
                }
                return 12;
            }
            if(i1 == 0 && i2 == 4){
                int c = Integer.valueOf(s.charAt(1) - '0');
                if(c < 4){
                    return 30;
                }
                return 20;
            }
            if(i1 == 1 && i2 == 3){
                int c = Integer.valueOf(s.charAt(0) - '0');
                if(c == 2){
                    return 24;
                }
                return 60;
            }
            int c = Integer.valueOf(s.charAt(0) - '0');
            if(c == 2){
                return 40;
            }
            return 100;
        }
        int ans = 0;
        int i1 = -1;
        int i2 = -1;
        int i3 = -1;
        if(s.charAt(0) == '?' && s.charAt(1) == '?' && s.charAt(3) == '?'){
            return 24 * 6;
        }
        if(s.charAt(0) == '?' && s.charAt(1) == '?' && s.charAt(4) == '?'){
            return 24 * 10;
        }
        if(s.charAt(0) == '?' && s.charAt(4) == '?' && s.charAt(3) == '?'){
            int c = Integer.valueOf(s.charAt(1) - '0');
            if(c < 4){
                return 180;
            }
            return 120;
        }
        int c = Integer.valueOf(s.charAt(0) - '0');
        if(c == 2){
            return 240;
        }
        return 600;
    }
}