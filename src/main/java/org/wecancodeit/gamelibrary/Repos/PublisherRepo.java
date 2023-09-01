package org.wecancodeit.gamelibrary.Repos;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.gamelibrary.Models.PublisherModel;

public interface PublisherRepo extends CrudRepository<PublisherModel, Long> {
    PublisherModel findByName(String name);
}
