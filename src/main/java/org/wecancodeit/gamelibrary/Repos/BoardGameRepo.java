package org.wecancodeit.gamelibrary.Repos;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.gamelibrary.Models.BoardGameModel;

public interface BoardGameRepo extends CrudRepository<BoardGameModel, Long> {
    BoardGameModel findByName(String name);
}
