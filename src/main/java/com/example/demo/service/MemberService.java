package com.example.demo.service;

import com.example.demo.entity.Commodity;
import com.example.demo.entity.Member;

import java.util.List;

public interface MemberService {
    public int updateMember(Member member);
    public int deleteMember(Integer id);
    public int insertMember(Member member);
    public List<Member> getAllMember(Integer id);
    public Member getMemberById(Integer id);
}
