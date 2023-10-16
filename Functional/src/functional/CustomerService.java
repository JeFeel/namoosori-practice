package functional;


import java.util.ArrayList;
import java.util.List;


public class CustomerService {
    private final List<Customer> customers;

    public CustomerService() {
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer newCustomer){
        this.customers.add(newCustomer);
    }

    public List<Customer> searchCustomersByLocation(String location){
        List<Customer> foundCustomers = new ArrayList<>();
        for (Customer customer : customers) {
            if (customer.getLocation().equals(location)){
                foundCustomers.add(customer);
            }
        }
        return foundCustomers;
    }

    // 여러 조건들을 하나의 메서드로 정리하기 위해 이하의 같이 정리
    // 그러나 중복 코드의 발생은 막지 못함
    public List<Customer> searchCustomersBy(SearchOption option, String searchValue){
        List<Customer> foundCustomers = new ArrayList<>();
        for (Customer customer : customers) {
            if(option.equals(SearchOption.LOCATION)){
                if (customer.getLocation().equals(searchValue)) {
                    foundCustomers.add(customer);
                }
            }else if(option.equals(SearchOption.GENDER)){
                if (customer.getGender().toString().equals(searchValue)){
                    foundCustomers.add(customer);
                }
            }
        }
        return foundCustomers;
    }
}
