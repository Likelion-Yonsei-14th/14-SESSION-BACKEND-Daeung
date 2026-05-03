package com.example.crud.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "members")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-incrementing ID
    private Long id;

    @Column(nullable = false) // 이름은 null이 될 수 없음
    private String name; 

    @Column(unique = true, nullable = false) // 이메일은 고유해야 하며 null이 될 수 없음
    private String email;

    @Column(nullable = false, unique = true) // 닉네임은 null이 될 수 없으며 고유해야 함
    private String nickname;

    public Member() {}

    // Getters and Setters

    public Long getId() {return id;}
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}