package com.practice.service;

import com.practice.model.Organization;
import com.practice.repository.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class OrganizationService {
    @Autowired
    private OrganizationRepository repository;

    public List<Organization> findAll(){
        return repository.findAll();
    }
    public void save(Organization organization){
        repository.save(organization);
    }
    public void saveAll(List<Organization> organizations){
        repository.saveAll(organizations);
    }
    public List<Organization> findOganizationsEstablishedBetween(Date start,Date end){
        return repository.findByOrgEstablishedDateBetween(start,end);
    }

    public List<Organization> findByOrgEstablishedDateLessThan(Date date){

        return repository.findByOrgEstablishedDateLessThan(date);
    }

    public List<Organization> findByOrgEstablishedDateGreaterThan(Date date){
        return repository.findByOrgEstablishedDateGreaterThan(date);
    }

    public List<Organization> findByOrgNameStartingWith(String start){
        return repository.findByOrgNameStartingWith(start);
    }
    public List<Organization> findByOrgNameLike(String name){
        return repository.findByOrgNameLike(name);
    }

    public List<Organization> findByOrgEstablishedDateGreaterThanOrderByOrgEstablishedDate(Date date){
        return repository.findByOrgEstablishedDateGreaterThanOrderByOrgEstablishedDate(date);
    }

    public Page<Organization> findOrganizationsBasedOnPagination(Integer offset,Integer count){
       Page<Organization> page=repository.findAll(PageRequest.of(offset,count));
       return page;
    }
}
