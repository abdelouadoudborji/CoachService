package com.coach.service.CoachService.dao;

import com.coach.service.CoachService.entities.Coach;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource (path="coachs")
public interface CoachRepository extends JpaRepository<Coach, Long> {
    /*@Query(value="select * from coach where id in ( select coach_id from coach_function_coach_list where function_coach_list_id in ( select id from function_coach where description like :label ))"
            ,countQuery = "SELECT count(*) FROM Coach"
            ,nativeQuery = true)
    public Page<Coach> findByfunction( @Param("label") String label,Pageable pageable );*/



}
