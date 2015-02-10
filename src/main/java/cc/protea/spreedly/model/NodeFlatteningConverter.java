package cc.protea.spreedly.model;

import org.simpleframework.xml.convert.Converter;
import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;

import java.util.HashMap;
import java.util.Map;

public class NodeFlatteningConverter implements Converter<Map<String, String>> {

    @Override
    public Map<String, String> read(InputNode inputNode) throws Exception {

        final InputNode firstChild = inputNode.getNext();
        Map<String, String> output = new HashMap<String, String>();

        if (firstChild != null) {
            InputNode node;

            while ((node = firstChild.getNext()) != null) {
                output.put(node.getName(), node.getValue());
            }
        }

        return output;
    }

    @Override
    public void write(OutputNode outputNode, Map<String, String> stringStringMap) throws Exception {
        // We don't ever need to write this, so I'm not implementing it
    }
}
