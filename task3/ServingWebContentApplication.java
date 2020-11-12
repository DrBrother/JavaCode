package task3;

import com.opencsv.CSVReader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileInputStream;
import java.io.FileReader;


@SpringBootApplication
public class ServingWebContentApplication {

    public static void main(String[] args) throws Exception {




        UnauthorizedDeliveries.main(args);

        SpringApplication.run(ServingWebContentApplication.class, args);


    }



}