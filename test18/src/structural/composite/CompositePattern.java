package structural.composite;

import java.util.ArrayList;
import java.util.List;
//Composite Pattern : ������ �ܰ迡���� �ƴ� ��Ÿ�� �ܰ迡�� ���� ����̳� ����� ������ �� �ִٴ� ������ �������� ���� ���� ����
//�׷��Ƿ�, ���� ���� ��ü��� ������ ���� ��ü�� ���� ��ü�� Ŭ���̾�Ʈ���� �����ϰ� ����ϴ� �����̴�.
public class CompositePattern {

	public static void main(String[] args) {
        Shape tri = new Triangle();
        Shape tri1 = new Triangle();
        Shape cir = new Circle();
		
        Drawing drawing = new Drawing();
        drawing.add(tri1);
        drawing.add(tri1);
        drawing.add(cir);
		
        drawing.draw("Red");
		
        List<Shape> shapes = new ArrayList<>();
        shapes.add(drawing);
        shapes.add(new Triangle());
        shapes.add(new Circle());
        
        for(Shape shape : shapes) {
            shape.draw("Green");
        }
	}

}