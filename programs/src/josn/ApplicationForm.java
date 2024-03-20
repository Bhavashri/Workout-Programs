package josn;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
//import javax.annotation.Generated;

@javax.annotation.processing.Generated("jsonschema2pojo")
public class ApplicationForm {
	 private String title;
	    private List<Section> sections;
	    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

	    public String getTitle() {
	        return title;
	    }

	    public void setTitle(String title) {
	        this.title = title;
	    }

	    public List<Section> getSections() {
	        return sections;
	    }

	    public void setSections(List<Section> sections) {
	        this.sections = sections;
	    }

	    public Map<String, Object> getAdditionalProperties() {
	        return this.additionalProperties;
	    }

	    public void setAdditionalProperty(String name, Object value) {
	        this.additionalProperties.put(name, value);
	    }

}
