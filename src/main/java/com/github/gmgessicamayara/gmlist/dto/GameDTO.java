package com.github.gmgessicamayara.gmlist.dto;

import com.github.gmgessicamayara.gmlist.entities.Game;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GameDTO {
    private Long id;
    private String title;
    private String genre;
    private String platforms;
    private Double score;
    private Integer year;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    public GameDTO(Game game) {
        BeanUtils.copyProperties(game, this);
    }
}
