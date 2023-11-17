
import java.util.List;
public class Polygon {
    List<Integer> vertexIndex;

    public Polygon(List<Integer> vertexIndex) {
        this.vertexIndex = vertexIndex;
    }

    public boolean containsVertex(int vertexIndex) {
        return this.vertexIndex.contains(vertexIndex);
    }
}
