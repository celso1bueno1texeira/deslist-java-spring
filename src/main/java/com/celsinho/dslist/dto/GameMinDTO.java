package com.celsinho.dslist.dto;

import com.celsinho.dslist.entities.Game;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class GameMinDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;    
    private Integer year;    
    private String imgUrl;    
    private String shortDescription; 
    
    public GameMinDTO(){

    }
    
    public GameMinDTO( Game entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.year = entity.getYear();
        this.imgUrl = entity.getImgUrl();
        this.shortDescription = entity.getShortDescription();
    }


    public Long getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public Integer getYear() {
        return this.year;
    }

    
    public String getImgUrl() {
        return this.imgUrl;
    }

    public String getShortDescription() {
        return this.shortDescription;
    }
}
