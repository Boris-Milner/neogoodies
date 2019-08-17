package testing;

import java.util.List;
import java.util.Map;

class NodeDetails {
    int howMany;
    Map<String, String> properties;
    List<String> additionalLabels;
}

public class GraphYamlTemplate {
    String name;
    String comments;
    List<Map<String, NodeDetails>> nodes;
    List<Map<String, Object>> relationships;
    List<Map<String, Map<String, String>>> customProperties;

//    public GraphYamlTemplate(String name, String comments, List<Map<String, NodeDetails>> nodes, RelationsDetails relationships, List<Map<String, Map<String, String>>> customProperties) {
//        this.name = name;
//        this.comments = comments;
//        this.nodes = nodes;
//        this.relationships = relationships;
//        this.customProperties = customProperties;
//    }
}
