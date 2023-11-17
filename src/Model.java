import java.util.ArrayList;
import java.util.List;
class Model {
    List<Vertex> vertices;
    List<Polygon> polygons;

    public Model(List<Vertex> vertices, List<Polygon> polygons) {
        this.vertices = vertices;
        this.polygons = polygons;
    }

    public void removeVertex(int vertexIndex) {
        // Удалить вершину
        this.vertices.remove(vertexIndex);

        // Удалить полигоны, содержащие эту вершину
        List<Polygon> polygonsToRemove = new ArrayList<>();
        for (Polygon polygon : this.polygons) {
            if (polygon.containsVertex(vertexIndex)) {
                polygonsToRemove.add(polygon);
            }
        }
        this.polygons.removeAll(polygonsToRemove);
    }
}