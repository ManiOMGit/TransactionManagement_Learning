package com.practice.repository;

import com.practice.model.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Date;
import java.util.List;

public interface OrganizationRepository extends JpaRepository<Organization,Integer> {

    List<Organization> findByOrgEstablishedDateBetween(Date start,Date end);

    List<Organization> findByOrgEstablishedDateLessThan(Date date);

    List<Organization> findByOrgEstablishedDateGreaterThan(Date date);

    List<Organization> findByOrgNameStartingWith(String start);

    List<Organization> findByOrgNameLike(String name);

    List<Organization> findByOrgEstablishedDateGreaterThanOrderByOrgEstablishedDate(Date date);


}
