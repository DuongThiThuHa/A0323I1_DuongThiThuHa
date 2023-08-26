package Furama.until;

import Furama.model.Customer;
import Furama.validate.Validate;

import java.io.*;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class ReadAndWriteCustomer {
    private static final String FILE_PATH = "D:\\CodeGym\\TranNhatLong-A1222I1_Md2\\src\\Furama\\data\\Customer.csv";

    public static List<Customer> readCSV() throws IOException {
        List<Customer> customers = new LinkedList<>();
        FileReader fileReader = new FileReader(FILE_PATH);
        BufferedReader buff = new BufferedReader(fileReader);

        String line;
        String[] temp;
        Customer cus;

        while ((line = buff.readLine()) != null) {
            temp = line.split(",");
            String id = temp[0];
            String name = temp[1];
            LocalDate age = Validate.dateInputDOB(temp[2]);
            String sex = temp[3];
            String address = temp[4];
            String idCard = temp[5];
            String email = temp[6];
            String tyle = temp[7];
            cus = new Customer(id, name, age, sex, address, idCard, email, tyle);
            customers.add(cus);
        }
        buff.close();
        return customers;
    }

    public static void writeCSV(List<Customer> customerList) throws IOException {
        FileWriter fileWriter = new FileWriter(FILE_PATH, false);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Customer customer : customerList) {
            bufferedWriter.write(customer.getId() + "," + customer.getName() + "," + customer.getAge() + "," + customer.getSex() +
                    "," + customer.getAddress() + "," + customer.getIdCard() + "," + customer.getEmail() + "," + customer.getTyle() + "\n");

        }
        bufferedWriter.close();

    }
}
