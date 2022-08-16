package com.soleprojectname.soloproject.repository;

import com.soleprojectname.soloproject.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member,Long> {

}
