package com.school.project.schoolproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.project.schoolproject.entity.UnitiesEntity;
import com.school.project.schoolproject.service.UnitiesService;

@RestController
@RequestMapping ("/unities")


public class Unities {

    
        @Autowired
        UnitiesService unitiesService;

        @GetMapping

        public List<UnitiesEntity> getAllUnities() {
            return unitiesService.findAll();
        
        }

        @PostMapping

        public String saveUnites(@RequestBody UnitiesEntity und) {

            return "Unities Saved";
        }

        @DeleteMapping ("/{id}")

        public String deleteUnities(@PathVariable("id") long id) {

            unitiesService.deleteUnities(id);
            return "Unities Deleted";

        }

        @PutMapping ("/{id}")

        public String updateUnities(@PathVariable("id") long id, @RequestBody String name) {

            unitiesService.update(id, name);
            return "Unities Update Sucessfully";
        }


}


