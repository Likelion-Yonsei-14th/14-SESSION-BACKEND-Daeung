public class MemberService {

    private MemoryMemberRepository repository = new MemoryMemberRepository();

    public void join(String name) {
        Member member = new Member();
        member.name = name;

        repository.save(member);
    }
}
