package py.com.jvillagra.ppmtool.repositories;

import org.springframework.data.repository.CrudRepository;
import py.com.jvillagra.ppmtool.domain.Project;

public interface ProjectRepository extends CrudRepository<Project, Long> {

    @Override
    Iterable<Project> findAllById(Iterable<Long> iterable);

    @Override
    Iterable<Project> findAll();

    Project findByProjectIdentifier(String projectId);

    Project update(String projectId);
}
