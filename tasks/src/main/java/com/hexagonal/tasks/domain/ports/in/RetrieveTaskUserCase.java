package com.hexagonal.tasks.domain.ports.in;

import org.hibernate.mapping.List;

public interface RetrieveTaskUserCase {
    Optional<Task> getTask(Long id);
    
    List<Task>getAllTask()
}
