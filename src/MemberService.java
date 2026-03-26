public class MemberService {

    private MemberRepository repository = new MemoryMemberRepository();

    public void join(String name) {
        Member member = new Member(name);

        repository.save(member);
    }
}
