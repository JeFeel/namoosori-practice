package functional;


import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class CustomerService {

    private final List<Customer> customers;

    public CustomerService() {
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer newCustomer) {
        this.customers.add(newCustomer);
    }

//    public List<Customer> searchCustomersByLocation(String location){
//        List<Customer> foundCustomers = new ArrayList<>();
//        for (Customer customer : customers) {
//            if (customer.getLocation().equals(location)){
//                foundCustomers.add(customer);
//            }
//        }
//        return foundCustomers;
//    }
//
//    // 여러 조건들을 하나의 메서드로 정리하기 위해 이하의 같이 정리
//    // 그러나 중복 코드의 발생은 막지 못함
//    public List<Customer> searchCustomersBy(SearchOption option, String searchValue){
//        List<Customer> foundCustomers = new ArrayList<>();
//        for (Customer customer : customers) {
//            if(option.equals(SearchOption.LOCATION)){
//                if (customer.getLocation().equals(searchValue)) {
//                    foundCustomers.add(customer);
//                }
//            }else if(option.equals(SearchOption.GENDER)){
//                if (customer.getGender().toString().equals(searchValue)){
//                    foundCustomers.add(customer);
//                }
//            }
//        }
//        return foundCustomers;
//    }

    // 인터페이스를 통한 검색 메소드
    // 이 메소드로 인해 위의 메소드들은 불필요
    public List<Customer> searchCustomers(SearchFilter filter) {
        List<Customer> foundCustomers = new ArrayList<>();
        for (Customer customer : customers) {
            if (filter.isMatched(customer)) {
                foundCustomers.add(customer);
            }
        }
        return foundCustomers;
    }
}
