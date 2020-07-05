package com.example.demo.service.impl;

import com.example.demo.dao.MemberDAO;
import com.example.demo.entity.Member;
import com.example.demo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MemberServiceimpl implements MemberService {

    @Autowired
    private MemberDAO Mdao;

    @Override
    public int updateMember(Member member) {
        return 0;
    }

    @Override
    public int deleteMember(Integer id) {
        Mdao.deleteById(id);
        return 0;
    }

    @Override
    public int insertMember(Member member) {
        if(member!=null) {
            Mdao.save(member);
            return 1;
        }
        return 0;
    }

    @Override
    public List<Member> getAllMember(Integer id) {
        return Mdao.findAll();
    }

    @Override
    public Member getMemberById(Integer id) {
        return Mdao.findById(id).orElse(null);
    }
}
