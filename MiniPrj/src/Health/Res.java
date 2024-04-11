package Health;

public class Res {
    private String MemberId;  // 회원 아이디
    private int MemberPw;
    private String MemberName;  // 회원이름
    private int Count; // 남은

    public String getMemberId(){
        return MemberId;
    }
    public int getMemberPw(){
        return MemberPw;
    }
    public String getMemberName(){
        return MemberName;
    }
    public void setMemberId(String MemberId){
        this.MemberId = MemberId;
    }
    public void  setMemberPw(int MemberPw){
        this.MemberPw = MemberPw;
    }
    public void setMemberName(String MemberName){
        this.MemberName = MemberName;
    }
    public int getCount(){
        return Count;
    }
    public void setCount(int Count){
        this.Count = Count;
    }
    public void addCount(int input){
        this.Count += input;
    }
    public void subCount(int input){
        this.Count -= input;
    }
}