package py.com.jvillagra.ppmtool.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import py.com.jvillagra.ppmtool.domain.Project;
import py.com.jvillagra.ppmtool.repositories.ProjectRepository;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdateProject(Project project){
        //Logic
        return projectRepository.save(project);
    }
}
