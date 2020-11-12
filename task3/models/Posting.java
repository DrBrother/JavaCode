package task3.models;

import org.springframework.context.ApplicationEvent;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table
public class Posting  {



    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;

    private String matDoc;
    private int item;
    private LocalDate docDate;
    private LocalDate postingDate;
    private String matDescription;
    private int quantity;
    private String bun;
    private BigDecimal amountLC;
    private String crcy;
    private String userName;
    private Boolean authorizedDelivery;






    public String getMatDoc() {
        return matDoc;
    }

    public int getItem() {
        return item;
    }

    public LocalDate getDocDate() {
        return docDate;
    }

    public LocalDate getPostingDate() {
        return postingDate;
    }

    public String getMatDescription() {
        return matDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getBun() {
        return bun;
    }

    public BigDecimal getAmountLC() {
        return amountLC;
    }

    public String getCrcy() {
        return crcy;
    }

    public String getUserName() {
        return userName;
    }

    public boolean isAuthorizedDelivery() {
        return authorizedDelivery;
    }

    public void setAuthorizedDelivery(Boolean authorizedDelivery) {
        this.authorizedDelivery = authorizedDelivery;
    }

    public static Builder newBuilder() {
        return new Posting().new Builder();
    }

    public class Builder {

        private Builder() {

        }

        public Builder setMatDoc(String matDoc) {
            Posting.this.matDoc = matDoc;
            return this;
        }

        public Builder setItem(int item) {
            Posting.this.item = item;
            return this;
        }

        public Builder setDocDate(LocalDate docDate) {
            Posting.this.docDate = docDate;
            return this;
        }

        public Builder setPostingDate(LocalDate postingDate) {
            Posting.this.postingDate = postingDate;
            return this;
        }

        public Builder setMatDescription(String matDescription) {
            Posting.this.matDescription = matDescription;
            return this;
        }

        public Builder setQuantity(int quantity) {
            Posting.this.quantity = quantity;
            return this;
        }

        public Builder setBun(String bun) {
            Posting.this.bun = bun;
            return this;
        }

        public Builder setAmountLC(BigDecimal amountLC) {
            Posting.this.amountLC = amountLC;
            return this;
        }

        public Builder setCrcy(String crcy) {
            Posting.this.crcy = crcy;
            return this;
        }

        public Builder setUserName(String userName) {
            Posting.this.userName = userName;
            return this;
        }

        public Builder setAuthorizedDelivery(Boolean authorizedDelivery) {
            Posting.this.authorizedDelivery = authorizedDelivery;
            return this;
        }

        public Posting build() {
            return Posting.this;
        }
    }

    @Override
    public String toString() {
        return "Posting{" +
                "matDoc='" + matDoc + '\'' +
                ", item=" + item +
                ", docDate=" + docDate +
                ", postingDate=" + postingDate +
                ", matDescription='" + matDescription + '\'' +
                ", quantity=" + quantity +
                ", bun='" + bun + '\'' +
                ", amountLC=" + amountLC +
                ", crcy='" + crcy + '\'' +
                ", userName='" + userName + '\'' +
                ", authorizedDelivery=" + authorizedDelivery +
                '}';
    }


}


