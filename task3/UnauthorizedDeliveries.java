package task3;

import com.opencsv.CSVReader;
import org.hibernate.Session;
import org.hibernate.Transaction;
import task3.models.Logins;
import task3.models.Posting;

import java.io.FileReader;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;


public class UnauthorizedDeliveries {

    public static void main(String[] args) throws Exception {

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        Map<String, Logins> logins = new HashMap<String, Logins>();
        CSVReader readerLog = new CSVReader(new FileReader(args[1]), ',', '"', '\t', 1);
        String[] loginLine;

        while ((loginLine = readerLog.readNext()) != null) {
            Logins.Builder builder = Logins.newBuilder()
                    .setApplication(loginLine[0])
                    .setAppAccountName(loginLine[1])
                    .setIsActive(Boolean.parseBoolean(loginLine[2].toLowerCase()))
                    .setJobTitle(loginLine[3])
                    .setDepartment(loginLine[4]);

            Logins login = builder.build();
            logins.put(login.getAppAccountName(), login);
            Transaction transaction = null;

        }

        Map<String, List<Posting>> posting = new HashMap<>();
        CSVReader reader = new CSVReader(new FileReader(args[0]), ';', '"', '\t', 1);
        String[] postingLine;
        while ((postingLine = reader.readNext()) != null) {

            postingLine[7] = postingLine[7].replace(',', '.');
            Posting.Builder builder = Posting.newBuilder()
                    .setMatDoc(postingLine[0])
                    .setItem(Integer.parseInt(postingLine[1]))
                    .setDocDate(LocalDate.parse(postingLine[2], df))
                    .setPostingDate(LocalDate.parse(postingLine[3], df))
                    .setMatDescription(postingLine[4])
                    .setQuantity(Integer.parseInt(postingLine[5]))
                    .setBun(postingLine[6])
                    .setAmountLC(BigDecimal.valueOf(Double.parseDouble(postingLine[7])))
                    .setCrcy(postingLine[8])
                    .setUserName(postingLine[9]);

            Posting postingOne = builder.build();
            if (logins.containsKey(postingOne.getUserName()) && logins.get(postingOne.getUserName()).getisActive()) {
                postingOne.setAuthorizedDelivery(true);
            } else {
                postingOne.setAuthorizedDelivery(false);
            }

            List<Posting> list;
            if (posting.containsKey(postingOne.getUserName())) {
                list = posting.get(postingOne.getUserName());
            } else {
                list = new ArrayList<>();
            }
            list.add(postingOne);
            posting.put(postingOne.getUserName(), list);

        }

    }


}



