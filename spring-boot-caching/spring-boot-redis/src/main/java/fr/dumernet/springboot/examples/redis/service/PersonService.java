package fr.dumernet.springboot.examples.redis.service;

import fr.dumernet.springboot.examples.redis.model.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@CacheConfig(cacheNames = "person")
@Service
@Slf4j
public class PersonService {

    @Cacheable
    public Person findById(long id) {
        log.info("findById {}", id);
        return Person.builder().id(id).name("person_" + id).build();
    }

    @CacheEvict(allEntries = true)
    public void clearAll() {
        log.info("clearAll");
    }

    @CacheEvict
    public void clearById(long id) {
        log.info("clearById {}", id);
    }

    @CachePut
    public Person updateById(long id) {
        log.info("updateById {}", id);
        return Person.builder().id(id).name("person_v2_" + id).build();
    }

}
