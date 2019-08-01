import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path="/user")
public class MailController {
    @Autowired
    EmployeeDAO employeeDAO;

    // to test service is up and running
    @GetMapping
    public String check() {
        return "Welcome to Java Inspires";
    }

    @GetMapping(path = "/addemployee")
//    @ResponseBody
    public String addemployee(@RequestParam int id, @RequestParam String firstName, @RequestParam String lastName, @RequestParam String address) {
        Employee emp = new Employee(id, firstName, lastName, address);
        employeeDAO.addEmplyeeUsingExecuteMethod(emp);
        return "Add successful :'>";
    }

    @GetMapping(path = "/addEmployee")
    public String add() {
        Employee emp = null;
        employeeDAO.addEmplyeeUsingExecuteMethod(emp);
        return "Add successful !!!";
    }

    /**
     * this method return list of usernames
     *
     * @return usernameList
     */
    @GetMapping(path = "/getallemployee")
    public List<Employee> get() {
        return employeeDAO.getEmployee(int i);
    }
}

