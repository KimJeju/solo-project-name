package com.soleprojectname.soloproject.service;

import com.soleprojectname.soloproject.entity.Member;
import com.soleprojectname.soloproject.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;


@Service
public class MemberServiceImpl implements MemberService{


    @Autowired
    private  MemberRepository memberRepository;

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
    public List<Member> memberAllSearch() {
        return memberRepository.findAll();
    }

    @Override
    public Member memberSearchDomain(Member.Domain domain) {
        Optional<Member> memberDomain = memberRepository.findByDomain(domain);

        Member member = memberDomain.orElseThrow(() -> new NoSuchElementException());

        return member;
    }

    @Override
    public Member memberSearchRegion(Member.Region region) {

        Optional<Member> memberRegion = memberRepository.findByRegion(region);

        Member member = memberRegion.orElseThrow(() -> new NoSuchElementException());

        return member;
    }

    @Override
    public void memberDelete(Long memberId) {
        memberRepository.deleteById(memberId);
    }
}
