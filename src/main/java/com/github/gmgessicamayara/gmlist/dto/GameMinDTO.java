package com.github.gmgessicamayara.gmlist.dto;

import com.github.gmgessicamayara.gmlist.entities.Game;
import com.github.gmgessicamayara.gmlist.projections.GameMinProjection;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GameMinDTO {
    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO(Game game) {
        id = game.getId();
        title = game.getTitle();
        year = game.getYear();
        imgUrl = game.getImgUrl();
        shortDescription = game.getShortDescription();
    }

    public GameMinDTO(GameMinProjection gameProjection) {
        id = gameProjection.getId();
        title = gameProjection.getTitle();
        year = gameProjection.getYear();
        imgUrl = gameProjection.getImgUrl();
        shortDescription = gameProjection.getShortDescription();
    }

}
