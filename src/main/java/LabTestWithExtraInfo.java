import health_care_provider.HealthCareInfoProvider;
import health_care_provider.errors.InvalidIdException;
import health_care_provider.models.PersonInsured;

import java.time.LocalDate;

public class LabTestWithExtraInfo extends LabTest {
private LocalDate joinDate;
private int healthCareId;
private String healthCareName;

    public LabTestWithExtraInfo(LabTest l1) {
        super(l1);
        int idNum= Integer.parseInt(l1.getIdNum());
        int idType= Integer.parseInt(l1.getIdType());
        HealthCareInfoProvider healthCareInfoProvider=new HealthCareInfoProvider();
        try {
            PersonInsured personInsured=healthCareInfoProvider.fetchInfo(idNum,idType);
            this.joinDate= personInsured.getJoinDate();
            this.healthCareId= personInsured.getHealthCareId();
            this.healthCareName=personInsured.getHealthCareName();

        } catch (InvalidIdException e) {
            e.printStackTrace();
        }
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }

    public int getHealthCareId() {
        return healthCareId;
    }

    public void setHealthCareId(int healthCareId) {
        this.healthCareId = healthCareId;
    }

    public String getHealthCareName() {
        return healthCareName;
    }

    public void setHealthCareName(String healthCareName) {
        this.healthCareName = healthCareName;
    }






}
