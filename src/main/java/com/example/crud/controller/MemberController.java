package com.example.crud.controller;

import com.example.crud.domain.Member;
import com.example.crud.repository.MemberRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/members")
public class MemberController {
    private final MemberRepository repository;

    public MemberController(MemberRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Member save(@RequestBody Member member) {
        return repository.save(member);
    }

    @GetMapping
    public List<Member> findAll() {
        return repository.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @PutMapping("/{id}")
    public Member update(@PathVariable Long id, @RequestBody Member member) {
        Member existingMember = repository.findById(id)
            .orElseThrow(() -> new RuntimeException("해당 회원이 없습니다. id = " + id));
        
        existingMember.setName(member.getName()); // 이름은 변경하지 않도록 설정
        existingMember.setEmail(member.getEmail()); // 이메일은 변경하지 않도록 설정
        return repository.save(existingMember);
    }

}