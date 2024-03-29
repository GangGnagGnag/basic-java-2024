package comAbst.exBase;

class Base {
    int bNum;

    Base(int bNum) {
        this.bNum = bNum;
    }
}

class Drived extends Base {
    int dNum;
    Drived(int bNum, int dNum){
        super(bNum);    // 생성자
        this.dNum = dNum;
    }

    void printField() {
        System.out.println("bNum: " + bNum + "\ndNum : " + dNum);
    }
}

public class InhEx {
    public static void main(String[] args) {
        Drived d = new Drived(10, 20);
        d.printField();

    }
}
