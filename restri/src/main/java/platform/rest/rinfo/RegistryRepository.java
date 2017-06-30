/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package platform.rest.rinfo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author oleg
 */
@RepositoryRestResource(path = "registry")
public interface RegistryRepository extends CrudRepository<Registry, Long> {
    
}
