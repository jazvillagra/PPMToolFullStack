package py.com.jvillagra.ppmtool.repositories;

import org.springframework.data.repository.CrudRepository;
import py.com.jvillagra.ppmtool.domain.Project;

public interface ProjectRepository extends CrudRepository<Project, Long> {

    @Override
    Iterable<Project> findAllById(Iterable<Long> iterable);

}
