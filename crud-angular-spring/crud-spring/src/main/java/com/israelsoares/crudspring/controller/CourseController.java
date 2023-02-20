package com.israelsoares.crudspring.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.israelsoares.crudspring.model.Course;
import com.israelsoares.crudspring.repository.CourseRepository;

@RestController
@RequestMapping("/api/courses")
// @AllArgsConstructor Fazer injecao de dependencai vai lombok
// @Component para gerencie o ciclo de vida como um componente
public class CourseController {

    // @Autowired fazer injeção de dependencia (usar o objeto sem se preocupar com a
    // implementacao) ou DI via setters
    private final CourseRepository courseRepository;

    public CourseController(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    // @RequestMapping(method = RequestMethod.GET) msm coisa que o GetMapping
    @GetMapping
    public List<Course> list() {
        //public @ResponseBody List<Course> list() a lista é um response body e essa éa marcação no spring FasterXML responsável pelo Marshalling and Unmarshalling
        return courseRepository.findAll();
    };
  //  “Unmarshalling” is the process of converting some kind of a lower-level representation, often a “wire format”, into a higher-level (object) structure. Other popular names for it are “Deserialization” or “Unpickling”.
}