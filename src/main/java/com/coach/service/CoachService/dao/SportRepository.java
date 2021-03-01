package com.coach.service.CoachService.dao;

import com.coach.service.CoachService.entities.Coach;
import com.coach.service.CoachService.entities.Sport;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface SportRepository extends JpaRepository<Sport,Long> {

}
