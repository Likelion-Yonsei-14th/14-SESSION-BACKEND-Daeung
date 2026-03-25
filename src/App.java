public class App {
    public static void main(String[] args) throws Exception {
        
        MemberService memberService = new MemberService();
        memberService.join("Likelion");

        System.out.println("회원가입 완료");
    }
}
