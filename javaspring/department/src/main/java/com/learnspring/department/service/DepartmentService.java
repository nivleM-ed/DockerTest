package com.learnspring.department.service;

import com.learnspring.department.entity.Department;
import com.learnspring.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("saveDepartment in DepartmentService");
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        log.info("findDepartmentById in DepartmentService");
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
