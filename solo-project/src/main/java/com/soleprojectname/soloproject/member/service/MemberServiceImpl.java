package com.soleprojectname.soloproject.member.service;

import com.soleprojectname.soloproject.member.entity.Member;
import com.soleprojectname.soloproject.member.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;


@Service
public class MemberServiceImpl implements MemberService{


    @Autowired
    private MemberRepository memberRepository;

    @Override
    public Member memberPost(Member member) {

       Member newMember = member;

       return memberRepository.save(newMember);
    }

    @Override
    public Member memberPatch(Member member) {

        Member patchMember = member;

        patchMember.setMemberId(member.getMemberId());

        return memberRepository.save(patchMember);

    }

    @Override
    public Member memberSearch(Long memberId) {
        Optional<Member> findMember = memberRepository.findById(memberId);

        Member member = findMember.orElseThrow(() -> new NoSuchElementException());

        return member;
    }


    @Override
    public void memberDelete(Long memberId) {
        memberRepository.deleteById(memberId);
    }
}
