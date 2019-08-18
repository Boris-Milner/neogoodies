package testing;

import java.util.List;
import java.util.Map;

public class GraphYamlTemplate {
    public String name;
    public String comments;
    public List<NodeDetails> nodes;
    public List<Map<String, Object>> relationships;
    public List<Map<String, String>> customProperties;
}
