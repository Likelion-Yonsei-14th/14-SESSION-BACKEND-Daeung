import java.util.ArrayList;
import java.util.List;

public class MemoryMemberRepository {

    private List<Member> store = new ArrayList<>();

    public void save(Member member) {
        store.add(member);
    }
}