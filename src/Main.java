import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Создать модель
        List<Vertex> vertices = new ArrayList<>();
        vertices.add(new Vertex(0, 0, 0));
        vertices.add(new Vertex(1, 0, 0));
        vertices.add(new Vertex(0, 1, 0));
        vertices.add(new Vertex(1, 1, 0));

        List<Polygon> polygons = new ArrayList<>();
        polygons.add(new Polygon(List.of(0, 1, 2)));
        polygons.add(new Polygon(List.of(1, 2, 3)));
        polygons.add(new Polygon(List.of(4, 5, 6)));

        Model model = new Model(vertices, polygons);

        // Получить от пользователя номера вершин для удаления
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номера вершин для удаления (через запятую): ");
        String input = scanner.nextLine();
        String[] vertexIndicesStr = input.split(",");
        List<Integer> verticesToRemove = new ArrayList<>();
        for (String indexStr : vertexIndicesStr) {
            verticesToRemove.add(Integer.parseInt(indexStr.trim()));
        }

        // Удалить выбранные вершины и связанные полигоны
        for (int vertexIndex : verticesToRemove) {
            model.removeVertex(vertexIndex);
        }

        // Вывести результат
        System.out.println("Оставшиеся вершины: " + model.vertices);
        System.out.println("Оставшиеся полигоны: " + model.polygons);
    }
}

