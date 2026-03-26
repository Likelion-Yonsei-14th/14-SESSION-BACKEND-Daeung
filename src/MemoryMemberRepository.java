import java.util.ArrayList;
import java.util.List;

public class MemoryMemberRepository implements MemberRepository {

    private List<Member> store = new ArrayList<>();

    @Override
    public void save(Member member) {
        store.add(member);
    }
}