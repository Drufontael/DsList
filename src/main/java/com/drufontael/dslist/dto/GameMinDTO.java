package com.drufontael.dslist.dto;

import com.drufontael.dslist.entities.Game;
import com.drufontael.dslist.projections.GameMinProjection;

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
    public GameMinDTO(GameMinProjection projection) {
        this.id = projection.getId();
        this.title = projection.getTitle();
        this.year = projection.getYear();
        this.imgUrl = projection.getImgUrl();
        this.shortDescription = projection.getShortDescription();
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
