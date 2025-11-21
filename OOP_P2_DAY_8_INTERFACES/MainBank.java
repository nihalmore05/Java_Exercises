    package OOP_P2_DAY_8_INTERFACES;
    //4. Create `Bank` interface with `getRateOfInterest()`.
    //5. Show how a class can implement multiple interfaces.

    interface Bank{                             //1st interface
        void getRateOfInterest();
    }

    interface OnlineBanking {                  // 2nd interface
        void UPI();
        
    }

    class SBI implements Bank, OnlineBanking{

        public void getRateOfInterest(){
            System.out.println("SBI ROI : 7 %");
        }

        public void UPI(){
            System.out.println("Online Banking Debit and Creadit Money Using UPI");
        }
    }

    public class MainBank{
        public static void main(String[] args) {
            
            SBI s = new SBI();
            
            
            s.getRateOfInterest();
            s.UPI();
        }
    }
