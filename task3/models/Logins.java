package task3.models;

import javax.persistence.*;

@Entity
@Table
public class Logins {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String application;
    private String appAccountName;
    private boolean isActive;
    private String jobTitle;
    private String department;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getApplication() {
        return application;
    }

    public String getAppAccountName() {
        return appAccountName;
    }

    public boolean getisActive() {
        return isActive;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getDepartment() {
        return department;
    }

    public static Logins.Builder newBuilder() {
        return new Logins().new Builder();
    }


    public class Builder {

        private Builder() {

        }

        public Builder setApplication(String application) {
            Logins.this.application = application;
            return this;
        }

        public Builder setAppAccountName(String appAccountName) {
            Logins.this.appAccountName = appAccountName;
            return this;
        }

        public Builder setIsActive(boolean isActive) {
            Logins.this.isActive = isActive;
            return this;
        }

        public Builder setJobTitle(String jobTitle) {
            Logins.this.jobTitle = jobTitle;
            return this;
        }

        public Builder setDepartment(String department) {
            Logins.this.department = department;
            return this;
        }

        public Logins build() {
            return Logins.this;
        }
    }
}
