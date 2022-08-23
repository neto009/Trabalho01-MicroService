import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.BaseRepoitory;

@RestController
public class BaseController {

    @Autowired
    private BaseRepoitory baseRepoitory;

    @GetMapping
    public List<Base> getEmployee() {
        return employeeRepository.findAll();
    }

    @PostMapping
    public Employee saveEmployee(@RequestBody Base employee) {
        return employeeRepository.save(employee);
    }

    @PutMapping
    public Employee updateEmployee(@RequestBody Employee employee) {
        if (employee != null && !employee.getId().isEmpty())
            return employeeRepository.save(employee);
        return null;
    }

    @DeleteMapping
    public void deleteEmployee(@RequestBody Employee employee) {
        if (employee != null && !employee.getId().isEmpty()) {
            employeeRepository.delete(employee);
        }
    }

}
