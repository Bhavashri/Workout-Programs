package josn;
import java.util.LinkedHashMap;
import java.util.Map;
///import javax.annotation.Generated;

@javax.annotation.processing.Generated("jsonschema2pojo")
public class EmployeeDetailsJava {
	private ApplicationForm applicationForm;
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    public ApplicationForm getApplicationForm() {
        return applicationForm;
    }

    public void setApplicationForm(ApplicationForm applicationForm) {
        this.applicationForm = applicationForm;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}
