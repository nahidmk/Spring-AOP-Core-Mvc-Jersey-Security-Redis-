package bd.edu.seu.rediscashwithmongodb.Controller;

import bd.edu.seu.rediscashwithmongodb.Model.Course;
import bd.edu.seu.rediscashwithmongodb.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping("/course")
    public Course SaveCourse(@RequestBody Course course)
    {
        return courseService.SaveCourse(course);
    }

    @GetMapping("/course")
    public List<Course> FindAllCourse()
    {
        return courseService.FindAllCourse();
    }

    @GetMapping("/course/{code}")
    public Optional<Course> GetCourseByCode( @PathVariable String code)
    {
        return courseService.getCourseByCourseCode(code);
    }
    @PutMapping("/course")
    public Optional<Course> UpdateCourse(@RequestBody Course course)
    {
        return courseService.UpdateCourse(course);
    }
    @DeleteMapping("/course/{code}")
    public Optional<Course> DeleteCourse(@PathVariable String code)
    {
        return courseService.DeleteCourse(code);
    }

}
