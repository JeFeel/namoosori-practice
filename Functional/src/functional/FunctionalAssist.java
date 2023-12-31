package functional;


import java.util.List;


public class FunctionalAssist {

    public static void main(String[] args) {
        CustomerService service = new CustomerService();
        initData(service);

        // 요구사항 1 : 지역으로 검색
        List<Customer> result;
//        service.searchCustomersByLocation("서울");
//        for (Customer customer : result) {
//            System.out.println(customer);
//        }

        // 요구사항 2 : 성별로 검색
        // 유사한 코드가 또 나오게 됨

        // 하나의 메소드에 정리
//        result = service.searchCustomersBy(SearchOption.LOCATION, "광주");

        result = service.searchCustomers(new SearchFilter() { // 익명 클래스
            @Override
            public boolean isMatched(Customer customer) {
                return customer.getLocation().equals("서울");
            }
        });
        // 람다 적용 예시
//        result = service.searchCustomers( customer -> customer.getGender().equals(Gender.FEMALE));

        // 더 자세한 필터 예시
        result = service.searchCustomers(customer -> customer.getLocation().equals("부산") &&
                customer.getGender().equals(Gender.MALE));

        for (Customer customer : result) {
            System.out.println(customer);
        }

    }

    private static void initData(CustomerService service) {
        service.addCustomer(new Customer("CUS01", "서울", Gender.MALE, 30));
        service.addCustomer(new Customer("CUS02", "부산", Gender.FEMALE, 50));
        service.addCustomer(new Customer("CUS03", "서울", Gender.MALE, 20));
        service.addCustomer(new Customer("CUS04", "광주", Gender.FEMALE, 10));
        service.addCustomer(new Customer("CUS05", "인천", Gender.FEMALE, 34));
        service.addCustomer(new Customer("CUS06", "부산", Gender.MALE, 27));
    }
}
