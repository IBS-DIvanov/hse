package ibs_order;

import ibs_order.repos.*;
import ibs_order.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@Controller
public class GreetingController {
    @Autowired
    private ActRepo actRepo;

//    @Autowired
//    private GreetingController(ActRepo actRepo) {
//        this.actRepo = actRepo;
//    }
    @Autowired
    private AssignmentRepo assignmentRepo;
    @Autowired
    private CompanyRepo companyRepo;
    @Autowired
    private ContractorRepo contractorRepo;
    @Autowired
    private CustomerRepo customerRepo;
    @Autowired
    private CustomerStatusRepo customerStatusRepo;
    @Autowired
    private OrderActTableRepo orderActTableRepo;
    @Autowired
    private OrderAssignmentTableRepo orderAssignmentTableRepo;
    @Autowired
    private OrderRepo orderRepo;
    @Autowired
    private OrderTypeRepo orderTypeRepo;
    @Autowired
    private PositionRepo positionRepo;


    @GetMapping("/greeting")
    public String greeting(
            @RequestParam(name="name", required=false, defaultValue="World") String name,
            Map<String, Object> model
    ) {
        model.put("name", name);
        Act act = new Act();
        return "greeting";
    }

//    @RequestMapping("/")
//    public String greeting(){
//        return "hello";
//    }

    @GetMapping("/main")
    public String main(Map<String, Object> model) {

        return "main";
    }

    @RequestMapping("/")
    public String orders(Model model){
        Iterable<Order> orders = orderRepo.findAll();
        model.addAttribute("orders", orders);
        return "orders";
    }

    @GetMapping("/acts")
    public String acts(Map<String, Object> model){
        Iterable<Act> acts = actRepo.findAll();
        model.put("acts", acts);
        return "acts";
    }

    @GetMapping("/assignments")
    public String assignments(Map<String, Object> model){
        Iterable<Assignment> assignments = assignmentRepo.findAll();
        model.put("assignments", assignments);
        return "assignments";
    }

    @GetMapping("/companies")
    public String companies(Map<String, Object> model){
        Iterable<Company> companies = companyRepo.findAll();
        model.put("companies", companies);
        return "companies";
    }

    @GetMapping("/contractors")
    public String contractors(Map<String, Object> model){
        Iterable<Contractor> contractors = contractorRepo.findAll();
        model.put("contractors", contractors);
        return "contractors";
    }

    @GetMapping("/customers")
    public String customers(Map<String, Object> model){
        Iterable<Customer> customers = customerRepo.findAll();
        model.put("customers", customers);
        return "customers";
    }

    @GetMapping("/customerStatuses")
    public String customerStatuses(Map<String, Object> model){
        Iterable<CustomerStatus> customerStatuses = customerStatusRepo.findAll();
        model.put("customerStatuses", customerStatuses);
        return "customerStatuses";
    }

    @GetMapping("/orderActTables")
    public String orderActTables(Map<String, Object> model){
        Iterable<OrderActTable> orderActTables = orderActTableRepo.findAll();
        model.put("orderActTables", orderActTables);
        return "orderActTables";
    }

    @GetMapping("/orderAssignmentTables")
    public String orderAssignmentTables(Map<String, Object> model){
        Iterable<OrderAssignmentTable> orderAssignmentTables = orderAssignmentTableRepo.findAll();
        model.put("orderAssignmentTables", orderAssignmentTables);
        return "orderAssignmentTables";
    }

    @GetMapping("/orders2")
    public String orders2(Map<String, Object> model){

        Order order = new Order();
        order.setName("Hello Kitty");
        order.setId(0);
        order.setNumber("1000");
        order.setRegistration_date(new GregorianCalendar(10,Calendar.FEBRUARY, 2012).getTime());
        orderRepo.save(order);
        return "orders";
    }

    @GetMapping("/orderTypes")
    public String orderTypes(Map<String, Object> model){
        Iterable<OrderType> orderTypes = orderTypeRepo.findAll();
        model.put("orderTypes", orderTypes);
        return "orderTypes";
    }

    @GetMapping("/positions")
    public String positions(Map<String, Object> model){
        Iterable<Position> positions = positionRepo.findAll();
        model.put("positions", positions);
        return "positions";
    }
}
