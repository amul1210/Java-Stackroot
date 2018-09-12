public class PowerOfFour {
    public boolean checkifPowerFour(long i) {
            if(i<=0) return false;

            int pow = (int) (Math.log(i) / Math.log(4));
            if(i==Math.pow(4, pow)){
                return true;
            }else{
                return false;
            }
        }

    }
