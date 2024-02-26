package 접근제어자;

public class BankAccount {
        private int balance;        //잔액
        public BankAccount() {
            balance = 0;
        }
        // public 메서드: deposit  //입금
        public void deposit(int amount) {
            if (isAmountValid(amount)) {
                balance += amount;
            } else { System.out.println("유효하지 않은 금액입니다.");
            }
        }
        // public 메서드: withdraw    // 출금
        public void withdraw(int amount) {
            if (isAmountValid(amount) && balance - amount >= 0) {   //잔고보다 출금할 금액이 0보다 크다는 조건도 같이 달아줘야함
                balance -= amount;
            } else {
                System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
            }
        }
        // public 메서드: getBalance       //잔액
        public int getBalance() {
            return balance;
        }
        // private 메서드: isAmountValid
        private boolean isAmountValid(int amount) {     // 입력 금액을 검증하는 기능은 내부에서만 필요한 기능이기 때문에 private사용
            // 금액이 0보다 커야함
            return amount > 0;
        }
    }