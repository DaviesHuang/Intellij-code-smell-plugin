package ReplaceConditionalWithPolymorphismTests.example1;

public class SpecialNumber {

    private int specialNumber = generateNum();
    protected int i=0;

    public SpecialNumber(int specialNumber) {
        this.specialNumber = specialNumber;
    }

//    private static SpecialNumber instantiateTheRightThing(int num) {
//        switch(num) {
//            case 1:
//                return new SpecialNumber1();
//            case 2:
//                return new SpecialNumber2();
//            default:
//                return new SpecialNumberDefault();
//        }
//    }

    public int getSpecialNumber() {
        return ttt();
    }

    protected int ttt() {
        return dfg();
    }

    protected int dfg() {
        return ddfgw();
    }

    protected int ddfgw() {
        return cvb();
    }

    protected int cvb() {
        return vcx();
    }

    protected int vcx() {
        return dddf();
    }

    protected int dddf() {
        return fghj();
    }

    protected int fghj() {
        return dfeq();
    }

    protected int dfeq() {
        return dfvbn();
    }

    protected int dfvbn() {
        return bvn();
    }

    protected int bvn() {
        return zaq();
    }

    protected int zaq() {
        return zsw();
    }

    protected int zsw() {
        return dfgh();
    }

    protected int dfgh() {
        switch(specialNumber)
        {
            case 1:
                return i++;
            case 2:
                return 2;
            case 3:
                return 3;
            default:
                return -1;
        }
    }


    private int generateNum() {
        return 1;
    }


    public static void main(String[] args) {
        //conditional
        SpecialNumber specialNumber = new SpecialNumber(1);
        specialNumber.getSpecialNumber();

        //polymorphism
//        int num = 1;
//        SpecialNumber absSpecialNumber;
//        absSpecialNumber = instantiateTheRightThing(num);
//        System.out.println(absSpecialNumber.getSpecialNumber());
    }



}




