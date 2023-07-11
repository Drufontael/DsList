package com.drufontael.dslist.dto;

import com.drufontael.dslist.entities.Game;
import jakarta.persistence.Column;

public class GameMinDTO {
    private Long id;
    private String title;
    private Integer year;
    private  String imgUrl;
    private String shortDescription;

    public GameMinDTO() {
    }

    public GameMinDTO(Game entities) {
        this.id = entities.getId();
        this.title = entities.getTitle();
        this.year = entities.getYear();
        this.imgUrl = entities.getImgUrl();
        this.shortDescription = entities.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
