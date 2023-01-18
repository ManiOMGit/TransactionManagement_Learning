package com.practice.controller;

import com.practice.model.Organization;
import com.practice.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("/org")
public class OrganizationController {

    private OrganizationService service;

    @Autowired
    public OrganizationController(OrganizationService service) {
        this.service = service;
    }

    @PostMapping("/save")
    public ResponseEntity<String> saveOrg(@RequestBody Organization organization){
        service.save(organization);
        return new ResponseEntity<>("Org Saved Successfully", HttpStatus.CREATED);
    }
    @PostMapping("/saveAll")
    public ResponseEntity<String> saveAllOrgs(@RequestBody List<Organization> organizations){
        service.saveAll(organizations);
        return new ResponseEntity<>("All organisations saved successfully",HttpStatus.CREATED);
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<Organization>> findAll(){
        return new ResponseEntity<>(service.findAll(),HttpStatus.OK);
    }

    @GetMapping("/findBetween")
    public ResponseEntity<List<Organization>> findOganizationsEstablishedBetween(
            @RequestParam Date start, @RequestParam Date end){
        return new ResponseEntity<>(service.findOganizationsEstablishedBetween(start,end),HttpStatus.OK);
    }

    @GetMapping("/lessThan/{date}")
    public ResponseEntity<List<Organization>> findOganizationsEstablishedLessThan(@PathVariable Date date){
        return new ResponseEntity<>(service.findByOrgEstablishedDateLessThan(date),HttpStatus.OK);
    }

    @GetMapping("/greaterThan/{date}")
    public ResponseEntity<List<Organization>> findByOrgEstablishedDateGreaterThan(@PathVariable Date date){
        return new ResponseEntity<>(service.findByOrgEstablishedDateGreaterThan(date),HttpStatus.OK);
    }

    @GetMapping("/startsWith/{start}")
    public ResponseEntity<List<Organization>> findByOrgNameStartingWith(@PathVariable String start){
        return new ResponseEntity<>(service.findByOrgNameStartingWith(start),HttpStatus.OK);
    }

    @GetMapping("like/{name}")
    public ResponseEntity<List<Organization>> findOrgNameLike(@PathVariable String name){
        return new ResponseEntity<>(service.findByOrgNameLike(name),HttpStatus.OK);
    }

    @GetMapping("orderBy/{date}")
    public ResponseEntity<List<Organization>> findByOrgEstablishedDateGreaterThanOrderByOrgEstablishedDate(@PathVariable Date date){
        return new ResponseEntity<>(service.findByOrgEstablishedDateGreaterThanOrderByOrgEstablishedDate(date),HttpStatus.OK);
    }

}
